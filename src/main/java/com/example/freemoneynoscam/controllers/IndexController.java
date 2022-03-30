package com.example.freemoneynoscam.controllers;

import com.example.freemoneynoscam.Models.email;
import com.example.freemoneynoscam.services.ValidateEmailService;
import com.example.freemoneynoscam.services.emailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import java.util.List;

@Controller
public class IndexController {
    @Autowired
    emailService _emailService;
    ValidateEmailService emailService;
    @GetMapping("/test2")
    public String index(){
        return "index";
    }

    @GetMapping("/list")
    public String listpage(Model model)
    {
        List<email> emails= _emailService.fetchAll();
        model.addAttribute("emails",emails);


        System.out.println(emails.get(0));
        return"emails/List";

    }

    @PostMapping("/test")
    public String test(WebRequest dataFromForm, @ModelAttribute email userEmail){
        System.out.println(userEmail);
        userEmail.setEmailString(dataFromForm.getParameter("email"));
        System.out.println(userEmail);
        if (userEmail.getEmailString().contains("@")) {
            _emailService.addEmail(userEmail);
            return "redirect:/";
        }

        return "redirect:/?error=Email not valid";
    }
}
