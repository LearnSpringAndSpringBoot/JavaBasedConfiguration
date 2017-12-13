package com.edgar.entities;

import org.springframework.stereotype.Component;

@Component
public class RealMadrid implements Team{

    @Override
    public String getName() {
        return "Real Madrid";
    }
}
