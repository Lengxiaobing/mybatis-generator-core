package com.mybatis.service;

import com.mybatis.SmUserCriteria;
import com.mybatis.domain.SmUser;
import java.util.List;

public interface SmUserService {
    long countByCriteria(SmUserCriteria criteria);

    int deleteByCriteria(SmUserCriteria criteria);

    int deleteByPrimaryKey(Long id);

    int insertSelective(SmUser record);

    int insertBatchSelective(List<SmUser> records);

    List<SmUser> selectByCriteria(SmUserCriteria criteria);

    SmUser selectByPrimaryKey(Long id);

    SmUser selectSingleByCriteria(SmUserCriteria criteria);

    int updateByCriteriaSelective(SmUser record, SmUserCriteria criteria);

    int updateByPrimaryKeySelective(SmUser record);

    int updateBatchByPrimaryKeySelective(List<SmUser> records);
}