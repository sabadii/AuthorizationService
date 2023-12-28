package ru.netology.authorizationservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
