package com.enva.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Home Controller
 */
@RestController
public class HomeController {
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    JdbcTemplate jdbcTemplate;

    @RequestMapping("/")
    public String home() {
        try {
            int rowCount = this.jdbcTemplate.queryForObject("SELECT COUNT(*) from people", Integer.class);
        }catch (Exception e) {
            e.printStackTrace();
        }
       logger.info("Home page loaded");
        return "Home Controller in place";
    }
}
