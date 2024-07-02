package com.codewithmosh.strategy;

public class ChatClient {
    public void send(String message, EcryptionAlgorithm encryptionAlgorithm) {
        encryptionAlgorithm.encrypt(message);

        System.out.println("Sending the encrypted message: " + message);
    }
}
