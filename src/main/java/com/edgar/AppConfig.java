package com.edgar;

import com.edgar.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

import javax.annotation.Resource;
import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = "com.edgar")
public class AppConfig {

    @Autowired
    private DataSource dataSource;

    //This autowires "by type", searches for a bean of type Team
//    @Autowired
//    @Qualifier("barcelona")
//    private Team home;

    //This autowires "by bean name", searches for a bean with name realMadrid
    @Resource
    private Team realMadrid;

    @Bean
    @Scope("prototype")
    public Game game(){
//        FootballGame footballGame = new FootballGame(home, realMadrid);
        FootballGame footballGame = new FootballGame(barcelona(), realMadrid);
        footballGame.setDataSource(dataSource);
        return footballGame;
    }

    @Bean
    public Team barcelona() {
        return new Barcelona();
    }

}
