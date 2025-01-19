package com.API_Spring_Boot.produtosapi.repository;

import com.API_Spring_Boot.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {

}
