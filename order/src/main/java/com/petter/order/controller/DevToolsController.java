package com.petter.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Method;

/**
 * @author : GD
 * @date :2020/7/19 : 22:29
 */
@RestController
@RequestMapping("devTool")
public class DevToolsController {

    @GetMapping("index")
    public void index(){
        loadMyClass("com.petter.order.controller.IndexController");
    }

    public void loadMyClass(String className){
        try {
            DevToolClassLoader customClassLoader = new DevToolClassLoader();
            Class<?> cls = customClassLoader.loadClass(className,false);
            Object test = cls.newInstance();
            Method method = cls.getMethod("index2");
            method.invoke(test);
        }catch (Exception e){
            System.out.println(e);
        }
    }

}
