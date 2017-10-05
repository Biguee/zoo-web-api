package pl.com.zoo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.com.zoo.Entity.Animal;

@Repository
@Transactional
public interface AnimalRepository extends JpaRepository<Animal, Long> {
}
