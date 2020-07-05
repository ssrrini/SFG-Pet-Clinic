package com.srinivasanmani.petclinic.model;

import java.io.Serializable;

/**
 * User: Srini
 * Date: 5/7/20
 * Project: petclinic
 */
public class BaseEntity implements Serializable {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
