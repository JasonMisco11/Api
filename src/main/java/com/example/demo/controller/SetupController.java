package com.example.demo.controller;

import com.example.demo.dto.SetupTypeDTO;
import com.example.demo.service.serviceImpl.SetupTypeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/setups")
@CrossOrigin(origins = "http://localhost:3000")
public class SetupController {

    @Autowired
    private SetupTypeServiceImpl setupTypeService;

    @GetMapping
    public List<SetupTypeDTO> getAllCategories() {
        return setupTypeService.getAll();
    }

    @PostMapping
    public SetupTypeDTO createType(@RequestBody SetupTypeDTO dto){
        return setupTypeService.createSetup(dto);
    }
}