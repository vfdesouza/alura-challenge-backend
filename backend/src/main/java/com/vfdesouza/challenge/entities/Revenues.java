package com.vfdesouza.challenge.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TB_REVENUES")
public @Getter @Setter final class Revenues extends CentralClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Revenues() {
    }

    public Revenues(String description, Double value, Date date) {
        super(description, value, date);
    }

}