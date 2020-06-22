package com.petter.order.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
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

    private static int count = 0;

    @GetMapping("index")
    @SentinelResource("index")
    public String index(){
        System.out.println("index count ========================= " + count++);
        return "nacos index page " + count;
    }

    @GetMapping("resetCount")
    @SentinelResource("resetCount")
    public String resetCount(){
        System.out.println("reset count " + count);
        int temp = count;
        count = 0;
        return "nacos index page " + temp;
    }

}
