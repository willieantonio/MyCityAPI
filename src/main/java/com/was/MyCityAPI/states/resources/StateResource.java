package com.was.MyCityAPI.states.resources;

import com.was.MyCityAPI.states.entities.State;
import com.was.MyCityAPI.states.repositories.StateRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/staties")
public class StateResource {

    private final StateRepository repository;

    public StateResource(final StateRepository repository){
        this.repository = repository;
    }
    //Criando a lista de estados
    @GetMapping
    public List<State> staties(){
        return repository.findAll();
    }
}
