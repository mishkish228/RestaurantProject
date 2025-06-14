package org.example.restaurantproject.repository;

import org.example.restaurantproject.entity.drinks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface drinksRepository extends
    JpaRepository<drinks, Long> {
}
