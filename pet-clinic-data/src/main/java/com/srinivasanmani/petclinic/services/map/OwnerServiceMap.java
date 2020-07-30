package com.srinivasanmani.petclinic.services.map;

import com.srinivasanmani.petclinic.model.Owner;
import com.srinivasanmani.petclinic.services.CrudService;

import java.util.Set;

/**
 * User: Srini
 * Date: 30/7/20
 * Project: petclinic
 */
public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements CrudService<Owner,Long> {


    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(),object);
    }

}
