package com.baby.tt.service;

import com.baby.tt.common.po.PageObject;
import com.baby.tt.common.po.Strategy;

public interface StrategyService {

    PageObject<Strategy> findStrategyListObjects(String title, Long pageCurrent);

}
