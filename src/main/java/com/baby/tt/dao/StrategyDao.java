package com.baby.tt.dao;

import com.baby.tt.common.po.Strategy;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StrategyDao {

    long findRowCount(String title);

    List<Strategy> findStrategyListObjects(String title, long startIndex, int pageSize);

    Strategy findStrategyById(Long id);
}
