package com.tobeto.a_springintro.controllers;

import com.tobeto.a_springintro.entities.address;
import com.tobeto.a_springintro.entities.cost;
import com.tobeto.a_springintro.repositories.CostRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/costs")
public class CostsController {


    private final CostRepository costRepository;

    public CostsController(CostRepository costRepository) {
        this.costRepository = costRepository;
    }

    @GetMapping
    public List<cost> getAll(){

List<cost>costs =costRepository.findAll();
return costs;
    }

    @GetMapping("{id}")
    public cost getById(@PathVariable int id){
        return costRepository.findById(id).orElseThrow();
    }

    @PostMapping
    public void add(@RequestBody cost cost){
        costRepository.save(cost);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id){

        cost costToDelete= costRepository.findById(id).orElseThrow();
        costRepository.delete(costToDelete);






















} }
