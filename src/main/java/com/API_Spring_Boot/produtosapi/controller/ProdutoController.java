package com.API_Spring_Boot.produtosapi.controller;

import com.API_Spring_Boot.produtosapi.model.Produto;
import com.API_Spring_Boot.produtosapi.repository.ProdutoRepository;
import jakarta.persistence.PostUpdate;
import lombok.Setter;
import org.springframework.web.bind.annotation.*;
import  jakarta.persistence.Entity;

import java.util.Optional;
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

    @GetMapping("/{id}")
    public Produto getProduct(@PathVariable("id") String id){
        return this.produtoRepository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String id){
        this.produtoRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") String id, @RequestBody Produto produto){
      produto.setId(id);
      produtoRepository.save(produto);
    }
}
