package com.ambuj.codeforces.tekion;


import java.util.List;
import java.util.stream.Collectors;

public class AuctionObservable implements IObservable {

    private Player player;

    private List<IObserver> observers;

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public List<IObserver> getObservers() {
        return observers;
    }

    public void setObservers(List<IObserver> observers) {
        this.observers = observers;
    }

    public AuctionHelper getAuctionHelper() {
        return auctionHelper;
    }

    public void setAuctionHelper(AuctionHelper auctionHelper) {
        this.auctionHelper = auctionHelper;
    }

    // TODO:: can be a strategy
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

    public PlayerState getPlayerState() {
        return this.player.getPlayerState();
    }

    public void setPlayerState(PlayerState playerState) {
        this.setPlayerState(playerState);
    }
}
