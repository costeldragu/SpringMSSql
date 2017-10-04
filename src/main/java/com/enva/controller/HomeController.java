package com.enva.controller;

import com.enva.model.HelpLinkModel;
import com.enva.services.MySqlConnectionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


/**
 * Home Controller
 */
@RestController
public class HomeController {
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
    /**
     * Autowired - should be used on a set method
     */
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @RequestMapping("/")
    public List<HelpLinkModel> home() {
        List<HelpLinkModel> helpMenu = new ArrayList<HelpLinkModel>();

        helpMenu.add(new HelpLinkModel()
                .setTitle("List all users")
                .setDescription("TODO")
                .setLink("http://localhost:8080/list/all"));

        helpMenu.add(new HelpLinkModel()
                .setTitle("List one user")
                .setDescription("TODO")
                .setLink("http://localhost:8080/list/{id}"));

        helpMenu.add(new HelpLinkModel()
                .setTitle("Add user")
                .setDescription("TODO")
                .setLink("http://localhost:8080/user/add"));

        helpMenu.add(new HelpLinkModel()
                .setTitle("Edit user")
                .setDescription("TODO")
                .setLink("http://localhost:8080/user/edit/{id}"));
        return helpMenu;
    }
}
