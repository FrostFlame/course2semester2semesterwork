package ru.kpfu.itis.group11501.serazetdinov.coursetest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by 1 on 24.05.2017.
 */
@Controller
@RequestMapping(path = "/")
public class HomeController {
    @GetMapping
    public ModelAndView home(ModelMap modelMap, @RequestParam(name = "name", required = false) String name){
        modelMap.put("name", name);
        return new ModelAndView("WEB-INF/templates/ftl/test.ftl");
    }
}
