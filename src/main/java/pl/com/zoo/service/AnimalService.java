package pl.com.zoo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.com.zoo.Entity.Animal;
import pl.com.zoo.repository.AnimalRepository;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    public void addAnimal(Animal animal){ animalRepository.save(animal); }

    public Animal getAnimal(long id){ return animalRepository.findOne(id); }

    public void updateAnimal(Animal animal){
        animalRepository.save(animal);
    }

    public void deleteAnimal(Long id) {
        animalRepository.delete(id);
    }

    public Iterable<Animal> allAnimals(){
        return animalRepository.findAll();
    }

}
