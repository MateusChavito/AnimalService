package br.com.mateus.animal_service.repositorios;

import br.com.mateus.animal_service.entidades.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {

}
