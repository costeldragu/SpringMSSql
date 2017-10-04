package com.enva.controller;

import com.enva.services.MySqlConnectionService;
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
    private JdbcTemplate jdbcTemplate;

    @Autowired
    MySqlConnectionService mySqlConnectionService;

    @RequestMapping("/")
    public String home() {

        try {
            int rowCount = mySqlConnectionService.getJdbcTemplate().queryForObject("SELECT COUNT(*) from users", Integer.class);
        }catch (Exception e) {
            e.printStackTrace();
        }
       logger.info("Home page loaded");
        System.out.println(mySqlConnectionService);
//        System.out.println(new MySqlConnectionService());
//        System.out.println(mySqlConnectionService.getInstances());
       return "Home Controller in place";
    }
}
