package com.edgar.entities;

import org.springframework.stereotype.Component;

@Component
public class Barcelona implements Team{

    @Override
    public String getName() {
        return "Barcelona FC";
    }
}
