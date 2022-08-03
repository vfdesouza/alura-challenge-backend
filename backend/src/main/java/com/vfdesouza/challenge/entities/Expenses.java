package com.vfdesouza.challenge.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TB_EXPENSES")

public @Getter @Setter class Expenses extends Revenues{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Expenses() {
    }

    public Expenses(Long id, String description, Double value, Date date) {
        super(id, description, value, date);
    }
}
