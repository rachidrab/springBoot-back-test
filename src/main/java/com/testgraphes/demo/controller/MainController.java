package com.testgraphes.demo.controller;

import com.testgraphes.demo.model.Tache;
import com.testgraphes.demo.repository.TacheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@Controller
@RequestMapping(path="/api")
public class MainController {


    @Autowired
    private TacheRepository tacheRepository;



    @GetMapping(path = "/taches/all")
    public @ResponseBody List<Tache> getAllTaches() {

        List<Tache> taches = new ArrayList<>();
        tacheRepository.findAll().forEach(taches ::add);
        return taches;
    }


    @GetMapping(path = "/taches/graphe1")
    public @ResponseBody List<Tache> getTaches1() {

        List<Tache> taches = new ArrayList<>();
        tacheRepository.getTachesByDateIsNull().forEach(taches ::add);
        return taches;
    }


    @GetMapping(path = "/taches/graphe2")
    public @ResponseBody List<Tache> getTaches2() {

        List<Tache> taches = new ArrayList<>();
        tacheRepository.getTachesByDateIsNotNull().forEach(taches ::add);
        return taches;
    }


















}
