package com.mybatis.mapper;

import com.mybatis.SmUserCriteria;
import com.mybatis.domain.SmUser;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmUserMapper {
    /**
     * 通过组合条件统计<br>
     *
     * TABLE： sm_user<br>
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    long countByCriteria(SmUserCriteria criteria);

    /**
     * 通过组合条件删除，支持批量删除<br>
     *
     * TABLE： sm_user<br>
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    int deleteByCriteria(SmUserCriteria criteria);

    /**
     * 通过主键删除<br>
     *
     * TABLE： sm_user<br>
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    int deleteByPrimaryKey(Long userId);

    /**
     * 添加数据到<br>
     *
     * TABLE： sm_user<br>
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    int insertSelective(SmUser record);

    /**
     * 通过组合条件查询，支持分页;不返回大数据字段，如：text类型字段<br>
     *
     * TABLE： sm_user<br>
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    List<SmUser> selectByCriteria(SmUserCriteria criteria);

    /**
     * 通过主键查询<br>
     *
     * TABLE： sm_user<br>
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    SmUser selectByPrimaryKey(Long userId);

    /**
     * 通过组合条件更新<br>
     *
     * TABLE： sm_user<br>
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    int updateByCriteriaSelective(@Param("record") SmUser record, @Param("criteria") SmUserCriteria criteria);

    /**
     * 通过主键更新<br>
     *
     * TABLE： sm_user<br>
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    int updateByPrimaryKeySelective(SmUser record);

    SmUser selectSingleByCriteria(SmUserCriteria criteria);

    int insertBatchSelective(List<SmUser> records);

    int updateBatchByPrimaryKeySelective(List<SmUser> records);
}