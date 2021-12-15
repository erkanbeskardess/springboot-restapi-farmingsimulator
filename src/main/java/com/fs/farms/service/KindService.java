package com.fs.farms.service;

import java.util.List;


import com.fs.farms.entities.Kind;

import com.fs.farms.repository.KindsRepository;

import org.springframework.stereotype.Service;
@Service
public class KindService {
    
    private KindsRepository kindsRepository;
   

    public KindService(KindsRepository kindsRepository){
        this.kindsRepository =kindsRepository;
     
    }

    public List<Kind> getAllKinds() {
        
        return kindsRepository.findAll();
        
        
    }
    public Kind getOneKinds(Long id) {
        return kindsRepository.findById(id).orElse(null);
    }

   


}
