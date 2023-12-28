package ru.netology.authorizationservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.authorizationservice.controller.AuthorizationController;
import ru.netology.authorizationservice.repository.UserRepository;
import ru.netology.authorizationservice.service.AuthorizationService;

@Configuration
public class AppConfig {
    @Bean
    public AuthorizationController authorizationController(AuthorizationService service){
        return new AuthorizationController(service);
    }

    @Bean
    public AuthorizationService authorizationService(UserRepository userRepository){
        return new AuthorizationService(userRepository);
    }

    @Bean
    public UserRepository userRepository(){
        return  new UserRepository();
    }

}
