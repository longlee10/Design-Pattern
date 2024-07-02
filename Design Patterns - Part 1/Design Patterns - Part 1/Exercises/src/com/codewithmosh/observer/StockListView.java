package com.codewithmosh.observer;

import java.util.ArrayList;
import java.util.List;

public class StockListView extends View{
    private Stock stock;

    public StockListView(Stock stock) {
        this.stock = stock;
    }

    @Override
    protected void doUpdatePrice() {
        System.out.println("Notified! Refreshing stock list..." + stock);
    }
}
