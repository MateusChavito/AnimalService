package br.com.mateus.animal_service.repositorios;

import br.com.mateus.animal_service.entidades.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {
    @Query("SELECT a FROM Animal a WHERE a.dataAdocao IS NULL AND a.tipo = :tipo ORDER BY a.dataEntrada")
    List<Animal>findNotAdoptedByTipo(@Param("tipo") String tipo);

    @Query("SELECT a FROM Animal a WHERE a.dataAdocao IS NOT NULL AND a.tipo = :tipo")
    List<Animal>findAdoptedByTipo(@Param("tipo") String tipo);
}
