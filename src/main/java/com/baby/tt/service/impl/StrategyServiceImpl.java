package com.baby.tt.service.impl;

import com.baby.tt.common.exception.ServiceException;
import com.baby.tt.common.po.PageObject;
import com.baby.tt.common.po.Strategy;
import com.baby.tt.dao.StrategyDao;
import com.baby.tt.service.StrategyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StrategyServiceImpl implements StrategyService {

    @Autowired
    private StrategyDao strategyDao;

    @Override
    public PageObject<Strategy> findStrategyListObjects(String title, Long pageCurrent) {
        if(pageCurrent==null||pageCurrent<1) throw new IllegalArgumentException("传入参数不合法");
        long rowCount = strategyDao.findRowCount(title);
        if(rowCount==0) throw new ServiceException("没有找到对应结果");
        int pageSize = 5;
        long startIndex = (pageCurrent-1)*pageSize;
        List<Strategy> records = strategyDao.findStrategyListObjects(title, startIndex, pageSize);
        return new PageObject<>(pageSize, records, pageCurrent, rowCount);
    }

    @Override
    public Strategy findStrategyById(Long id) {
        if(id==null||id<1) throw new IllegalArgumentException("参数不合法");
        return strategyDao.findStrategyById(id);
    }
}
