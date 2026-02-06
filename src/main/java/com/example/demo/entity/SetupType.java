package com.example.demo.entity;

import com.example.demo.dto.SetupTypeDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "setup_types")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SetupType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "type_code", nullable = false, unique = true)
    private String typeCode;

    @Column(name = "display_name", nullable = false)
    private String displayName;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    // Getters and Setters
//    public Long getId() { return id; }
//    public void setId(Long id) { this.id = id; }
//
//    public String getTypeCode() { return typeCode; }
//    public void setTypeCode(String typeCode) { this.typeCode = typeCode; }
//
//    public String getDisplayName() { return displayName; }
//    public void setDisplayName(String displayName) { this.displayName = displayName; }


    public SetupTypeDTO setupTypeDTO(){
        SetupTypeDTO dto = new SetupTypeDTO();
        dto.setId(id);
        dto.setCode(typeCode);
        dto.setName(displayName);
        dto.setCreatedAt(createdAt);
        return dto;
    }
}