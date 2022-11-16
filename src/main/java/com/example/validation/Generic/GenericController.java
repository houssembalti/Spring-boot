package com.example.validation.Generic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class GenericController<T,ID> {
    @Autowired
    IGeneric<T,ID>   iGeneric;
    @GetMapping()
    public List<T> retrieveAll(){
            return  iGeneric.retrieveAll();
    }
    @PostMapping
    public T add(@RequestBody  T entity){
        return  iGeneric.add(entity);
    }

@GetMapping("/search/{id}")
    public T retrieve (@PathVariable(value = "id") ID id){
        return iGeneric.retrieve(id);
    }
@DeleteMapping("/{id}")
    public  void Delete (@PathVariable(value = "id") ID id){
        iGeneric.Delete(id);
    }
    @PutMapping
    public T update (@RequestBody T entity){
        return  iGeneric.update(entity);
    }
}
