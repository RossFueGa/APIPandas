package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Adrian
 */
@RestController
@RequestMapping("/api")
public class ControllerPandas {

    @Autowired
    private RepositoryPanda repoPanda;

    @GetMapping(path = "/pandas/{id}")
    public Panda getPandaById(@PathVariable String id) {
        repoPanda.findById(id);
        
        Panda panUno = new Panda();
        panUno.setId("14");
        panUno.setNickname("Meng Xiang");
        panUno.setAge("13 años");
        panUno.setWeight("300 lb");
        repoPanda.save(panUno);
        
        Panda panDos = new Panda();
        panDos.setId("14");
        panDos.setNickname("Xing Xiang");
        panDos.setAge("14 años");
        panDos.setWeight("300 lb");
        repoPanda.save(panDos);
        
         if (id=="1")
            return panUno;
        else
            return panDos;
        
    }
    
     @GetMapping(path = "/pandas")
    public List<Panda> getAllPandas() {
         List<Panda> lsPandas = new ArrayList<>();
         
         Panda pandaUno = new Panda();
         
         pandaUno.setId("1");
         pandaUno.setNickname("Meng Yuan");
         pandaUno.setAge("10 años");
         pandaUno.setWeight("23 lb");
         lsPandas.add(pandaUno);
         
         return repoPanda.findAll();
        
    }

    }
