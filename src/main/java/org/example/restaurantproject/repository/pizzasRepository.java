package org.example.restaurantproject.repository;

import org.example.restaurantproject.entity.pizzas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface pizzasRepository extends
        JpaRepository<pizzas, Long> {
}
