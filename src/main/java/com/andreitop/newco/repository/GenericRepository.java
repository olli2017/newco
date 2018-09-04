package com.andreitop.newco.repository;

import java.util.List;

public interface GenericRepository<T> {

    List<T> findAll();

    T findById(Long id);

    void save(T t);

    void delete(Long id);

    void update(T newT);
}
