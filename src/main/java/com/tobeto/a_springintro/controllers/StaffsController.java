package com.tobeto.a_springintro.controllers;

import com.tobeto.a_springintro.entities.rent;
import com.tobeto.a_springintro.entities.staff;
import com.tobeto.a_springintro.repositories.StaffRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/staffs")
public class StaffsController {

    private final StaffRepository staffRepository;

    public StaffsController(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    @GetMapping
    public List<staff> getAll() {

        List<staff>staffs=staffRepository.findAll();
return staffs;

    }

    @GetMapping("{id}")
    public staff getById(@PathVariable int id){
        return staffRepository.findById(id).orElseThrow();
    }

    @PostMapping
    public void add(@RequestBody staff staff){
        staffRepository.save(staff);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {

        staff staffToDelete = staffRepository.findById(id).orElseThrow();
        staffRepository.delete(staffToDelete);


    }




    }