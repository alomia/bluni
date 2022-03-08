package com.bluni.bluni.controllers;

import com.bluni.bluni.models.Computer;
import com.bluni.bluni.models.repository.ComputerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/computer")
public class ComputerRest {
    @Autowired
    private ComputerDAO computarDAO;

    @PostMapping("/save")
    public void save(@RequestBody Computer computer){
        computarDAO.save(computer);
    }

    @GetMapping("/consult")
    public List<Computer> consult(){
        return computarDAO.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Integer id){
        computarDAO.deleteById(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody Computer computer){
        computarDAO.save(computer);
    }
}
