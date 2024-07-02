package com.codewithmosh.observer;

public class Demo {
    public static void main(String[] args) {
        var stock = new Stock("VNS", 50);

        var stockListView = new StockListView(stock);
        var statusBar = new StatusBar(stock);

        stock.addObserver(stockListView);
        stock.addObserver(statusBar);

        stock.setPrice(40);
    }
}
