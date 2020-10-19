package com.baby.tt.controller;

import com.baby.tt.common.vo.JsonResult;
import com.baby.tt.service.StrategyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/strategy")
public class StrategyController {

    @Autowired
    private StrategyService strategyService;

    @RequestMapping("/findStrategyListObjects")
    @ResponseBody
    public JsonResult findStrategyListObjects(String title, Long pageCurrent){
        return new JsonResult(strategyService.findStrategyListObjects(title, pageCurrent));
    }

    @RequestMapping("/findStrategyById/{id}")
    public String findStrategyById(@PathVariable Long id, Model model){
        model.addAttribute("strategyDetail", strategyService.findStrategyById(id));
        return "strategy_detail";
    }

}
