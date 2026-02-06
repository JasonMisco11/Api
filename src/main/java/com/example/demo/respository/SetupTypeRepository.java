package com.example.demo.respository;

import com.example.demo.entity.SetupType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SetupTypeRepository extends JpaRepository<SetupType, Long> {

    List<SetupType> findAll();




}