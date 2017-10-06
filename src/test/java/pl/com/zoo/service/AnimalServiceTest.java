package pl.com.zoo.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import pl.com.zoo.Entity.Animal;
import pl.com.zoo.Entity.Kind;
import pl.com.zoo.Entity.StatusInTheWild;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
@Transactional
public class AnimalServiceTest extends AbstractTransactionalJUnit4SpringContextTests {


    @Autowired
    AnimalService animalService;

    @Test
    public void addAnimal() throws Exception {
        int inputSize = ((List<Animal>) animalService.allAnimals()).size();
        Animal animal = new Animal("ostrich", 10, Kind.BIRD, StatusInTheWild.NOT_THREATENED, 40, "Africa");
        animalService.addAnimal(animal);
        int outputSize = ((List<Animal>) animalService.allAnimals()).size();
        Assert.assertEquals(inputSize+1, outputSize);
    }
//
//    @Test
//    public void getAnimal() throws Exception {
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