package com.edgar;

import com.edgar.entities.Game;
import com.edgar.entities.Team;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunDemo {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("There are " + context.getBeanDefinitionCount() + " beans.");
        for (String beanName : context.getBeanDefinitionNames()) {
            System.out.println(beanName);
        }

        Team atleticoMadrid = context.getBean("atleticoMadrid", Team.class);

        Game game1 = context.getBean("game", Game.class);
        System.out.println(game1);

        Game game2 = context.getBean("game", Game.class);
        game2.setAwayTeam(atleticoMadrid);
        System.out.println(game2);

        System.out.println(game1);


    }
}
