package com.example.validation.Generic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public class IGenericimp<T,ID> implements IGeneric<T,ID>  {
    @Autowired
    JpaRepository<T,ID> jpaRepository;

    @Override
    public List<T> retrieveAll() {
        return jpaRepository.findAll();
    }

    @Override
    public T add(T entity) {
        return jpaRepository.save(entity);
    }

    @Override
    public T retrieve(ID id) {
        return jpaRepository.findById(id).orElse(null);
    }

    @Override
    public void Delete(ID id) {
         jpaRepository.deleteById(id);
    }

    @Override
    public T update(T entity) {
        return jpaRepository.save(entity);
    }
}
