package org.example.restaurantproject.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "burgersConfig")
public class burgers {

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "burgers_seq")
    @SequenceGenerator(name = "burgers_seq", sequenceName = "burgers_seq", allocationSize = 1)
    @Id
    private long id;

    private String name;

    private double price;

    public burgers() {
    }

    public burgers(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
