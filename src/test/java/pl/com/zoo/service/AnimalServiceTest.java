package pl.com.zoo.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import pl.com.zoo.Entity.Animal;
import pl.com.zoo.Entity.Kind;
import pl.com.zoo.Entity.StatusInTheWild;

import java.util.List;

import static org.junit.Assert.*;

@ContextConfiguration
public class AnimalServiceTest {

    @Configuration
    static class Config {

        // this bean will be injected into the OrderServiceTest class
        @Bean
        public AnimalService animalService() {
            return animalService();
        }
    }

    @Autowired
    AnimalService animalService;

    Animal animal = new Animal("ostrich", 10, Kind.BIRD, StatusInTheWild.NOT_THREATENED, 40, "Africa");

//    @Test
//    public void addAnimal() throws Exception {
//        List<Animal> inputAnimals = (List<Animal>) animalService.allAnimals();
//        int inputSize = inputAnimals.size();
//        System.out.println(inputSize);
//        animalService.addAnimal(animal);
//        int outputSize = ((List<Animal>) animalService.allAnimals()).size();
//        Assert.assertEquals(inputSize+1, outputSize);
//    }
//
//    @Test
//    public void getAnimal() throws Exception {
//        Animal animalById = animalService.getAnimal(animal.getId());
//        Assert.assertEquals(animalById.getKind(), Kind.BIRD);
//    }
//
//    @Test
//    public void updateAnimal() throws Exception {
//    }
//
//    @Test
//    public void deleteAnimal() throws Exception {
//    }
//
//    @Test
//    public void allAnimals() throws Exception {
//    }
//
//    @Test
//    public void getAnimal1() throws Exception {
//    }

}