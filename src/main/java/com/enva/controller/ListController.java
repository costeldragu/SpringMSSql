package com.enva.controller;

import com.enva.services.MySqlConnectionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/list")
@RestController
public class ListController {
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);


    @Autowired
    MySqlConnectionService mySqlConnectionService;

    @RequestMapping("/all")
    public String getAll() {
        return "List all";
    }
}
