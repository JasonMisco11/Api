package com.example.demo.service.serviceImpl;

import com.example.demo.dto.SetupTypeDTO;
import com.example.demo.entity.SetupType;
import com.example.demo.respository.SetupTypeRepository;
import com.example.demo.service.SetupTypeService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;


@Service
@RequiredArgsConstructor
public class SetupTypeServiceImpl implements SetupTypeService {

    private final SetupTypeRepository setupTypeRepository;

    @Override
    public List<SetupTypeDTO> getAll() {

        List<SetupType> setupTypeList = setupTypeRepository.findAll();

        return setupTypeList
                .stream().map(SetupType::setupTypeDTO).toList();
    }

    @Override
    public SetupTypeDTO createSetup(SetupTypeDTO dto) {



        SetupType type = new SetupType();
        type.setDisplayName(dto.getName());
        type.setCreatedAt(LocalDateTime.now());
        type.setTypeCode(dto.getCode());

        setupTypeRepository.save(type);

        return type.setupTypeDTO();
    }
}
