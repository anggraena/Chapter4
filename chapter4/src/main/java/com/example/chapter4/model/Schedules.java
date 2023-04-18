package com.example.chapter4.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Data
@Entity
@Table(name = "schedules")
public class Schedules {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "scheduleid")
    int scheduleId;
    @Column(name = "tgltayang")
    Date tglTayang;
    @Column(name = "jammulai")
    Time jamMulai;
    @Column(name = "jamselesai")
    Time jamSelesai;
    @Column(name = "hargatiket")
    String hargaTiket;
    @Column(name = "filmcode")
    int filmCode;
}
