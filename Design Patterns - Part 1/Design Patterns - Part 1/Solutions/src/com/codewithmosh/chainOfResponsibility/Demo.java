package com.codewithmosh.chainOfResponsibility;

public class Demo {
    public static void show() {
        var reader = DataReaderFactory.getDataReaderChain();
        reader.read("data.xls");
        reader.read("data.qbw");
        reader.read("data.numbers");
//        reader.read("data.jpg");
    }

    public static void main(String[] args) {
        show();
    }
}
