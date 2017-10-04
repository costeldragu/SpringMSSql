package com.enva.controller;

import com.enva.model.MessageModel;
import com.enva.services.MySqlConnectionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/list")
@RestController
public class ListController {
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);



    MySqlConnectionService mySqlConnectionService;

    @Autowired
    public void setMySqlConnectionService(MySqlConnectionService mySqlConnectionService) {
        this.mySqlConnectionService = mySqlConnectionService;
    }

    @RequestMapping("/all")
    public String getAll() {
        return "List all";
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = {"application/json"})
    public Object getOneProfile(@PathVariable("id") Integer id) {
        return new MessageModel().setCode(0).setMessage("Unknown error : "+ id).setType("error");
    }
}
