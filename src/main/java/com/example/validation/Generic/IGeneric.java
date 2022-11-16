package com.example.validation.Generic;

import java.util.List;

public interface IGeneric<T,ID> {
    public List<T> retrieveAll();

    public T add(T entity);


    public T retrieve (ID id);

    public  void Delete (ID id);

    public T update (T entity);
}
