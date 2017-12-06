package com.edgar;

import com.edgar.entities.*;

public class RunDemoWithoutSpring {
    public static void main(String[] args) {
        Team barca = new Barcelona();
        Team real = new RealMadrid();
        Game game = new FootballGame(barca, real);
        System.out.println(game.playGame());
    }
}