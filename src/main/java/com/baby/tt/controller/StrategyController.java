package com.baby.tt.controller;

import com.baby.tt.common.vo.JsonResult;
import com.baby.tt.service.StrategyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/strategy")
public class StrategyController {

    @Autowired
    private StrategyService strategyService;

    @RequestMapping("/findStrategyListObjects")
    public JsonResult findStrategyListObjects(String title, Long pageCurrent){
        return new JsonResult(strategyService.findStrategyListObjects(title, pageCurrent));
    }

}
