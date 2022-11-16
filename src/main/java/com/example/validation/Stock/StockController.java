package com.example.validation.Stock;

import com.example.validation.Generic.GenericController;
import com.example.validation.entities.Stock;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock")
public class StockController extends GenericController<Stock,Long> {
}
