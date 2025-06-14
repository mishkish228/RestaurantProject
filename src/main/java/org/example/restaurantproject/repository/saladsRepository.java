package org.example.restaurantproject.repository;

import org.example.restaurantproject.entity.salads;
import org.springframework.data.jpa.repository.JpaRepository;

public interface saladsRepository extends
        JpaRepository<salads, Long> {
}
