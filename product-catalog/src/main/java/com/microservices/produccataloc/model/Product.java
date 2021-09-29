package com.microservices.produccataloc.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;


// type
@Document(indexName = "product")        // Define o nome do incide e tipo do objeto que sera persistido no ElasticSerarch //ANALOGIA = "ElasticSearch X Banco de dados =  os indicies do ElasticSearch sao como as tabelas do banco de dados"
public class Product {

    @Id
    private Long id;
    private String name;
    private Integer amount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
