package com.aqr.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Home Controller
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "Home Controller in place";
    }
}
