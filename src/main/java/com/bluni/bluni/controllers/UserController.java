package com.bluni.bluni.controllers;

import com.bluni.bluni.models.User;
import com.bluni.bluni.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Objects;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public ModelAndView login(){
        ModelAndView mav = new ModelAndView();
        return mav;
    }

    @PostMapping
    public String login(@ModelAttribute("user") User user){
        User oauthUser = userService.login(user.getUsername(), user.getPassword());
        System.out.println(oauthUser);
        if (Objects.nonNull(oauthUser))
            return "redirect:/";
        else
            return "redirect:/login";
    }
}
