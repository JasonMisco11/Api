package com.yourpackage.repository;

import com.yourpackage.model.SetupType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SetupTypeRepository extends JpaRepository<SetupType, Long> {
    // You can add custom queries here later if needed
    // e.g., Optional<SetupType> findByTypeCode(String code);
}