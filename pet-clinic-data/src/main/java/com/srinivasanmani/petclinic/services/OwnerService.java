package com.srinivasanmani.petclinic.services;

import com.srinivasanmani.petclinic.model.Owner;

import java.util.Set;

/**
 * User: Srini
 * Date: 5/7/20
 * Project: petclinic
 */
public interface OwnerService extends CrudService<Owner,Long> {

    Owner findByLastName(String lastName);

}
