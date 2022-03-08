package com.bluni.bluni.controllers;

import com.bluni.bluni.models.entity.Computer;
import com.bluni.bluni.models.service.IComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/views/computers")
public class
ComputerController {
    @Autowired
    private IComputerService computerService;
    
    @GetMapping("/")
    public String listarComputers(Model model){
        List<Computer> listadoComputers = computerService.listarTodos();
        model.addAttribute("titulo", "Lista de equipos");
        model.addAttribute("computers",listadoComputers);
        return "/views/computers/listar";
    }
    @GetMapping("/create")
    public String crear(Model model){
        Computer computer = new Computer();
        model.addAttribute("titulo", "Formulario: Nuevo Equipo");
        model.addAttribute("computer", computer);
        return "/views/computers/frmCrear";
    }

    @PostMapping("/save")
    public String guardar(@ModelAttribute Computer computer){
        computerService.guardar(computer);
        return "redirect:/views/computers/";
    }
}
