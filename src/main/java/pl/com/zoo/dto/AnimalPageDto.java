package pl.com.zoo.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.util.List;

@Data
@ApiModel(value = "animal")
public class AnimalPageDto {

    private List<AnimalDto> animals;
    private int pageNumber;
    private int totalPages;

    public AnimalPageDto() {
    }

    public AnimalPageDto(List<AnimalDto> animals, int pageNumber, int totalPages) {
        this.animals = animals;
        this.pageNumber = pageNumber;
        this.totalPages = totalPages;
    }
}
