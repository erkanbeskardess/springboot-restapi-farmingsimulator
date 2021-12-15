package com.fs.farms.repository;

import java.util.List;


import com.fs.farms.entities.Kind;

import org.springframework.data.jpa.repository.JpaRepository;

public interface KindsRepository extends JpaRepository<Kind,Long> {

    List<Kind> findByid(Long id);  
  
    
}
