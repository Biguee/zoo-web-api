package pl.com.zoo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.com.zoo.Entity.Animal;
import pl.com.zoo.common.Mapper;
import pl.com.zoo.common.ResultPage;
import pl.com.zoo.common.UriBuilder;
import pl.com.zoo.dto.AnimalDto;
import pl.com.zoo.dto.AnimalPageDto;
import pl.com.zoo.service.AnimalService;
import java.net.URI;
import java.util.List;

import static org.springframework.http.ResponseEntity.created;

@Api(description = "Animals resource")
@RequestMapping(value = UriBuilder.PREFIX + "/animals")
@RestController
public class AnimalController {

    private AnimalService animalService;
    private Mapper mapper;
    private UriBuilder uriBuilder = new UriBuilder();

    @Autowired
    public AnimalController(AnimalService animalService, Mapper mapper) {
        this.animalService = animalService;
        this.mapper = mapper;
    }

    @ApiOperation(value = "Add new animal")
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Object> addAnimal(@ApiParam(name = "animal")@RequestBody AnimalDto animalDto){
        Animal animal = mapper.map(animalDto, Animal.class);
        animalService.addAnimal(animal);
        URI uri = uriBuilder.requestUriWithId(animal.getId());
        return created(uri).build();
    }

    @ApiOperation(value = "Get current animal", response = AnimalDto.class)
    @RequestMapping(value = "active", method = RequestMethod.GET)
    public AnimalDto getAnimal(@ApiParam(name = "animal")@RequestBody AnimalDto animalDto) {
        return mapper.map(animalDto, AnimalDto.class);
    }

    @ApiOperation(value = "Get animals", response = AnimalPageDto.class)
    @RequestMapping(method = RequestMethod.GET)
    public AnimalPageDto getAnimals(
            @RequestParam(required = false, defaultValue = "0", name = "pageNumber") int pageNumber,
            @RequestParam(required = false, defaultValue = "20", name = "pageSize") int pageSize) {
        ResultPage<Animal> resultPage = animalService.getAnimal(pageNumber, pageSize);
        List<AnimalDto> animalDtos = mapper.map(resultPage.getContent(), AnimalDto.class);
        return new AnimalPageDto(animalDtos, resultPage.getPageNumber(), resultPage.getTotalPages());
    }

    @ApiOperation(value = "Update current animal", response = AnimalDto.class)
    @RequestMapping(value = "{id}",method = RequestMethod.PUT)
    public ResponseEntity updateAnimal(@ApiParam(name = "animal")@RequestBody AnimalDto animalDto){
        Animal animal = mapper.map(animalDto, Animal.class);
        animalService.updateAnimal(animal);
        return ResponseEntity.noContent().build();
    }

    @ApiOperation(value = "Delete current animal", response = AnimalDto.class)
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public ResponseEntity deleteAnimal(@ApiParam(name = "animal") @PathVariable ("id") long id){
        animalService.deleteAnimal(id);
        return ResponseEntity.noContent().build();
    }

}
