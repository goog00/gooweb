package com.googoo.controller.demo;

import com.arronlong.httpclientutil.exception.HttpProcessException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
@Api(value = "测试", description = "测试接口")
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    ApplicationContext applicationContext;

    @ApiOperation(value = "用户登录")
    @GetMapping("/login")
    public String  login(HttpServletRequest request) throws HttpProcessException {

        System.out.println(applicationContext);
        String code = request.getParameter("code");

        System.out.printf("Hello....");
        return "Hello";


    }
}