package com.ambuj.IPLAuction;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AuctionDriver {

    public static void main(String[] args) throws InterruptedException {

        AuctionHelper auctionHelper = new AuctionHelper();
        PlayerStats playerStats = new PlayerStats();
        playerStats.basePrice = new BigDecimal(1000000);
        Player dhoni = new Player("dhoni", playerStats, PlayerState.PENDING,100 );
        Player kohli = new Player("kohli", playerStats, PlayerState.PENDING, 100 );
        Player rohit = new Player("rohit", playerStats, PlayerState.PENDING, 100 );

        Franchise mi = new Franchise("MI", new BigDecimal(100000000), new ArrayList<>());
        Franchise csk = new Franchise("CSK", new BigDecimal(100000000), new ArrayList<>());


        // make franchiseObservers
        FranchiseObserver miObserver = new FranchiseObserver();
        miObserver.setFranchise(mi);
        BidDto bidDtoMi = new BidDto();
        bidDtoMi.setFranchise(mi);
        bidDtoMi.setBid(new BigDecimal(1000000));
        miObserver.setBidDto(bidDtoMi);


        FranchiseObserver cskObserver = new FranchiseObserver();
        cskObserver.setFranchise(csk);
        BidDto bidDtocsk = new BidDto();
        bidDtocsk.setFranchise(mi);
        bidDtocsk.setBid(new BigDecimal(1000000));
        cskObserver.setBidDto(bidDtocsk);

        //----------------------------

        List<Player> players = new ArrayList<>();
        players.add(dhoni);
        players.add(kohli);
        players.add(rohit);


        for(Player player:players) {
            AuctionObservable auctionObservable = new AuctionObservable();
            auctionObservable.setPlayer(player);
            auctionObservable.setAuctionHelper(auctionHelper);

            auctionObservable.add(miObserver);
            auctionObservable.add(cskObserver);

            auctionObservable.start();

        }

    }
}
