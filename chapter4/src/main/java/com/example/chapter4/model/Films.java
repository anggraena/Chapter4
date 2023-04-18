package com.example.chapter4.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "films")
public class Films {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "filmcode")
    int filmCode;
    @Column(name = "filmname")
    String filmName;
    @Column(name = "filmtayang")
    String filmTayang;
}
