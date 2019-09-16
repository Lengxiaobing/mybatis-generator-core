package org.mybatis.generator.plugins;

import org.apache.commons.lang3.StringUtils;
import org.mybatis.generator.api.*;
import org.mybatis.generator.api.dom.DefaultJavaFormatter;
import org.mybatis.generator.api.dom.java.*;

import java.util.ArrayList;
import java.util.List;

import static org.mybatis.generator.internal.util.StringUtility.stringHasValue;
import static org.mybatis.generator.internal.util.messages.Messages.getString;

/**
 * BaseService自动生成插件
 */
public class MyServicePlugin extends PluginAdapter {
    //BaseService
    //ibatisData.base
    private String targetPackageBusinessService = "";
    //ibatisData.base.impl
    private String targetPackageBusinessServiceImpl = "";
    //D:\LHT\git\mybatis-generator-core\src\test\java
    private String targetBusinessServiceProject = "";
    //D:\LHT\git\mybatis-generator-core\src\test\java
    private String targetBusinessServiceImplProject = "";

    //Example
    private String searchString = "";
    //Criteria
    private String replaceString = "";

    @Override
    public boolean validate(List<String> warnings) {
        targetPackageBusinessService = properties.get("targetPackageBusinessService").toString();
        targetPackageBusinessServiceImpl = properties.get("targetPackageBusinessServiceImpl").toString();
        targetBusinessServiceProject = properties.get("targetBusinessServiceProject").toString();
        targetBusinessServiceImplProject = properties.get("targetBusinessServiceImplProject").toString();


        searchString = properties.get("searchString").toString();
        replaceString = properties.get("replaceString").toString();

        boolean valid = stringHasValue(targetPackageBusinessService)
                && stringHasValue(targetPackageBusinessServiceImpl)
                && stringHasValue(targetBusinessServiceProject)
                && stringHasValue(targetBusinessServiceImplProject)
                && stringHasValue(searchString)
                && stringHasValue(replaceString);

        if (!valid) {

            if (!stringHasValue(targetPackageBusinessService)) {
                warnings.add(getString("ValidationError.99", //$NON-NLS-1$
                        "MyServicePlugin", //$NON-NLS-1$
                        "targetPackageBaseService")); //$NON-NLS-1$
            }
            if (!stringHasValue(targetPackageBusinessServiceImpl)) {
                warnings.add(getString("ValidationError.99", //$NON-NLS-1$
                        "MyServicePlugin", //$NON-NLS-1$
                        "targetPackageBaseServiceImpl")); //$NON-NLS-1$
            }

            if (!stringHasValue(targetBusinessServiceProject)) {
                warnings.add(getString("ValidationError.99", //$NON-NLS-1$
                        "MyServicePlugin", //$NON-NLS-1$
                        "targetBaseServiceProject")); //$NON-NLS-1$
            }

            if (!stringHasValue(targetBusinessServiceImplProject)) {
                warnings.add(getString("ValidationError.99", //$NON-NLS-1$
                        "MyServicePlugin", //$NON-NLS-1$
                        "targetBusinessServiceImplProject")); //$NON-NLS-1$
            }

            if (!stringHasValue(searchString)) {
                warnings.add(getString("ValidationError.99", //$NON-NLS-1$
                        "MyServicePlugin", //$NON-NLS-1$
                        "searchString")); //$NON-NLS-1$
            }

            if (!stringHasValue(replaceString)) {
                warnings.add(getString("ValidationError.99", //$NON-NLS-1$
                        "MyServicePlugin", //$NON-NLS-1$
                        "replaceString")); //$NON-NLS-1$
            }
        }
        return valid;
    }


    @Override
    public List<GeneratedJavaFile> contextGenerateAdditionalJavaFiles(IntrospectedTable introspectedTable) {
        String recordType = introspectedTable.getBaseRecordType();
        String mapperType = introspectedTable.getMyBatis3JavaMapperType();
        List<IntrospectedColumn> introspectedColumns = introspectedTable.getPrimaryKeyColumns();
        String pk = "String";
        if (introspectedColumns != null && introspectedColumns.size() > 0) {
            pk = introspectedColumns.get(0).getFullyQualifiedJavaType().getFullyQualifiedName();
        }

        String exampleType = introspectedTable.getExampleType();
        List<GeneratedJavaFile> files = new ArrayList<GeneratedJavaFile>();
        files.add(generatedBaseServiceFile(recordType, exampleType, pk));
        files.add(generatedBaseServiceImplFile(recordType, exampleType, mapperType, pk));
        return files;
    }

    /**
     * 生成baseServiceImpl的实现
     *
     * @return
     */
    private GeneratedJavaFile generatedBaseServiceImplFile(String roecordType, String exampleType, String mapperType, String pk) {
        String currentName = roecordType.substring(roecordType.lastIndexOf(".") + 1, roecordType.length());
        String mapperName = mapperType.substring(mapperType.lastIndexOf(".") + 1, mapperType.length());
        //业务实现类的名称；如UserServiceImpl
        String baseServiceImpl = currentName + "ServiceImpl";

        FullyQualifiedJavaType serviceImplementType = new FullyQualifiedJavaType(targetPackageBusinessServiceImpl + "." + baseServiceImpl);
        TopLevelClass serviceImpl = new TopLevelClass(serviceImplementType);
        serviceImpl.setVisibility(JavaVisibility.PUBLIC);
        serviceImpl.addImportedType(new FullyQualifiedJavaType("java.util.List"));
        serviceImpl.addImportedType(new FullyQualifiedJavaType("org.springframework.beans.factory.annotation.Autowired"));
        serviceImpl.addImportedType(new FullyQualifiedJavaType(roecordType));
        serviceImpl.addImportedType(new FullyQualifiedJavaType(exampleType));
        serviceImpl.addImportedType(new FullyQualifiedJavaType(mapperType));
        serviceImpl.addImportedType(new FullyQualifiedJavaType(targetPackageBusinessService + "." + currentName + "Service"));

        //实现BaseService接口
        FullyQualifiedJavaType serviceInterfaceType = new FullyQualifiedJavaType(targetPackageBusinessService + "." + currentName + "Service");
        serviceImpl.addSuperInterface(serviceInterfaceType);

        /**
         * 添加抽象方法，注入BaseDao
         * public abstract BaseMapper<T, E, PK> getBaseMapper();
         */
        Method parentMethod = new Method();
        //声明业务的DAO层接口,并且使用@Autowired注入；如UserDao
        Field field = new Field();
        field.setName(StringUtils.uncapitalize(mapperName));
        field.setType(new FullyQualifiedJavaType(mapperName));
        field.setVisibility(JavaVisibility.PRIVATE);
        field.addAnnotation("@Autowired");
        serviceImpl.addField(field);

        //获取getBaseMapper方法名称
        String parentName = StringUtils.uncapitalize(mapperName);

        String example = "Example".replace(searchString, replaceString);
        String paramExample = example.toLowerCase();

        //开始实现BaseService中的方法
        Method method = new Method();
        method.setVisibility(JavaVisibility.PUBLIC);
        method.setReturnType(new FullyQualifiedJavaType("long"));
        method.setName("countBy" + example);
        method.addParameter(new Parameter(new FullyQualifiedJavaType(exampleType), paramExample));
        method.addBodyLine("return " + parentName + ".countBy" + example + "(" + paramExample + ");");
        // Spring 注解
        method.addAnnotation("@Override");
        serviceImpl.addMethod(method);

        method = new Method();
        method.setVisibility(JavaVisibility.PUBLIC);
        method.setReturnType(new FullyQualifiedJavaType("int"));
        method.setName("deleteBy" + example);
        method.addParameter(new Parameter(new FullyQualifiedJavaType(exampleType), paramExample));
        method.addBodyLine("return " + parentName + ".deleteBy" + example + "(" + paramExample + ");");
        method.addAnnotation("@Override");
        serviceImpl.addMethod(method);

        method = new Method();
        method.setVisibility(JavaVisibility.PUBLIC);
        method.setReturnType(new FullyQualifiedJavaType("int"));
        method.setName("deleteByPrimaryKey");
        method.addParameter(new Parameter(new FullyQualifiedJavaType(pk), "id"));
        method.addBodyLine("return " + parentName + ".deleteByPrimaryKey(id);");
        // Spring 注解
        method.addAnnotation("@Override");
        serviceImpl.addMethod(method);

        method = new Method();
        method.setVisibility(JavaVisibility.PUBLIC);
        method.setReturnType(new FullyQualifiedJavaType("int"));
        method.setName("insertSelective");
        method.addParameter(new Parameter(new FullyQualifiedJavaType(currentName), "record"));
        method.addBodyLine("return " + parentName + ".insertSelective(record);");
        method.addAnnotation("@Override");
        serviceImpl.addMethod(method);


        method = new Method();
        method.setVisibility(JavaVisibility.PUBLIC);
        method.setReturnType(new FullyQualifiedJavaType("int"));
        method.setName("insertBatchSelective");
        method.addParameter(new Parameter(new FullyQualifiedJavaType("List<" + currentName + ">"), "records"));
        method.addBodyLine("return " + parentName + ".insertBatchSelective(records);");
        method.addAnnotation("@Override");
        serviceImpl.addMethod(method);


        method = new Method();
        method.setVisibility(JavaVisibility.PUBLIC);
        method.setReturnType(new FullyQualifiedJavaType("List<" + currentName + ">"));
        method.setName("selectBy" + example);
        method.addParameter(new Parameter(new FullyQualifiedJavaType(exampleType), paramExample));
        method.addBodyLine("return " + parentName + ".selectBy" + example + "(" + paramExample + ");");
        method.addAnnotation("@Override");
        serviceImpl.addMethod(method);

        method = new Method();
        method.setVisibility(JavaVisibility.PUBLIC);
        method.setReturnType(new FullyQualifiedJavaType(currentName));
        method.setName("selectByPrimaryKey");
        method.addParameter(new Parameter(new FullyQualifiedJavaType(pk), "id"));
        method.addBodyLine("return " + parentName + ".selectByPrimaryKey(id);");
        method.addAnnotation("@Override");
        serviceImpl.addMethod(method);

        method = new Method();
        method.setVisibility(JavaVisibility.PUBLIC);
        method.setReturnType(new FullyQualifiedJavaType(currentName));
        method.setName("selectSingleBy" + example);
        method.addParameter(new Parameter(new FullyQualifiedJavaType(exampleType), paramExample));
        method.addBodyLine("return " + parentName + ".selectSingleBy" + example + "(" + paramExample + ");");
        method.addAnnotation("@Override");
        serviceImpl.addMethod(method);


        method = new Method();
        method.setVisibility(JavaVisibility.PUBLIC);
        method.setReturnType(new FullyQualifiedJavaType("int"));
        method.setName("updateBy" + example + "Selective");
        method.addParameter(new Parameter(new FullyQualifiedJavaType(currentName), "record"));
        method.addParameter(new Parameter(new FullyQualifiedJavaType(exampleType), paramExample));
        method.addBodyLine("return " + parentName + ".updateBy" + example + "Selective(record," + paramExample + ");");
        method.addAnnotation("@Override");
        serviceImpl.addMethod(method);

        method = new Method();
        method.setVisibility(JavaVisibility.PUBLIC);
        method.setReturnType(new FullyQualifiedJavaType("int"));
        method.setName("updateByPrimaryKeySelective");
        method.addParameter(new Parameter(new FullyQualifiedJavaType(currentName), "record"));
        method.addBodyLine("return " + parentName + ".updateByPrimaryKeySelective(record);");
        method.addAnnotation("@Override");
        serviceImpl.addMethod(method);

        //int updateBatchByPrimaryKeySelective(List<MaterialCopy> records);
        method = new Method();
        method.setVisibility(JavaVisibility.PUBLIC);
        method.setReturnType(new FullyQualifiedJavaType("int"));
        method.setName("updateBatchByPrimaryKeySelective");
        method.addParameter(new Parameter(new FullyQualifiedJavaType("List<" + currentName + ">"), "records"));
        method.addBodyLine("return " + parentName + ".updateBatchByPrimaryKeySelective(records);");
        method.addAnnotation("@Override");
        serviceImpl.addMethod(method);


        JavaFormatter javaFormatter = new DefaultJavaFormatter();
        javaFormatter.setContext(context);
        return new GeneratedJavaFile(serviceImpl, targetBusinessServiceImplProject, javaFormatter);
    }


    /**
     * 生成BaseService接口
     *
     * @return
     */
    private GeneratedJavaFile generatedBaseServiceFile(String roecordType, String exampleType, String pk) {
        //获取当前业务类型，如t_user，对应的实体是User,所以实际获取的是User
        String currentName = roecordType.substring(roecordType.lastIndexOf(".") + 1, roecordType.length());
        String exampleName = exampleType.substring(exampleType.lastIndexOf(".") + 1, exampleType.length());
        //拼接业务接口名称；如：UserService
        String baseServiceClass = currentName + "Service";

//        String baseServiceClass = name;
        FullyQualifiedJavaType serviceInterfaceType = new FullyQualifiedJavaType(targetPackageBusinessService + "." + baseServiceClass);
        Interface service = new Interface(serviceInterfaceType);
        service.setVisibility(JavaVisibility.PUBLIC);
        service.addImportedType(new FullyQualifiedJavaType("java.util.List"));
        service.addImportedType(new FullyQualifiedJavaType(roecordType));
        service.addImportedType(new FullyQualifiedJavaType(exampleType));


        // long countByExample(E example);
        String example = "Example".replace(searchString, replaceString);
        String paramExample = example.toLowerCase();
        Method method = new Method();
        method.setName("countBy" + example);
        method.setReturnType(new FullyQualifiedJavaType("long"));
        method.addParameter(new Parameter(new FullyQualifiedJavaType(exampleName), paramExample));
        service.addMethod(method);

        //int deleteByExample(E example);
        method = new Method();
        method.setName("deleteBy" + example);
        method.setReturnType(new FullyQualifiedJavaType("int"));
        method.addParameter(new Parameter(new FullyQualifiedJavaType(exampleName), paramExample));
        service.addMethod(method);

        //int deleteByPrimaryKey(PK id);
        method = new Method();
        method.setName("deleteByPrimaryKey");
        method.setReturnType(new FullyQualifiedJavaType("int"));
        method.addParameter(new Parameter(new FullyQualifiedJavaType(pk), "id"));
        service.addMethod(method);

        //int insertSelective(T record);
        method = new Method();
        method.setName("insertSelective");
        method.setReturnType(new FullyQualifiedJavaType("int"));
        method.addParameter(new Parameter(new FullyQualifiedJavaType(currentName), "record"));
        service.addMethod(method);

        //int insertBatchSelective(List<T> records)
        method = new Method();
        method.setName("insertBatchSelective");
        method.setReturnType(new FullyQualifiedJavaType("int"));
        method.addParameter(new Parameter(new FullyQualifiedJavaType("List<" + currentName + ">"), "records"));
        service.addMethod(method);

        //List<T> selectByExample(E example);
        method = new Method();
        method.setName("selectBy" + example);
        method.setReturnType(new FullyQualifiedJavaType("List<" + currentName + ">"));
        method.addParameter(new Parameter(new FullyQualifiedJavaType(exampleName), paramExample));
        service.addMethod(method);


        //T selectByPrimaryKey(PK id);
        method = new Method();
        method.setName("selectByPrimaryKey");
        method.setReturnType(new FullyQualifiedJavaType(currentName));
        method.addParameter(new Parameter(new FullyQualifiedJavaType(pk), "id"));
        service.addMethod(method);

        method = new Method();
        method.setName("selectSingleBy" + example);
        method.setReturnType(new FullyQualifiedJavaType(currentName));
        method.addParameter(new Parameter(new FullyQualifiedJavaType(exampleName), paramExample));
        service.addMethod(method);

        //int updateByExampleSelective(T record, E example);
        method = new Method();
        method.setName("updateBy" + example + "Selective");
        method.setReturnType(new FullyQualifiedJavaType("int"));
        method.addParameter(new Parameter(new FullyQualifiedJavaType(currentName), "record"));
        method.addParameter(new Parameter(new FullyQualifiedJavaType(exampleName), paramExample));
        service.addMethod(method);

        //int updateByPrimaryKeySelective(T record);
        method = new Method();
        method.setName("updateByPrimaryKeySelective");
        method.setReturnType(new FullyQualifiedJavaType("int"));
        method.addParameter(new Parameter(new FullyQualifiedJavaType(currentName), "record"));
        service.addMethod(method);

        //int updateBatchByPrimaryKeySelective(List<MaterialCopy> records);
        method = new Method();
        method.setName("updateBatchByPrimaryKeySelective");
        method.setReturnType(new FullyQualifiedJavaType("int"));
        method.addParameter(new Parameter(new FullyQualifiedJavaType("List<" + currentName + ">"), "records"));
        service.addMethod(method);

        JavaFormatter javaFormatter = new DefaultJavaFormatter();
        javaFormatter.setContext(context);
        return new GeneratedJavaFile(service, targetBusinessServiceProject, javaFormatter);
    }
}
