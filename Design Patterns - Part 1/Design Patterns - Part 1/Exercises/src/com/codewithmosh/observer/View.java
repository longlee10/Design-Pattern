package com.codewithmosh.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class View implements Observer {
    private List<Stock> stocks = new ArrayList<>();

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public void show() {
        for (var stock : stocks)
            System.out.println(stock);
    }

    @Override
    public void updatePrice() {
        doUpdatePrice();
        show();
    }

    protected abstract void doUpdatePrice();
}
