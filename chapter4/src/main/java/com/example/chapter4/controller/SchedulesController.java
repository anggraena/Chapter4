package com.example.chapter4.controller;

import com.example.chapter4.model.Schedules;
import com.example.chapter4.model.Users;
import com.example.chapter4.service.SchedulesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.Iterator;
import java.util.List;

@RestController
public class SchedulesController {

    @Autowired
    private SchedulesService service;
    @GetMapping("/getActiveSchedules")
    public List<Users> getActiveSchedules() {return service.getSchedulesByActive(); }
    @PostMapping("/addSchedulesAuto")
    public int addSchedulesAuto(@RequestBody Schedules schedules) {return service.saveSchedules(schedules);}

    //untuk tambah satu Data
    @PostMapping("/addSchedule")
    public Users addSchedule(@RequestBody Schedules schedules) {
        return service.addSchedule(schedules);
    }

    //untuk tambah beberapa data
    @PostMapping("/addSchedules")
    public List<Users> addSchedules(@RequestBody List<Schedules> schedules) {
        return service.addSchedules(schedules);
    }

    //untuk mendapatkan data
    @GetMapping("/getAllSchedules")
    public Iterator<Schedules> getAll(){return service.getAllSchedules();}

    //menghapus data dari ID
    @DeleteMapping("/deleteSchedules")
    public String deleteId(@RequestBody int id) {return service.deleteId(id);}

    //memperbarui data
    @PutMapping("/update")
    public String updateSchedules(@RequestBody Schedules schedules)throws ParseException {
        return service.updateSchedules(schedules);
    }
}
