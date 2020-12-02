package com.ambuj.IPLAuction;

import java.math.BigDecimal;

public class BidDto {

    private Franchise franchise;
    private BigDecimal bid;

    public Franchise getFranchise() {
        return franchise;
    }

    public void setFranchise(Franchise franchise) {
        this.franchise = franchise;
    }

    public BigDecimal getBid() {
        return bid;
    }

    public void setBid(BigDecimal bid) {
        this.bid = bid;
    }
}
