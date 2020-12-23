package com.ambuj.IPLAuction;


import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
public class AuctionObservable implements IObservable {

    private Player player;
    private List<IObserver> observers;
    private AuctionHelper auctionHelper;

    @Override
    public void add(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyFranchise() {
        // tell all franchise from list what has happened after running auction algo
        List<BidDto> bidDtos = observers.stream().map(IObserver::getbidDto).collect(Collectors.toList());
        PlayerState playerState = auctionHelper.isPlayerSold(player, bidDtos);
        for (IObserver o: observers)
            o.notifyMe(player, playerState);
    }

    @Override
    public void start() throws InterruptedException {
        Thread.sleep(player.getWaitMinutes());
        this.notifyFranchise();
    }

}
