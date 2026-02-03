package com.yourpackage.controller;

import com.yourpackage.model.SetupType;
import com.yourpackage.repository.SetupTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/setups")
@CrossOrigin(origins = "http://localhost:3000") // Allows React to talk to Java
public class SetupController {

    @Autowired
    private SetupTypeRepository setupTypeRepository;

    // Endpoint for React LOV Dropdown
    // URL: http://localhost:8080/api/setups/categories
    @GetMapping("/categories")
    public List<SetupType> getAllCategories() {
        return setupTypeRepository.findAll();
    }
}