package com.codewithmosh.memento;

public class Demo {
    public static void main(String[] args) {
        // write your code here
        var document = new Document();
        var history = new History();

        document.setContent("Hello");
        document.setFontName("Arial");
        document.setFontSize(18);
        history.push(document.createState());

        document.setContent("Hi");
        document.setFontSize(20);
        history.push(document.createState());

        document.setFontName("Times New Roman");
        document.setFontSize(19);
        history.push(document.createState());

        document.setContent("Bonjour");
        document.setFontName("Vni-Times");
        document.setFontSize(22);
        history.push(document.createState());

        document.undo(history.pop());
        document.undo(history.pop());

        System.out.println(document);

    }
}
