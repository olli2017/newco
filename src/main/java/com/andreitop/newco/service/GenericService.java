package com.andreitop.newco.service;

import java.util.List;

public interface GenericService<T> {

    List<T> findAll();

    T findById(Long id);

    void save(T t);

    void delete(Long id);

    void update(T newT);
}
