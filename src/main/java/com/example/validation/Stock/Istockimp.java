package com.example.validation.Stock;

import com.example.validation.Generic.IGenericimp;
import com.example.validation.entities.Stock;
import org.springframework.stereotype.Service;

@Service
public class Istockimp extends IGenericimp<Stock,Long> implements  Istock{
}
