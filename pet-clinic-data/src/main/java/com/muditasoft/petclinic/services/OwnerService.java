package com.muditasoft.petclinic.services;

import com.muditasoft.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
