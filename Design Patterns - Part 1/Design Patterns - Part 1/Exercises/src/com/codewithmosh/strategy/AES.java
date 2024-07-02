package com.codewithmosh.strategy;

public class AES implements EcryptionAlgorithm{
    @Override
    public void encrypt(String message) {
        System.out.println("Encrypting message using AES...");
    }
}
