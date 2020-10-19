package com.baby.tt.controller;

import com.baby.tt.common.vo.JsonResult;
import com.baby.tt.service.ScenicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/scenic")
public class ScenicController {

    @Autowired
    private ScenicService scenicService;

    @RequestMapping("/findScenicListObjects")
    public JsonResult findScenicListObjects(){
        return new JsonResult(scenicService.findScenicListObjects());
    }

}
