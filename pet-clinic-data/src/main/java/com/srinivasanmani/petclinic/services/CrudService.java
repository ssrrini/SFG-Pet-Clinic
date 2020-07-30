package com.srinivasanmani.petclinic.services;

import java.util.Set;

/**
 * User: Srini
 * Date: 30/7/20
 * Project: petclinic
 */
public interface CrudService<T, ID> {
    Set<T> findAll();
    T findById(ID id);
    T save(T object);
    void delete(T object);
    void deleteById(ID id);
}
