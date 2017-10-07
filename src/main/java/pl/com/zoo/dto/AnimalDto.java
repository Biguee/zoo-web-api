package pl.com.zoo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import pl.com.zoo.Entity.Kind;
import pl.com.zoo.Entity.StatusInTheWild;

@Data
@ApiModel(value = "Animal")
public class AnimalDto {

    @ApiModelProperty
    private Long id;
    @ApiModelProperty
    private String name;
    @ApiModelProperty
    private Integer amount;
    @ApiModelProperty
    private Kind kind;
    @ApiModelProperty
    private StatusInTheWild statusInTheWild;
    @ApiModelProperty
    private Integer lifeSpan;
    @ApiModelProperty
    private String worldRange;

}
