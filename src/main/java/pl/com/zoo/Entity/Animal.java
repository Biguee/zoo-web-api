package pl.com.zoo.Entity;


import lombok.Data;


import javax.persistence.*;

@Data
@Entity
@Table(name = "animals")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "amount")
    private Integer amount;
    @Column(name = "kind")
    @Enumerated(EnumType.STRING)
    private Kind kind;
    @Column(name = "statusinthewild")
    @Enumerated(EnumType.STRING)
    private StatusInTheWild statusInTheWild;
    @Column(name = "lifespan")
    private Integer lifeSpan;
    @Column(name = "worldrange")
    private String worldRange;

//    public Animal(String name, Integer amount, Kind kind, StatusInTheWild statusInTheWild, Integer lifeSpan, String range) {
//        this.name = name;
//        this.amount = amount;
//        this.kind = kind;
//        this.statusInTheWild = statusInTheWild;
//        this.lifeSpan = lifeSpan;
//        this.range = range;
//    }
//
//    public Animal() {
//    }
}
