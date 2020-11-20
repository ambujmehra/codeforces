package com.ambuj.codeforces.tekion;

import java.math.BigDecimal;
import java.util.List;

public class Franchise {

    private String name;
    private BigDecimal budget;

    private List<Player> myPlayers;

    public Franchise(String name, BigDecimal budget, List<Player> myPlayers) {
        this.name = name;
        this.budget = budget;
        this.myPlayers = myPlayers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getBudget() {
        return budget;
    }

    public void setBudget(BigDecimal budget) {
        this.budget = budget;
    }

    public List<Player> getMyPlayers() {
        return myPlayers;
    }

    public void setMyPlayers(List<Player> myPlayers) {
        this.myPlayers = myPlayers;
    }
}
