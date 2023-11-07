package com.example.ekWateur.testTech;

import lombok.Data;

import java.util.Random;

@Data
public class Client {

    private String referenceClient;
    protected double consommationElectricite;
    protected double consommationGaz;


    public Client(double consommationElectricite, double consommationGaz) {

        int random = new Random().nextInt(1000000000);
        this.referenceClient= new StringBuilder("EKW").append(random).toString();
        this.consommationElectricite = consommationElectricite;
        this.consommationGaz = consommationGaz;
    }

}
