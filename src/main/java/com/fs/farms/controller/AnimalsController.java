package com.fs.farms.controller;


import java.util.List;


import com.fs.farms.entities.Animals;
import com.fs.farms.entities.Kind;
import com.fs.farms.service.AnimalService;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/animals")
public class AnimalsController {


    private AnimalService animalService;

    public AnimalsController(AnimalService animalService){
        this.animalService =animalService;
    }
    @GetMapping("/kinds/{kindId}")
    public List<Animals> getAnimalsByKindId(@PathVariable Long kindId){
        return animalService.getAnimalsByKindId(kindId);

    }
    @GetMapping("/kinds/count/{kindId}")
    public  Long countAnimalsByKindId(@PathVariable Long kindId){
        return animalService.countAnimalsByKindId(kindId);
        

    }


    @GetMapping
    public List<Animals> getAllAnimals(){
        return animalService.getAllAnimals();
    }
    @PostMapping("/{kindId}")
    public Animals createAnimals(@RequestBody Animals newanimal,@PathVariable Kind kindId){
            return animalService.saveOneAnimals(newanimal,kindId);
    }
        
    @GetMapping("/{id}")
    public Animals getOneAnimals(@PathVariable Long id){
        return animalService.getOneAnimals(id);
    }
    @PutMapping("/{id}")
    public Animals updateOneAnimals(@PathVariable Long id,@RequestBody Animals newanimal){
       return animalService.updateOneAnimals(id,newanimal);
    }
    @DeleteMapping("/{id}")
    public void deleteOneAnimals(@PathVariable Long id){
        animalService.deleteById(id);
    }
    
}



   
    
    

