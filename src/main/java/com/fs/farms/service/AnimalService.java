package com.fs.farms.service;

import java.util.List;
import java.util.Optional;

import com.fs.farms.entities.Animals;
import com.fs.farms.entities.Kind;
import com.fs.farms.repository.AnimalsRepository;


import org.springframework.stereotype.Service;

@Service
public class AnimalService {
    
    private AnimalsRepository animalsRepository;
   

    public AnimalService(AnimalsRepository animalsRepository ){
        this.animalsRepository =animalsRepository;
  
    }

    public List<Animals> getAllAnimals() {
        return animalsRepository.findAll();
    }

    public Animals saveOneAnimals(Animals newanimal,Kind kindId) {
        newanimal.setKind(kindId);
        return animalsRepository.save(newanimal);
    }

    public Animals getOneAnimals(Long id) {
        return animalsRepository.findById(id).orElse(null);
    }

    public Animals updateOneAnimals(Long id, Animals newanimal) {
        Optional<Animals> animal = animalsRepository.findById(id);
        if(animal.isPresent()){
            Animals foundAnimals= animal.get();
            foundAnimals.setanimalName(newanimal.getanimalName());
            foundAnimals.setLegs(newanimal.getLegs());

            foundAnimals.setFeed(newanimal.getFeed());

            foundAnimals.setDesc(newanimal.getDesc());
            animalsRepository.save(foundAnimals);
            return foundAnimals;
        }
        else{
            return null;
        }
    }

    public void deleteById(Long id) {
        animalsRepository.deleteById(id);
    }

    public List<Animals> getAnimalsByKindId(Long kindId) {
        return animalsRepository.findAnimalsBykindId(kindId);
    }
    public  Long countAnimalsByKindId(Long kindId) {

      return animalsRepository.countAnimalsByKindId(kindId);
        //return animalsRepository.findAnimalsBykindId(kindId).size();
    }

    
}
