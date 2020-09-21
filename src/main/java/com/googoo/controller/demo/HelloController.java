package com.googoo.controller.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.*;

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


    @GetMapping("/login/{test}")
    public String login(HttpServletRequest request, @PathVariable String test) {

        System.out.println(test);
        return "Hello";
    }


    @PostMapping("/update")
    public String  update(HttpServletRequest request, @RequestParam("test") String test) {
        System.out.println(test);
        return "Hello";
    }

}