package com.example.chapter4.controller;

import com.example.chapter4.model.Seats;
import com.example.chapter4.model.Users;
import com.example.chapter4.service.SeatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.Iterator;
import java.util.List;

@RestController
public class SeatsController {

    @Autowired
    private SeatsService service;
    @GetMapping("/getActiveSeats")
    public List<Users> getActiveSeats() {return service.getSeatsByActive(); }
    @PostMapping("/addSeatsAuto")
    public int addSeatsAuto(@RequestBody Seats seats) {return service.saveSeats(seats);}

    //untuk tambah satu Data
    @PostMapping("/addSeat")
    public Users addSeat(@RequestBody Seats seats) {return service.addSeat(seats);}

    //untuk tambah beberapa data
    @PostMapping("/addSeats")
    public List<Seats> addSeats(@RequestBody List<Seats> seats) {
        return service.addSeats(seats);
    }

    //untuk mendapatkan data
    @GetMapping("/getAllSeats")
    public Iterator<Seats> getAllSeats(){return service.getAllSeats();}

    //mendapatkan data dari username
    @GetMapping("/getNamaStudio")
    public List<Users> getNamaStudio(@RequestBody Seats seats) {return service.getNamaStudio(seats);}

    //menghapus data dari ID
    @DeleteMapping("/deleteSeats")
    public String deleteId(@RequestBody int id) {return service.deleteId(id);}

    //memperbarui data
    @PutMapping("/updateSeats")
    public String updateSeats(@RequestBody Seats seats)throws ParseException {
        return service.updateSeats(seats);
    }

}
