package com.ambuj.codeforces.tekion;

public interface IObserver {

    void notifyMe(Player player, PlayerState playerState);

    BidDto getbidDto();
}
