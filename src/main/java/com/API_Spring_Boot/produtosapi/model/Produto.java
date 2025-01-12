package com.API_Spring_Boot.produtosapi.model;

public class Produto {
    private String name;
    private Double price;
    private Integer id;
    private String description;

    public Produto(String name, Double price, String description) {
        this.id = 1;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getDescrition() {
        return description;
    }

    public void setDescrition(String descrition) {
        this.description = descrition;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return String.format(
                "%d, %s: %s - R$ %.2f",
                this.getId(), this.name,
                this.getDescrition(), this.getPrice()
        );
    }
}
