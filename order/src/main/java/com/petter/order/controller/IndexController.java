package com.petter.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 首页信息
 * @Author : GD
 * @Create :2019/10/21 : 14:23
 */
@RestController
@RequestMapping("page")
public class IndexController {

    @GetMapping("index")
    public String index(){
        return "nacos index page ";
    }

}
