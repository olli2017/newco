package com.andreitop.newco.controller;

import java.util.List;

public interface GenericController<T> {

    List<T> findAll();

    T findById(Long id);

    void create(T t);

    void delete(Long id);

    void update(T newT);
}
