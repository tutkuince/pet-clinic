package com.muditasoft.petclinic.services.map;

import com.muditasoft.petclinic.model.Vet;
import com.muditasoft.petclinic.services.CrudService;

import java.util.Set;

/**
 * @author tutkuince
 * Date 11/23/2018
 */
public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
