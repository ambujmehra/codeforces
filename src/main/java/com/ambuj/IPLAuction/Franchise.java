package com.ambuj.IPLAuction;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Franchise {

    private String name;
    private BigDecimal budget;
    private List<Player> myPlayers;

}
