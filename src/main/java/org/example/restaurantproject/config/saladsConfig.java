package org.example.restaurantproject.config;

import lombok.AllArgsConstructor;
import org.example.restaurantproject.entity.salads;
import org.example.restaurantproject.repository.saladsRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@AllArgsConstructor
public class saladsConfig {

    @Bean
    CommandLineRunner commandLineRunnerrs(saladsRepository SaladsRepository) {
        return args -> {
            var saladsList = List.of(
                    new salads(null,
                            "Цезарь",
                            550
                    ),
                    new salads(null,
                            "Оливье",
                            370
                    )
            );
            SaladsRepository.saveAll(saladsList);
        };
    }
}
