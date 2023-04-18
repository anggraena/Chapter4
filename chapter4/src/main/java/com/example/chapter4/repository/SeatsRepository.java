package com.example.chapter4.repository;

import com.example.chapter4.model.Seats;
import com.example.chapter4.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SeatsRepository extends JpaRepository<Seats, String> {

    @Query(value = "SELECT studioname, nomorkursi FROM public.seats", nativeQuery = true)
    List<Users> findByUsersActive();
}
