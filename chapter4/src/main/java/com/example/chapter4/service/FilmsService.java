package com.example.chapter4.service;

import com.example.chapter4.model.Films;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.metamodel.SingularAttribute;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

public class FilmsService {
    public List<Films> getFilmByActiveFilm() {
        return getFilmByActiveFilm();
    }

    public int saveFilm(Films films) {
        return saveFilm(films);
    }

    public Films addFilm(Films films) {
        return addFilm(films);
    }

    public List<Films> aadFilms(List<Films> films) {
        return aadFilms(films);
    }

    public Iterator<Films> getAllFilm() {
        return getAllFilm();
    }

    public List<Films> getNamaFilm(Films films) {
        return getNamaFilm(films);
    }

    public String updatefilm(Films films) {
        return updatefilm(films);
    }

    public String deleteId(int id) {
        return deleteId(id);
    }
}
