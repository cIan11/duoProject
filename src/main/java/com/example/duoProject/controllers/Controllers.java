package com.example.duoProject.controllers;

import com.example.duoProject.entities.Calculator;
import com.example.duoProject.services.Operations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Controllers {
private final Operations op;
    @Autowired
    public Controllers(Operations op) {
        this.op = op;
    }

    @GetMapping("/")
    public String showCalculator(Model model){
    model.addAttribute("calculation", new Calculator());
    return "MyPage";
    }
    @PostMapping("/calculator")
    public String calculate(@ModelAttribute Calculator calculator, Model model){

        return "MyPage";
    }
}
