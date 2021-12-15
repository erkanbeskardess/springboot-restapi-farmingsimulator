package com.fs.farms.controller;

import java.util.List;


import com.fs.farms.entities.Kind;
import com.fs.farms.service.KindService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kinds")
public class KindsController {
     private KindService kindService;

     public KindsController(KindService kindService){
        this.kindService =kindService;
    }
    @GetMapping("/{id}")
    public Kind getOneKinds(@PathVariable Long id){
        return kindService.getOneKinds(id);
    }

    @GetMapping
    public List<Kind> getAllKinds(){
        return kindService.getAllKinds();
    }
   

    

}
