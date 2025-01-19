package com.API_Spring_Boot.produtosapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "produto")
public class Produto {
    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Double price;

    @Id
    @Column(name = "id", unique = true)
    private String id;

    @Column(name = "description")
    private String description;

    public Produto() {

    }

    public Produto(String name, Double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescrition(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return String.format(
                "%s, %s: %s - R$ %.2f",
                this.getId(), this.name,
                this.getDescription(), this.getPrice()
        );
    }
}
