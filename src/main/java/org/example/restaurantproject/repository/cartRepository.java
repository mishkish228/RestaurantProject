package org.example.restaurantproject.repository;

import org.example.restaurantproject.entity.cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface cartRepository extends
        JpaRepository<cart, Long> {
}
