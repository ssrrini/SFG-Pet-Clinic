package com.srinivasanmani.petclinic.services;

import com.srinivasanmani.petclinic.model.Pet;

import java.util.Set;

/**
 * User: Srini
 * Date: 5/7/20
 * Project: petclinic
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet ) ;

    Set<Pet> findAll();
}
