package com.edgar;

import com.edgar.entities.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Game game(){
        return new FootballGame(barca(), real());
    }

    @Bean
    public Team barca() {
        return new Barcelona();
    }

    @Bean
    public Team real() {
        return new RealMadrid();
    }
}
