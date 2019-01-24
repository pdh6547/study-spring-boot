package com.web.controller;

import com.web.annotation.SocialUser;
import com.web.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController{

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping(value = "/{facebook|google|kakao|naver}/complete")
    public String loginComplete(@SocialUser User user) {
        return "redirect:/board/list";
    }
}
