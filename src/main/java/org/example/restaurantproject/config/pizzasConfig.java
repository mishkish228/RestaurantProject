package org.example.restaurantproject.config;

import lombok.AllArgsConstructor;
import org.example.restaurantproject.entity.pizzas;
import org.example.restaurantproject.repository.pizzasRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@AllArgsConstructor
public class pizzasConfig {


    @Bean
    CommandLineRunner commandLineRunners(pizzasRepository PizzasRepository) {
        return args -> {
            var pizzasList = List.of(
                    new pizzas(null,
                            "Маргарита",
                            1250
                    ),
                    new pizzas(null,
                            "Пипперони",
                            1439
                    )
            );
            PizzasRepository.saveAll(pizzasList);
        };
    }
}
