package pl.com.zoo.controller;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import pl.com.zoo.Entity.Animal;
import pl.com.zoo.Entity.Kind;
import pl.com.zoo.Entity.StatusInTheWild;
import pl.com.zoo.service.AnimalService;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class AnimalControllerTest {

    @Autowired
    private transient AnimalController animalController;


//    @Test
//    public void addAnimal() throws Exception {
//    }
//
//    @org.junit.Test
//    public void getAnimal() throws Exception {
//    }
//
//    @org.junit.Test
//    public void getAnimals() throws Exception {
//    }
//
//    @org.junit.Test
//    public void updateAnimal() throws Exception {
//    }
//
//    @org.junit.Test
//    public void deleteAnimal() throws Exception {
//    }
//
//    @Test
//    public static JavaArchive createDeployment() {
//        return ShrinkWrap.create(JavaArchive.class)
//                .addClass(AnimalController.class)
//                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
//    }

}
