package com.eshop.admin.controller;

import com.eshop.admin.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
    private final TestService testService;

    public AdminController(TestService testService) {
        this.testService = testService;
    }

    public String  test(){
        return testService.test();
    }

    @GetMapping("")
    public String index(){
        return "index";
    }
}
