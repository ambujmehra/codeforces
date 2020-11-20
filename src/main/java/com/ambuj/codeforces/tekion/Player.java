package com.ambuj.codeforces.tekion;


public class Player {
    private String name;
    private PlayerStats playerStats;
    private PlayerState playerState;
    private int waitMinutes;

    public int getWaitMinutes() {
        return waitMinutes;
    }

    public void setWaitMinutes(int waitMinutes) {
        this.waitMinutes = waitMinutes;
    }

    public Player(String name, PlayerStats playerStats, PlayerState playerState) {
        this.name = name;
        this.playerStats = playerStats;
        this.playerState = playerState;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayerStats getPlayerStats() {
        return playerStats;
    }

    public void setPlayerStats(PlayerStats playerStats) {
        this.playerStats = playerStats;
    }

    public PlayerState getPlayerState() {
        return playerState;
    }

    public void setPlayerState(PlayerState playerState) {
        this.playerState = playerState;
    }
}
