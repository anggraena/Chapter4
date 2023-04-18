package com.example.chapter4.repository;

import com.example.chapter4.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UsersRepository extends JpaRepository<Users, Integer> {
   @Query (value = "SELECT userid, username, emailaddress, password FROM public.users", nativeQuery = true)
   List<Users> findByUsersActive();

   List<Users> getNamaUser(String name);


}
