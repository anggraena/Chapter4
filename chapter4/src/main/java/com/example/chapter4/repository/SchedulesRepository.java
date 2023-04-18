package com.example.chapter4.repository;

import com.example.chapter4.model.Schedules;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SchedulesRepository extends JpaRepository<Schedules, Integer> {
    @Query (value = "SELECT scheduleid, tgltayang, jammulai, jamselesai, hargatiket, filmcode FROM public.schedules", nativeQuery = true)
    List<Schedules> findBySchedulesActive();


}
