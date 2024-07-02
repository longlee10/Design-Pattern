package com.codewithmosh.strategy;

public class Demo {
    public static void main(String[] args) {
        var chatClient = new ChatClient();
        chatClient.send("Hi!", new DES());
        chatClient.send("Hi!", new AES());
    }
}
