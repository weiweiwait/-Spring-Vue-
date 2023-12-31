package com.example.controller;

import com.example.eneity.Restbean;
import com.example.eneity.user.AccountUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @GetMapping("/me")
    public Restbean<AccountUser> me(@SessionAttribute("account") AccountUser user){
        return Restbean.success(user);
    }
}
