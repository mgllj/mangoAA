package com.heromg.mg.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/test")
public class Controller {
    @RequestMapping("/tt")
    public  String hello()
    {
        return  "hello magic  dfd-helll";
    }

}
