package com.example.EsercizioSpring9.entities;

import jakarta.persistence.*;


@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String modelName;

    @Column(nullable = false)
    private String serialNumber;

    private Double currentPrice;

    public Car() {
    }

    public Car(Long id, String modelName, String serialNumber, Double currentPrice) {
        this.id = id;
        this.modelName = modelName;
        this.serialNumber = serialNumber;
        this.currentPrice = currentPrice;
    }
    public Long getId() {
        return id;
    }
    public String getModelName() {
        return modelName;
    }
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    public String getSerialNumber() {
        return serialNumber;
    }
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    public Double getCurrentPrice() {
        return currentPrice;
    }
    public void setCurrentPrice(Double currentPrice) {
        this.currentPrice = currentPrice;
    }
}