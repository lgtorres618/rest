package com.vcrts.rest.owner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class OwnerConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            OwnerRepository repository)
    {
        return args -> {
            Owner Luis = new Owner(
                    "Luis",
                    LocalDate.of(2000, Month.JUNE, 18),
                    "luis@gmail.com",
                    "model1"

            );

            Owner Kevin = new Owner(
                    "Kevin",
                    LocalDate.of(1999, Month.AUGUST, 19),
                    "kevin@gmail.com",
                    "model2"
            );
            repository.saveAll(
                    List.of(Luis, Kevin)
            );


        };




    }
}
