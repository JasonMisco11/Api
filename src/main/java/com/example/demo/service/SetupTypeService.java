package com.example.demo.service;

import com.example.demo.dto.SetupTypeDTO;

import java.util.List;

public interface SetupTypeService {

    List<SetupTypeDTO> getAll();
    public SetupTypeDTO createSetup(SetupTypeDTO dto);
}
