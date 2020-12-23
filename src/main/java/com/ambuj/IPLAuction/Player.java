package com.ambuj.IPLAuction;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Player {
    private String name;
    private PlayerStats playerStats;
    private PlayerState playerState;
    private int waitMinutes;

}
