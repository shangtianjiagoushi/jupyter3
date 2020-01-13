package com.jishe.jupyter.controller;

import com.jishe.jupyter.entity.WechatUser;
import com.jishe.jupyter.service.FunctionService;
import com.jishe.jupyter.service.WechatUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;
import java.util.Map;

/**
 * @program: jupyter
 * @description: 基于实现系统功能的业务层
 * @author: kfzjw008(Junwei Zhang)
 * @create: 2020-01-10 21:53
 **/
@Slf4j
@RestController
@RequestMapping("/api/function")
public class FunctionController {
    @Autowired
    private FunctionService FunctionService;
    @GetMapping("/SearchSAO")
    public Map getSAO(Double LON,Double LAT) {
        //此处实现观测适宜度评价计算
        return FunctionService.GetSAO(LON,LAT);
    }
    @GetMapping("/SearchSunriseset")
    public Map getSunriseset(Date D, String city) {
        //此处实现日出日落日期计算
        return Map.of("SAO","1");
    }



}
