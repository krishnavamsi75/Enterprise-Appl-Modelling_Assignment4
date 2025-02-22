package com.Vamsi.Assig4.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Vamsi.Assig4.Service.WorkshopRegService;
import com.Vamsi.Assig4.Models.*;
import jakarta.validation.Valid;

@Controller
@RequestMapping("/vamsi")
public class WorkshopRegController {

    @Autowired
    private WorkshopRegService registrationService;

    @GetMapping("/registration")
    public String showRegistrationForm(Model model) {
        model.addAttribute("registration", new WorkshopRegModel()); 
        return "WorkshopReg"; 
    }

    @PostMapping("/save")
    public String saveRegistration(@Valid WorkshopRegModel registration, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "WorkshopReg"; 
        }
        registrationService.saveRegistration(registration);
        model.addAttribute("message", "Workshop Registration Successful!");
        return "WorkshopReg"; 
    }
}
