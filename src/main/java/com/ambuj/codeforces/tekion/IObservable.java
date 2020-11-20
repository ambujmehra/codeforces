package com.ambuj.codeforces.tekion;

public interface IObservable {

    void add(IObserver observer);
    void remove(IObserver observer);

    void notifyFranchise();

    void start() throws InterruptedException;

}
