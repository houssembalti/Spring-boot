package com.example.validation.Operateur;

import com.example.validation.Generic.GenericController;
import com.example.validation.entities.Operateur;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/operateur")
public class OperateurController extends GenericController<Operateur,Long> {
}
