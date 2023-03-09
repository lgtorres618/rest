package com.vcrts.rest.Client;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ClientConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            ClientRepository repository)
    {
        return args -> {
            Client Adam = new Client(
                    993,
                    "Adam",
                    "Adam@gmail.com",
                    321

            );

            Client Jordan = new Client(
                    992,
                    "Jordan",
                    "Adam@gmail.com",
                    123
            );
            repository.saveAll(
                    List.of(Adam, Jordan)
            );


        };




    }
}
