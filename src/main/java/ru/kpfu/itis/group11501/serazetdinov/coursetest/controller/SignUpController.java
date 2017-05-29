package ru.kpfu.itis.group11501.serazetdinov.coursetest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.kpfu.itis.group11501.serazetdinov.coursetest.service.UserService;

/**
 * Created by 1 on 29.05.2017.
 */
@Controller
@RequestMapping("/sign_up")
public class SignUpController {
    UserService userService;

    @Autowired
    public SignUpController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String doPost(Model model, @RequestParam(value = "err", defaultValue = "") String err,
                         @RequestParam(value = "log", defaultValue = "") String log,
                         @RequestParam(value = "first_name", defaultValue = "") String first_name,
                         @RequestParam(value = "last_name", defaultValue = "") String last_name,
                         @RequestParam(value = "birthdate", defaultValue = "") String birthdate,
                         @RequestParam(value = "email", defaultValue = "") String email,
                         @RequestParam(value = "country", defaultValue = "") String country,
                         @RequestParam(value = "city", defaultValue = "") String city,
                         @RequestParam(value = "skype", defaultValue = "") String skype,
                         @RequestParam(value = "education", defaultValue = "") String education,
                         @RequestParam(value = "genres", defaultValue = "") String genres) {
        model.addAttribute("err", err);

        model.addAttribute("log", log);

        model.addAttribute("first_name", first_name);

        model.addAttribute("last_name", last_name);

        model.addAttribute("birthdate", birthdate);

        model.addAttribute("email", email);

        model.addAttribute("country", country);

        model.addAttribute("city", city);

        model.addAttribute("skype", skype);

        model.addAttribute("education", education);

        model.addAttribute("genres", genres);
        return "sign_up";
    }

    @PostMapping
    public String doPost(@RequestParam(value = "err", defaultValue = "") String err,
                         @RequestParam(value = "log", defaultValue = "") String log,
                         @RequestParam(value = "first_name", defaultValue = "") String first_name,
                         @RequestParam(value = "last_name", defaultValue = "") String last_name,
                         @RequestParam(value = "birthdate", defaultValue = "") String birthdate,
                         @RequestParam(value = "email", defaultValue = "") String email,
                         @RequestParam(value = "country", defaultValue = "") String country,
                         @RequestParam(value = "city", defaultValue = "") String city,
                         @RequestParam(value = "skype", defaultValue = "") String skype,
                         @RequestParam(value = "education", defaultValue = "") String education,
                         @RequestParam(value = "genres", defaultValue = "") String genres) {

    }

}
