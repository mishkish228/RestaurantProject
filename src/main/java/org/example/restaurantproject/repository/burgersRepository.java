package org.example.restaurantproject.repository;

import org.example.restaurantproject.entity.burgers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface burgersRepository extends
        JpaRepository<burgers, Long> {
}
