package com.API_Spring_Boot.produtosapi.controller;

import com.API_Spring_Boot.produtosapi.model.Produto;
import com.API_Spring_Boot.produtosapi.repository.ProdutoRepository;
import jakarta.persistence.PostUpdate;
import lombok.Setter;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import  jakarta.persistence.Entity;

import java.util.UUID;

@RestController
@RequestMapping("produtos")
public class ProdutoController {
    private ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }

    @PostMapping("/")
    public Produto store(@RequestBody Produto produto){
        String id = UUID.randomUUID().toString();
        produto.setId(id);
        produtoRepository.save(produto);
        System.out.println(produto);
        return produto;
    }
}
