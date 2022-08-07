package com.vfdesouza.challenge.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TB_EXPENSES")
public @Getter @Setter final class Expenses extends CentralClass{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Expenses() {
    }

    public Expenses(String description, Double value, Date date) {
        super(description, value, date);
    }

}
