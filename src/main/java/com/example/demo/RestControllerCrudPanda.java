package com.example.demo;

import com.example.demo.RepositoryPanda;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class RestControllerCrudPanda {

    @Autowired
    private RepositoryPanda pan;

    @GetMapping(path = "/pandarest")
    public List<Panda> list() {
        return pan.findAll();
    }

    @PostMapping(path = "/pandarest")
    public void add(@RequestBody Panda pandita) {
        pan.save(pandita);
    }

    @PutMapping(path = "/pandarest")
    public void edit(@RequestBody Panda pandita) {
        pan.save(pandita);
        
    }
    
    @DeleteMapping(value = "/pandarest/{id}")
    public void delete(@PathVariable("id") String id) {
        pan.deleteById(id);
    }

    @GetMapping(value = "/pandarest/{id}")
    public Panda listarId(@PathVariable("id") String id) {
        Optional<Panda> findById = pan.findById(id);
        return findById.get();
    }

}
