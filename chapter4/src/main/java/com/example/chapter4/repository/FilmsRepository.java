package com.example.chapter4.repository;

import com.example.chapter4.model.Films;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FilmsRepository extends JpaRepository<Films, Integer> {
    @Query(value = "SELECT filmcode, filmname, filmtayang FROM public.films", nativeQuery = true)
    List<Films> findByFilmActive();

    List<Films>findByNameFilm(String namaFilm);
}
