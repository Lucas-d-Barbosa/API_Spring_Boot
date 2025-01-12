package com.API_Spring_Boot.produtosapi.controller;

import com.API_Spring_Boot.produtosapi.model.Produto;
import lombok.Setter;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    @PostMapping("/")
    public Produto store(@RequestBody Produto produto){
        System.out.println(produto);
        return produto;
    }
}
