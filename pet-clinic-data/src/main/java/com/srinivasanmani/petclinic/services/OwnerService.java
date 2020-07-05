package com.srinivasanmani.petclinic.services;

import com.srinivasanmani.petclinic.model.Owner;

import java.util.Set;

/**
 * User: Srini
 * Date: 5/7/20
 * Project: petclinic
 */
public interface OwnerService {

    Owner findById(Long id);

    Owner findByLastName(String lastName);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
