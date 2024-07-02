package com.codewithmosh.strategy;

public class DES implements EcryptionAlgorithm{
    @Override
    public void encrypt(String message) {
        System.out.println("Encrypting message using DES...");
    }
}
