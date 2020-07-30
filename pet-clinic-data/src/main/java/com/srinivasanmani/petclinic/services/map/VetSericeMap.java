package com.srinivasanmani.petclinic.services.map;

import com.srinivasanmani.petclinic.model.Vet;

/**
 * User: Srini
 * Date: 30/7/20
 * Project: petclinic
 */
public class VetSericeMap extends AbstractMapService<Vet,Long> {
    @Override
    public Vet save(Vet object) {
        return save(object.getId(),object);
    }
}
