package com.ambuj.codeforces.tekion;

//different for each player and each franchine M*N
public class FranchiseObserver implements IObserver{

    private Franchise franchise;
    private BidDto bidDto;


    @Override
    public void notifyMe(Player player, PlayerState playerState) {
        if(playerState.equals(PlayerState.SOLD)) {
            franchise.getMyPlayers().add(player);
            franchise.getBudget().subtract(bidDto.getBid());
        }

    }

    @Override
    public BidDto getbidDto() {
        return this.bidDto;
    }

    public Franchise getFranchise() {
        return franchise;
    }

    public void setFranchise(Franchise franchise) {
        this.franchise = franchise;
    }

    public BidDto getBidDto() {
        return bidDto;
    }

    public void setBidDto(BidDto bidDto) {
        this.bidDto = bidDto;
    }
}
