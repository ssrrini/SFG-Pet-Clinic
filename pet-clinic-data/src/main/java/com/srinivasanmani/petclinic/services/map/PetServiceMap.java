package com.srinivasanmani.petclinic.services.map;

import com.srinivasanmani.petclinic.model.Pet;

/**
 * User: Srini
 * Date: 30/7/20
 * Project: petclinic
 */
public class PetServiceMap extends AbstractMapService<Pet,Long> {
    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(),object);
    }
}
