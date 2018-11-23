package com.muditasoft.petclinic.services.map;

import com.muditasoft.petclinic.model.Pet;
import com.muditasoft.petclinic.services.CrudService;

import java.util.Set;

/**
 * @author tutkuince
 * Date 11/23/2018
 */
public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
