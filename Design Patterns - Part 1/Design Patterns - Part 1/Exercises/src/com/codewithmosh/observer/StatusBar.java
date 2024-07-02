package com.codewithmosh.observer;

import java.util.ArrayList;
import java.util.List;

public class StatusBar extends View{
    private Stock stock;

    public StatusBar(Stock stock) {
        this.stock = stock;
    }

    @Override
    protected void doUpdatePrice() {
        System.out.println("Notified! Refreshing status bar..." + stock);
    }
}
