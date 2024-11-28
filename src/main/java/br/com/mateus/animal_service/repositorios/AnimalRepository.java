package br.com.mateus.animal_service.repositorios;

import br.com.mateus.animal_service.entidades.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {
    @Query("SELECT a FROM Animal a WHERE a.dataAdocao IS NULL ORDER BY a.dataEntrada")
    List<Animal>findNotAdopted();

    @Query("SELECT a FROM Animal a WHERE a.dataAdocao IS NULL")
    List<Animal>findAdopted();

}
