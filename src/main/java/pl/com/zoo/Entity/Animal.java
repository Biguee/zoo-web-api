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
    Long id;
    @Column
    String name;
    @Column
    Integer amount;
    @Column
    @Enumerated(EnumType.STRING)
    Kind kind;
    @Column
    @Enumerated(EnumType.STRING)
    StatusInTheWild statusInTheWild;
    @Column
    Integer lifeSpan;
    @Column
    ArrayList<String> range;

}
