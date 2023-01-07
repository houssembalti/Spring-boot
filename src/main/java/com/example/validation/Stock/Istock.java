package com.example.validation.Stock;

import com.example.validation.Generic.IGeneric;
import com.example.validation.entities.Stock;

public interface Istock extends IGeneric<Stock,Long> {

    void retrieveStatusStock();

}
