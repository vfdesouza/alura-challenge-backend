package com.vfdesouza.challenge.controllers;

import com.vfdesouza.challenge.entities.Revenues;
import com.vfdesouza.challenge.services.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/revenues")
public class ControllerRevenues {
    @Autowired
    private final Service<Revenues> service;

    public ControllerRevenues(Service<Revenues> service) {
        this.service = service;
    }

    @GetMapping("/insert")
    public String insert(Revenues revenues, BindingResult result) {
        return result.hasErrors() ? "redirect:/formCad" : service.insert(revenues) + "redirect:/home";
    }
}
