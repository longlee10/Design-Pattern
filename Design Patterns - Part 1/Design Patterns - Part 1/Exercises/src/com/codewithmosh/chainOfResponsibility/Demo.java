package com.codewithmosh.chainOfResponsibility;

public class Demo {
    public static void main(String[] args) {
        var xls = new XLSReader(null);
        var qbw = new QBWReader(xls);
        var numbers = new NumbersReader(qbw);

        var user = new DataReaderUser(numbers);
        user.read("data.xls");
        user.read("data.qbw");
        user.read("data.numbers");
        user.read("data.jpg");
    }
}
