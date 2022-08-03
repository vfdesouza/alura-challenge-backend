package com.vfdesouza.challenge.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TB_REVENUES")
public @Getter @Setter class Revenues {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private Double value;
    private Date date;

    public Revenues() {
    }
    public Revenues(Long id, String description, Double value, Date date) {
        this.id = id;
        this.description = description;
        this.value = value;
        this.date = date;
    }
}
