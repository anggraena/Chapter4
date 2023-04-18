package com.example.chapter4.controller;

import com.example.chapter4.model.Users;
import com.example.chapter4.service.UsersService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.Iterator;
import java.util.List;

@RestController
public class UsersController {

    @Autowired
    private UsersService service;

    @GetMapping("/getAllActive")
    public List<Users> getActive() {return service.getUsersByActive(); }
    @PostMapping("/addUsersAuto")
    public int addUsersAuto(@RequestBody Users users) {return service.saveUsers(users);}

    //untuk tambah satu Data
    @PostMapping("/addUser")
    public Users addUser(@RequestBody Users users) {
        return service.addUser(users);
    }

    //untuk tambah beberapa data
    @PostMapping("/addUsers")
    public List<Users> addUsers(@RequestBody List<Users> users) {
        return service.addUsers(users);
    }

    //untuk mendapatkan data
    @GetMapping("/getAll")
    public Iterator<Users> getAll(){return service.getAll();}

    //mendapatkan data dari username
    @GetMapping("/getNamaUser")
    public List<Users> getNamaUser(@RequestBody Users users) {return service.getNamaUser(users);}

    //menghapus data dari ID
    @DeleteMapping("/delete")
    public String deleteId(@RequestBody int id) {return service.deleteId(id);}

    //memperbarui data
    @PutMapping("/update")
    public String updateUser(@RequestBody Users users)throws ParseException{
        return service.updateUser(users);
    }


}
