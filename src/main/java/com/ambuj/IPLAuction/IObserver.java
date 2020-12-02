package com.ambuj.IPLAuction;

public interface IObserver {

    void notifyMe(Player player, PlayerState playerState);

    BidDto getbidDto();
}
