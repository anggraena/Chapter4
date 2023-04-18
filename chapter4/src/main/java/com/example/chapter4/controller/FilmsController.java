package com.example.chapter4.controller;

import com.example.chapter4.model.Films;
import com.example.chapter4.service.FilmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import java.text.ParseException;
import java.util.Iterator;
import java.util.List;

@RestController
public class FilmsController {

    @Autowired
    private FilmsService service;

    @GetMapping("/getAllActiveFilm")
    public List<Films> getActiveFillm() {return service.getFilmByActiveFilm();}

    @PostMapping("/addFilmsAuto")
    public int addFilmAuto(@RequestBody Films films) {return service.saveFilm(films);}

    //untuk tambah satu data
    @PostMapping("/addFilm")
    public Films addFilm(@RequestBody Films films) {return service.addFilm(films);}

    //untuk tambah beberapa data
    @PostMapping("/addFilms")
    public List<Films> addFilms(@RequestBody List<Films> films) {
        return service.aadFilms(films);
    }

    //untuk mendapatkan data
    @GetMapping("/getAllFilm")
    public Iterator<Films> getAllFilm() {return service.getAllFilm();}

    @GetMapping("/getNamaFilm")
    public List<Films> getNamaFilm(@RequestBody Films films){return service.getNamaFilm(films);}

    //menghapus data dari ID
    @DeleteMapping("/deleteFilm")
    public String deleteId(@RequestBody int id) {return service.deleteId(id);}

    //memperbarui data
    @PutMapping("/update")
    public String updateFilm(@RequestBody Films films) throws ParseException{
        return service.updatefilm(films);
    }

}
