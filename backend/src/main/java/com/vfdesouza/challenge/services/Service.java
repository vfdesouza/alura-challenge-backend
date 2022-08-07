package com.vfdesouza.challenge.services;
import com.vfdesouza.challenge.repositories.CentralRepository;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service<T> {
    @Autowired
    private CentralRepository<T> cr;
    public String insert(T t) {
        cr.save(t);
        return  "redirect:/home";
    }
}
