package pl.com.zoo.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Data
@Table(name = "animals")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    @Column
    private String name;
    @Column
    private Integer amount;
    @Column
    @Enumerated(EnumType.STRING)
    private Kind kind;
    @Column(name = "statusinthewild")
    @Enumerated(EnumType.STRING)
    private StatusInTheWild statusInTheWild;
    @Column(name = "lifespan")
    private Integer lifeSpan;
    @Column
    private String range;

}
