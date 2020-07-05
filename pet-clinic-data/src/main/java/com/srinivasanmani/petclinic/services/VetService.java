package com.srinivasanmani.petclinic.services;

import com.srinivasanmani.petclinic.model.Vet;

import java.util.Set;

/**
 * User: Srini
 * Date: 5/7/20
 * Project: petclinic
 */
public interface VetService {
    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
