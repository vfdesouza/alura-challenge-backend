package com.vfdesouza.challenge.controllers;

import com.vfdesouza.challenge.entities.Expenses;
import com.vfdesouza.challenge.services.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/expenses")
public class ControllerExpenses {
    @Autowired
    private final Service<Expenses> service;

    public ControllerExpenses(Service<Expenses> service) {
        this.service = service;
    }

    @GetMapping("/insert")
    public String insert(Expenses expenses, BindingResult result) {
        return result.hasErrors() ? "redirect:/formCad" : service.insert(expenses) + "redirect:/home";
    }
}
