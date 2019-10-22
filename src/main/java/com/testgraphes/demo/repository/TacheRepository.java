package com.testgraphes.demo.repository;

import com.testgraphes.demo.model.Tache;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface TacheRepository extends CrudRepository<Tache,Integer> {

    Iterable<Tache> getTachesByDateIsNull();
    Iterable<Tache> getTachesByDateIsNotNull();




}
