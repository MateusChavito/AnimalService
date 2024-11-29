package br.com.mateus.animal_service.controllers;

import br.com.mateus.animal_service.entidades.Animal;
import br.com.mateus.animal_service.repositorios.AnimalRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animais")
public class AnimalController {
    private AnimalRepository repository;

    public AnimalController (AnimalRepository repository){
        this.repository = repository;
    }

    @GetMapping
    private List<Animal> findAll(){
        return repository.findAll();
    }

    @PostMapping
    private Animal create(@RequestBody Animal animal) {
        return repository.save(animal);
    }

    @GetMapping("/not-adopted/{tipo}")
    private List<Animal> findNotAdoptedByTipo(@PathVariable String tipo) {
        return repository.findNotAdoptedByTipo(tipo);
    }

    @GetMapping("/adopted/{tipo}")
    private List<Animal> findAdoptedByTipo(@PathVariable String tipo) {
        return repository.findAdoptedByTipo(tipo);
    }
}
