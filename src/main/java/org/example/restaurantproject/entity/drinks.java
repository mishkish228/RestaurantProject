package org.example.restaurantproject.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "drinksConfig")
public class drinks {

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "drinks_seq")
    @SequenceGenerator(name = "drinks_seq", sequenceName = "drinks_seq", allocationSize = 1)
    @Id
    private Long id;

    private String name;

    private double price;

    public drinks() {
    }

    public drinks(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
