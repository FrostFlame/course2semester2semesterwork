package ru.kpfu.itis.group11501.serazetdinov.coursetest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.kpfu.itis.group11501.serazetdinov.coursetest.service.UserService;

import javax.sql.DataSource;
import java.sql.*;

/**
 * Created by 1 on 25.05.2017.
 */
@Controller
public class IndexController {

    UserService userService;

    @Autowired
    public IndexController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    public String showIndexPage(Model model, @RequestParam(value = "id", required = false) String id) {
        if (id != null) {
            model.addAttribute("group", userService.findById(Long.parseLong(id)).getFirstname());
        }
        else
            model.addAttribute("group", "");
        return "index";
    }

    @RequestMapping("/test")
    public String showAnotherPage(@RequestParam("result") String result, Model model) {
        model.addAttribute("text", "Какой-то текст");
        model.addAttribute("result", result);
        return "another";
    }

    @RequestMapping("/test/{username}")
    public String showUsername(@PathVariable("username") String username, Model model) {
        model.addAttribute("username", username);
        return "usernameshow";
    }
}
