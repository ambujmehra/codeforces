package com.ambuj.IPLAuction;

import lombok.Getter;
import lombok.Setter;

//different for each player and each franchine M*N
@Getter
@Setter
public class FranchiseObserver implements IObserver{

    private Franchise franchise;
    private BidDto bidDto;


    @Override
    public void notifyMe(Player player, PlayerState playerState) {
        if(playerState.equals(PlayerState.SOLD)) {
            franchise.getMyPlayers().add(player);
            franchise.setBudget(franchise.getBudget().subtract(bidDto.getBid()));
        }
    }

    @Override
    public BidDto getbidDto() {
        return this.bidDto;
    }

}
