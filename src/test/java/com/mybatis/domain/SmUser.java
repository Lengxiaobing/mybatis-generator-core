package com.mybatis.domain;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * TABLE:sm_user
 *
 * @mbg.generated 该代码为自动生成，请不要修改
 *
 * DATE: 2019-09-06 18:06
 */
public class SmUser implements Serializable {
    /**
     * 用户ID
     * sm_user.user_id
     */
    private Long userId;

    /**
     * 所属分公司 无分公司时填0
     * sm_user.company_id
     */
    private Long companyId;

    /**
     * 姓名
     * sm_user.user_name
     */
    private String userName;

    /**
     * 昵称
     * sm_user.nick_name
     */
    private String nickName;

    /**
     * 性别 0 保密 1 男 2女
     * sm_user.sex
     */
    private Integer sex;

    /**
     * 登录账号
     * sm_user.login_code
     */
    private String loginCode;

    /**
     * 电信系统工号
     * sm_user.worker_code
     */
    private String workerCode;

    /**
     * 用户来源1默认
     * sm_user.user_source
     */
    private Integer userSource;

    /**
     * 手机号码
     * sm_user.mobile
     */
    private String mobile;

    /**
     * 邮箱地址
     * sm_user.email
     */
    private String email;

    /**
     * 头像
     * sm_user.avatar_id
     */
    private Long avatarId;

    /**
     * 证件类型
     * sm_user.card_type
     */
    private Integer cardType;

    /**
     * 证件号码
     * sm_user.card_no
     */
    private String cardNo;

    /**
     * 省份ID
     * sm_user.province_id
     */
    private Long provinceId;

    /**
     * 省份
     * sm_user.province_name
     */
    private String provinceName;

    /**
     * 城市ID
     * sm_user.city_id
     */
    private Long cityId;

    /**
     * 城市
     * sm_user.city_name
     */
    private String cityName;

    /**
     * 区县ID
     * sm_user.area_id
     */
    private Long areaId;

    /**
     * 区县
     * sm_user.area_name
     */
    private String areaName;

    /**
     * 街道ID
     * sm_user.street_id
     */
    private Long streetId;

    /**
     * 街道
     * sm_user.street_name
     */
    private String streetName;

    /**
     * 详细地址
     * sm_user.addr
     */
    private String addr;

    /**
     * 职位 数据字典 
     * sm_user.position
     */
    private String position;

    /**
     * 工龄
     * sm_user.work_age
     */
    private String workAge;

    /**
     * 等级
     * sm_user.user_level
     */
    private String userLevel;

    /**
     * 职能
     * sm_user.user_function
     */
    private String userFunction;

    /**
     * 创建人
     * sm_user.create_by
     */
    private Long createBy;

    /**
     * 创建时间
     * sm_user.create_time
     */
    private Date createTime;

    /**
     * 修改人
     * sm_user.modi_by
     */
    private Long modiBy;

    /**
     * 修改时间
     * sm_user.modi_time
     */
    private Date modiTime;

    /**
     * 最后登录时间
     * sm_user.last_time
     */
    private Date lastTime;

    /**
     * 登录次数
     * sm_user.login_times
     */
    private Integer loginTimes;

    /**
     * 删除标志 0 未删除 1 已删除（移到回收站）2 彻底删除
     * sm_user.delete_mark
     */
    private Integer deleteMark;

    /**
     * TABLE： sm_user
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    private static final long serialVersionUID = 1L;

    /**
     * 用户ID<br>
     *
     * column：sm_user.user_id<br>
     * @return user_id
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 用户ID<br>
     *
     * column：sm_user.user_id<br>
     * @param userId
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 所属分公司 无分公司时填0<br>
     *
     * column：sm_user.company_id<br>
     * @return company_id
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public Long getCompanyId() {
        return companyId;
    }

    /**
     * 所属分公司 无分公司时填0<br>
     *
     * column：sm_user.company_id<br>
     * @param companyId
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    /**
     * 姓名<br>
     *
     * column：sm_user.user_name<br>
     * @return user_name
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 姓名<br>
     *
     * column：sm_user.user_name<br>
     * @param userName
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 昵称<br>
     *
     * column：sm_user.nick_name<br>
     * @return nick_name
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 昵称<br>
     *
     * column：sm_user.nick_name<br>
     * @param nickName
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * 性别 0 保密 1 男 2女<br>
     *
     * column：sm_user.sex<br>
     * @return sex
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 性别 0 保密 1 男 2女<br>
     *
     * column：sm_user.sex<br>
     * @param sex
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 登录账号<br>
     *
     * column：sm_user.login_code<br>
     * @return login_code
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public String getLoginCode() {
        return loginCode;
    }

    /**
     * 登录账号<br>
     *
     * column：sm_user.login_code<br>
     * @param loginCode
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public void setLoginCode(String loginCode) {
        this.loginCode = loginCode;
    }

    /**
     * 电信系统工号<br>
     *
     * column：sm_user.worker_code<br>
     * @return worker_code
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public String getWorkerCode() {
        return workerCode;
    }

    /**
     * 电信系统工号<br>
     *
     * column：sm_user.worker_code<br>
     * @param workerCode
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public void setWorkerCode(String workerCode) {
        this.workerCode = workerCode;
    }

    /**
     * 用户来源1默认<br>
     *
     * column：sm_user.user_source<br>
     * @return user_source
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public Integer getUserSource() {
        return userSource;
    }

    /**
     * 用户来源1默认<br>
     *
     * column：sm_user.user_source<br>
     * @param userSource
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public void setUserSource(Integer userSource) {
        this.userSource = userSource;
    }

    /**
     * 手机号码<br>
     *
     * column：sm_user.mobile<br>
     * @return mobile
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 手机号码<br>
     *
     * column：sm_user.mobile<br>
     * @param mobile
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 邮箱地址<br>
     *
     * column：sm_user.email<br>
     * @return email
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public String getEmail() {
        return email;
    }

    /**
     * 邮箱地址<br>
     *
     * column：sm_user.email<br>
     * @param email
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 头像<br>
     *
     * column：sm_user.avatar_id<br>
     * @return avatar_id
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public Long getAvatarId() {
        return avatarId;
    }

    /**
     * 头像<br>
     *
     * column：sm_user.avatar_id<br>
     * @param avatarId
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public void setAvatarId(Long avatarId) {
        this.avatarId = avatarId;
    }

    /**
     * 证件类型<br>
     *
     * column：sm_user.card_type<br>
     * @return card_type
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public Integer getCardType() {
        return cardType;
    }

    /**
     * 证件类型<br>
     *
     * column：sm_user.card_type<br>
     * @param cardType
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public void setCardType(Integer cardType) {
        this.cardType = cardType;
    }

    /**
     * 证件号码<br>
     *
     * column：sm_user.card_no<br>
     * @return card_no
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * 证件号码<br>
     *
     * column：sm_user.card_no<br>
     * @param cardNo
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    /**
     * 省份ID<br>
     *
     * column：sm_user.province_id<br>
     * @return province_id
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public Long getProvinceId() {
        return provinceId;
    }

    /**
     * 省份ID<br>
     *
     * column：sm_user.province_id<br>
     * @param provinceId
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }

    /**
     * 省份<br>
     *
     * column：sm_user.province_name<br>
     * @return province_name
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public String getProvinceName() {
        return provinceName;
    }

    /**
     * 省份<br>
     *
     * column：sm_user.province_name<br>
     * @param provinceName
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    /**
     * 城市ID<br>
     *
     * column：sm_user.city_id<br>
     * @return city_id
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public Long getCityId() {
        return cityId;
    }

    /**
     * 城市ID<br>
     *
     * column：sm_user.city_id<br>
     * @param cityId
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    /**
     * 城市<br>
     *
     * column：sm_user.city_name<br>
     * @return city_name
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * 城市<br>
     *
     * column：sm_user.city_name<br>
     * @param cityName
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    /**
     * 区县ID<br>
     *
     * column：sm_user.area_id<br>
     * @return area_id
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public Long getAreaId() {
        return areaId;
    }

    /**
     * 区县ID<br>
     *
     * column：sm_user.area_id<br>
     * @param areaId
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    /**
     * 区县<br>
     *
     * column：sm_user.area_name<br>
     * @return area_name
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public String getAreaName() {
        return areaName;
    }

    /**
     * 区县<br>
     *
     * column：sm_user.area_name<br>
     * @param areaName
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    /**
     * 街道ID<br>
     *
     * column：sm_user.street_id<br>
     * @return street_id
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public Long getStreetId() {
        return streetId;
    }

    /**
     * 街道ID<br>
     *
     * column：sm_user.street_id<br>
     * @param streetId
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public void setStreetId(Long streetId) {
        this.streetId = streetId;
    }

    /**
     * 街道<br>
     *
     * column：sm_user.street_name<br>
     * @return street_name
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * 街道<br>
     *
     * column：sm_user.street_name<br>
     * @param streetName
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    /**
     * 详细地址<br>
     *
     * column：sm_user.addr<br>
     * @return addr
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public String getAddr() {
        return addr;
    }

    /**
     * 详细地址<br>
     *
     * column：sm_user.addr<br>
     * @param addr
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public void setAddr(String addr) {
        this.addr = addr;
    }

    /**
     * 职位 数据字典 <br>
     *
     * column：sm_user.position<br>
     * @return position
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public String getPosition() {
        return position;
    }

    /**
     * 职位 数据字典 <br>
     *
     * column：sm_user.position<br>
     * @param position
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * 工龄<br>
     *
     * column：sm_user.work_age<br>
     * @return work_age
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public String getWorkAge() {
        return workAge;
    }

    /**
     * 工龄<br>
     *
     * column：sm_user.work_age<br>
     * @param workAge
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public void setWorkAge(String workAge) {
        this.workAge = workAge;
    }

    /**
     * 等级<br>
     *
     * column：sm_user.user_level<br>
     * @return user_level
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public String getUserLevel() {
        return userLevel;
    }

    /**
     * 等级<br>
     *
     * column：sm_user.user_level<br>
     * @param userLevel
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public void setUserLevel(String userLevel) {
        this.userLevel = userLevel;
    }

    /**
     * 职能<br>
     *
     * column：sm_user.user_function<br>
     * @return user_function
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public String getUserFunction() {
        return userFunction;
    }

    /**
     * 职能<br>
     *
     * column：sm_user.user_function<br>
     * @param userFunction
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public void setUserFunction(String userFunction) {
        this.userFunction = userFunction;
    }

    /**
     * 创建人<br>
     *
     * column：sm_user.create_by<br>
     * @return create_by
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public Long getCreateBy() {
        return createBy;
    }

    /**
     * 创建人<br>
     *
     * column：sm_user.create_by<br>
     * @param createBy
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    /**
     * 创建时间<br>
     *
     * column：sm_user.create_time<br>
     * @return create_time
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间<br>
     *
     * column：sm_user.create_time<br>
     * @param createTime
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 修改人<br>
     *
     * column：sm_user.modi_by<br>
     * @return modi_by
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public Long getModiBy() {
        return modiBy;
    }

    /**
     * 修改人<br>
     *
     * column：sm_user.modi_by<br>
     * @param modiBy
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public void setModiBy(Long modiBy) {
        this.modiBy = modiBy;
    }

    /**
     * 修改时间<br>
     *
     * column：sm_user.modi_time<br>
     * @return modi_time
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public Date getModiTime() {
        return modiTime;
    }

    /**
     * 修改时间<br>
     *
     * column：sm_user.modi_time<br>
     * @param modiTime
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public void setModiTime(Date modiTime) {
        this.modiTime = modiTime;
    }

    /**
     * 最后登录时间<br>
     *
     * column：sm_user.last_time<br>
     * @return last_time
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public Date getLastTime() {
        return lastTime;
    }

    /**
     * 最后登录时间<br>
     *
     * column：sm_user.last_time<br>
     * @param lastTime
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }

    /**
     * 登录次数<br>
     *
     * column：sm_user.login_times<br>
     * @return login_times
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public Integer getLoginTimes() {
        return loginTimes;
    }

    /**
     * 登录次数<br>
     *
     * column：sm_user.login_times<br>
     * @param loginTimes
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public void setLoginTimes(Integer loginTimes) {
        this.loginTimes = loginTimes;
    }

    /**
     * 删除标志 0 未删除 1 已删除（移到回收站）2 彻底删除<br>
     *
     * column：sm_user.delete_mark<br>
     * @return delete_mark
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public Integer getDeleteMark() {
        return deleteMark;
    }

    /**
     * 删除标志 0 未删除 1 已删除（移到回收站）2 彻底删除<br>
     *
     * column：sm_user.delete_mark<br>
     * @param deleteMark
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    public void setDeleteMark(Integer deleteMark) {
        this.deleteMark = deleteMark;
    }

    /**
     * <br>
     *
     * TABLE： sm_user<br>
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SmUser other = (SmUser) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getCompanyId() == null ? other.getCompanyId() == null : this.getCompanyId().equals(other.getCompanyId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getNickName() == null ? other.getNickName() == null : this.getNickName().equals(other.getNickName()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getLoginCode() == null ? other.getLoginCode() == null : this.getLoginCode().equals(other.getLoginCode()))
            && (this.getWorkerCode() == null ? other.getWorkerCode() == null : this.getWorkerCode().equals(other.getWorkerCode()))
            && (this.getUserSource() == null ? other.getUserSource() == null : this.getUserSource().equals(other.getUserSource()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getAvatarId() == null ? other.getAvatarId() == null : this.getAvatarId().equals(other.getAvatarId()))
            && (this.getCardType() == null ? other.getCardType() == null : this.getCardType().equals(other.getCardType()))
            && (this.getCardNo() == null ? other.getCardNo() == null : this.getCardNo().equals(other.getCardNo()))
            && (this.getProvinceId() == null ? other.getProvinceId() == null : this.getProvinceId().equals(other.getProvinceId()))
            && (this.getProvinceName() == null ? other.getProvinceName() == null : this.getProvinceName().equals(other.getProvinceName()))
            && (this.getCityId() == null ? other.getCityId() == null : this.getCityId().equals(other.getCityId()))
            && (this.getCityName() == null ? other.getCityName() == null : this.getCityName().equals(other.getCityName()))
            && (this.getAreaId() == null ? other.getAreaId() == null : this.getAreaId().equals(other.getAreaId()))
            && (this.getAreaName() == null ? other.getAreaName() == null : this.getAreaName().equals(other.getAreaName()))
            && (this.getStreetId() == null ? other.getStreetId() == null : this.getStreetId().equals(other.getStreetId()))
            && (this.getStreetName() == null ? other.getStreetName() == null : this.getStreetName().equals(other.getStreetName()))
            && (this.getAddr() == null ? other.getAddr() == null : this.getAddr().equals(other.getAddr()))
            && (this.getPosition() == null ? other.getPosition() == null : this.getPosition().equals(other.getPosition()))
            && (this.getWorkAge() == null ? other.getWorkAge() == null : this.getWorkAge().equals(other.getWorkAge()))
            && (this.getUserLevel() == null ? other.getUserLevel() == null : this.getUserLevel().equals(other.getUserLevel()))
            && (this.getUserFunction() == null ? other.getUserFunction() == null : this.getUserFunction().equals(other.getUserFunction()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getModiBy() == null ? other.getModiBy() == null : this.getModiBy().equals(other.getModiBy()))
            && (this.getModiTime() == null ? other.getModiTime() == null : this.getModiTime().equals(other.getModiTime()))
            && (this.getLastTime() == null ? other.getLastTime() == null : this.getLastTime().equals(other.getLastTime()))
            && (this.getLoginTimes() == null ? other.getLoginTimes() == null : this.getLoginTimes().equals(other.getLoginTimes()))
            && (this.getDeleteMark() == null ? other.getDeleteMark() == null : this.getDeleteMark().equals(other.getDeleteMark()));
    }

    /**
     * <br>
     *
     * TABLE： sm_user<br>
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getCompanyId() == null) ? 0 : getCompanyId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getNickName() == null) ? 0 : getNickName().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getLoginCode() == null) ? 0 : getLoginCode().hashCode());
        result = prime * result + ((getWorkerCode() == null) ? 0 : getWorkerCode().hashCode());
        result = prime * result + ((getUserSource() == null) ? 0 : getUserSource().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getAvatarId() == null) ? 0 : getAvatarId().hashCode());
        result = prime * result + ((getCardType() == null) ? 0 : getCardType().hashCode());
        result = prime * result + ((getCardNo() == null) ? 0 : getCardNo().hashCode());
        result = prime * result + ((getProvinceId() == null) ? 0 : getProvinceId().hashCode());
        result = prime * result + ((getProvinceName() == null) ? 0 : getProvinceName().hashCode());
        result = prime * result + ((getCityId() == null) ? 0 : getCityId().hashCode());
        result = prime * result + ((getCityName() == null) ? 0 : getCityName().hashCode());
        result = prime * result + ((getAreaId() == null) ? 0 : getAreaId().hashCode());
        result = prime * result + ((getAreaName() == null) ? 0 : getAreaName().hashCode());
        result = prime * result + ((getStreetId() == null) ? 0 : getStreetId().hashCode());
        result = prime * result + ((getStreetName() == null) ? 0 : getStreetName().hashCode());
        result = prime * result + ((getAddr() == null) ? 0 : getAddr().hashCode());
        result = prime * result + ((getPosition() == null) ? 0 : getPosition().hashCode());
        result = prime * result + ((getWorkAge() == null) ? 0 : getWorkAge().hashCode());
        result = prime * result + ((getUserLevel() == null) ? 0 : getUserLevel().hashCode());
        result = prime * result + ((getUserFunction() == null) ? 0 : getUserFunction().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getModiBy() == null) ? 0 : getModiBy().hashCode());
        result = prime * result + ((getModiTime() == null) ? 0 : getModiTime().hashCode());
        result = prime * result + ((getLastTime() == null) ? 0 : getLastTime().hashCode());
        result = prime * result + ((getLoginTimes() == null) ? 0 : getLoginTimes().hashCode());
        result = prime * result + ((getDeleteMark() == null) ? 0 : getDeleteMark().hashCode());
        return result;
    }

    /**
     * <br>
     *
     * TABLE： sm_user<br>
     *
     * @mbg.generated
     *
     * DATE: 2019-09-06 18:06
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", companyId=").append(companyId);
        sb.append(", userName=").append(userName);
        sb.append(", nickName=").append(nickName);
        sb.append(", sex=").append(sex);
        sb.append(", loginCode=").append(loginCode);
        sb.append(", workerCode=").append(workerCode);
        sb.append(", userSource=").append(userSource);
        sb.append(", mobile=").append(mobile);
        sb.append(", email=").append(email);
        sb.append(", avatarId=").append(avatarId);
        sb.append(", cardType=").append(cardType);
        sb.append(", cardNo=").append(cardNo);
        sb.append(", provinceId=").append(provinceId);
        sb.append(", provinceName=").append(provinceName);
        sb.append(", cityId=").append(cityId);
        sb.append(", cityName=").append(cityName);
        sb.append(", areaId=").append(areaId);
        sb.append(", areaName=").append(areaName);
        sb.append(", streetId=").append(streetId);
        sb.append(", streetName=").append(streetName);
        sb.append(", addr=").append(addr);
        sb.append(", position=").append(position);
        sb.append(", workAge=").append(workAge);
        sb.append(", userLevel=").append(userLevel);
        sb.append(", userFunction=").append(userFunction);
        sb.append(", createBy=").append(createBy);
        sb.append(", createTime=").append(createTime);
        sb.append(", modiBy=").append(modiBy);
        sb.append(", modiTime=").append(modiTime);
        sb.append(", lastTime=").append(lastTime);
        sb.append(", loginTimes=").append(loginTimes);
        sb.append(", deleteMark=").append(deleteMark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}