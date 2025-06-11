package org.example.restaurantproject.config;

import lombok.AllArgsConstructor;
import org.example.restaurantproject.repository.drinksRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AllArgsConstructor
public class burgers {


    @Bean
    CommandLineRunner commandLineRunner(drinksRepository DrinkRepository) {
        return args -> {
            var drinksList = List.of(
                    new drinks(null,
                            "Кока-кола",
                            200)
            )
        }
    }
}
