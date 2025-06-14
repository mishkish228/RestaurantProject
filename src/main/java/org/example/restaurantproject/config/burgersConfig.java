package org.example.restaurantproject.config;

import lombok.AllArgsConstructor;
import org.example.restaurantproject.entity.burgers;
import org.example.restaurantproject.repository.burgersRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@AllArgsConstructor
public class burgersConfig {

    @Bean
    CommandLineRunner commandLineRunner(burgersRepository BurgersRepository) {
        return args -> {
            var burgersList = List.of(
                    new burgers(null,
                            "Сочный Бургер",
                            220
                    ),
                    new burgers(null,
                            "Острый Бургер",
                            190
                    )
            );
            BurgersRepository.saveAll(burgersList);
        };
    }
}
