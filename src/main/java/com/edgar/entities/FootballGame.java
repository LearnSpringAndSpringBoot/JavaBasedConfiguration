package com.edgar.entities;

public class FootballGame implements Game{

    private Team homeTeam;
    private Team awayTeam;

    public FootballGame() {}

    public FootballGame(Team homeTeam, Team awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    @Override
    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    @Override
    public Team getHomeTeam() {
        return homeTeam;
    }

    @Override
    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    @Override
    public Team getAwayTeam() {
        return awayTeam;
    }

    @Override
    public String playGame() {
        return Math.random() < 0.5 ? getHomeTeam().getName() : getAwayTeam().getName();
    }
}
