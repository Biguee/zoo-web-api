package pl.com.zoo.common;

import lombok.Data;

@Data
public class ExceptionDto {

    private String description;

    public ExceptionDto() {
    }

    public ExceptionDto(String description) {
        this.description = description;
    }

}
