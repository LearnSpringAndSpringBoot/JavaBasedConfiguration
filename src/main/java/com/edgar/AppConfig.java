package com.edgar;

import com.edgar.entities.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import javax.sql.DataSource;

@Configuration
@Import(InfrastructureConfig.class)
public class AppConfig {

    @Bean
    public Game game(DataSource dataSource){
        FootballGame footballGame = new FootballGame(barca(), real());
        footballGame.setDataSource(dataSource);
        return footballGame;
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
