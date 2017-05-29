package ru.kpfu.itis.group11501.serazetdinov.coursetest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by 1 on 28.05.2017.
 */
@Controller
@RequestMapping("/sign_in")
public class SignInController {
    @RequestMapping(method = RequestMethod.GET)
    public String loginPage(Model model, @RequestParam(value = "error", required = false) Boolean error) {
        if (Boolean.TRUE.equals(error)) {
            model.addAttribute("error", error);
        }
        return "sign_in";
    }
}
