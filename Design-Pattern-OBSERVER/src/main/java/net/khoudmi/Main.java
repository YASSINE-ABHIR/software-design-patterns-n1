package net.khoudmi;

import obs.ObservableImpl;
import obs.Observer;
import obs.ObserverImpl1;
import obs.ObserverImpl2;

public class Main {
    public static void main(String[] args) {
        ObservableImpl observable = new ObservableImpl();
        Observer o1 = new ObserverImpl1();
        Observer o2 = new ObserverImpl2();
        observable.subscribe(o1);
        observable.subscribe(o2);
        observable.setState(60);
        observable.setState(80);
        observable.setState(100);
    }
}