package com.mybatis.service.impl;

import com.mybatis.SmUserCriteria;
import com.mybatis.domain.SmUser;
import com.mybatis.mapper.SmUserMapper;
import com.mybatis.service.SmUserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class SmUserServiceImpl implements SmUserService {
    @Autowired
    private SmUserMapper smUserMapper;

    @Override
    public long countByCriteria(SmUserCriteria criteria) {
        return smUserMapper.countByCriteria(criteria);
    }

    @Override
    public int deleteByCriteria(SmUserCriteria criteria) {
        return smUserMapper.deleteByCriteria(criteria);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return smUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(SmUser record) {
        return smUserMapper.insertSelective(record);
    }

    @Override
    public int insertBatchSelective(List<SmUser> records) {
        return smUserMapper.insertBatchSelective(records);
    }

    @Override
    public List<SmUser> selectByCriteria(SmUserCriteria criteria) {
        return smUserMapper.selectByCriteria(criteria);
    }

    @Override
    public SmUser selectByPrimaryKey(Long id) {
        return smUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public SmUser selectSingleByCriteria(SmUserCriteria criteria) {
        return smUserMapper.selectSingleByCriteria(criteria);
    }

    @Override
    public int updateByCriteriaSelective(SmUser record, SmUserCriteria criteria) {
        return smUserMapper.updateByCriteriaSelective(record,criteria);
    }

    @Override
    public int updateByPrimaryKeySelective(SmUser record) {
        return smUserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateBatchByPrimaryKeySelective(List<SmUser> records) {
        return smUserMapper.updateBatchByPrimaryKeySelective(records);
    }
}