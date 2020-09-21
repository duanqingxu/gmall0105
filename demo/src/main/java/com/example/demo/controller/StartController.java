package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Zengjl
 * @date 2020/9/21 20:09
 */
@RestController
public class StartController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello spring boot";
    }

}
