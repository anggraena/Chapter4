package com.example.chapter4.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "seats")

public class Seats {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "studioname")
    Character studioName;
    @Column(name = "nomorkursi")
    int nomorkursi;
}
