package com.googoo.controller.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * 描述:
 * demo
 *
 * @author ST
 * @create 2018-07-03 17:18
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    ApplicationContext applicationContext;

    @GetMapping("/login")
    public String  login(HttpServletRequest request) {

        System.out.println(applicationContext);
        String code = request.getParameter("code");

        System.out.printf("Hello....");
        return "Hello";


    }
}