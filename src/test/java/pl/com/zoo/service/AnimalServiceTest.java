package pl.com.zoo.service;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import pl.com.zoo.Entity.Animal;
import pl.com.zoo.Entity.Kind;
import pl.com.zoo.Entity.StatusInTheWild;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class AnimalServiceTest extends AbstractTransactionalJUnit4SpringContextTests{

    @Autowired
    private transient AnimalService animalService;

    Animal animalTest = new Animal("ostrich", 10, Kind.BIRD, StatusInTheWild.NOT_THREATENED, 40, "Africa");

    @Test
    public void shouldAddAnimal() throws Exception{
        animalService.addAnimal(animalTest);
        Animal animalById = animalService.getAnimal(animalTest.getId());
        Assert.assertEquals(animalById.getName(), "ostrich");
    }

    @Test
    public void shouldGetAnimal() throws Exception{
        animalService.addAnimal(animalTest);
        Animal animalById = animalService.getAnimal(animalTest.getId());
        Assertions.assertThat(animalById.getName()).contains("ostrich");
        Assertions.assertThat(animalById.getName()).isNotEmpty();
    }

    @Test
    public void shouldUpdateAnimal() throws Exception {
        animalTest.setName("parrot");
        animalService.updateAnimal(animalTest);
        Assertions.assertThat(animalTest.getName()).contains("parrot");
    }

    @Test
    public void shouldDeleteAnimal() throws Exception {
        animalService.addAnimal(animalTest);
        Animal animalById = animalService.getAnimal(animalTest.getId());
        animalService.deleteAnimal(animalById.getId());
        Iterable<Animal> iterableList = animalService.allAnimals();
        List<Animal> animalList =new ArrayList<>();
        iterableList.forEach(animalList::add);
        Assertions.assertThat(animalList).doesNotContain(animalById);
    }

    @Test
    public void shouldListAnimals() throws Exception {
        animalService.addAnimal(animalTest);
        Iterable<Animal> iterableList = animalService.allAnimals();
        List<Animal> animalList = new ArrayList<>();
        iterableList.forEach(animalList::add);
        Assertions.assertThat(animalList.size()).isGreaterThan(0);
    }

}