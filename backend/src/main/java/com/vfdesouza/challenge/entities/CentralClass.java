package com.vfdesouza.challenge.entities;

import java.util.Date;

public abstract class CentralClass {
    private Long id;
    private String description;
    private Double value;
    private Date date;

    public CentralClass() {
    }
    public CentralClass(String description, Double value, Date date) {
        this.description = description;
        this.value = value;
        this.date = date;
    }
}
