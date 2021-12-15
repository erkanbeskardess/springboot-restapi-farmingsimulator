package com.fs.farms.repository;

import java.util.List;

import com.fs.farms.entities.Animals;


import org.springframework.data.jpa.repository.JpaRepository;



public interface AnimalsRepository extends JpaRepository <Animals,Long> {
    List<Animals> findAnimalsBykindId(Long kindId);

    Long countAnimalsByKindId(Long kindId);
 
   
    
}
