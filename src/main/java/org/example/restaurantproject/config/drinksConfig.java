package org.example.restaurantproject.config;

import lombok.AllArgsConstructor;
import org.example.restaurantproject.entity.drinks;
import org.example.restaurantproject.repository.drinksRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@AllArgsConstructor
public class drinksConfig {

    @Bean
    CommandLineRunner commandLineRunnerr(drinksRepository DrinksRepository) {
        return args -> {
            var drinksList = List.of(
                    new drinks(null,
                            "Кока-кола",
                            125
                    ),
                    new drinks(null,
                            "Черноголовка",
                            95
                    )
            );
            DrinksRepository.saveAll(drinksList);
        };
    }
}
