package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class SetupTypeDTO {

    private Long id;

    private String code;

    private String name;

    private LocalDateTime createdAt;
}
