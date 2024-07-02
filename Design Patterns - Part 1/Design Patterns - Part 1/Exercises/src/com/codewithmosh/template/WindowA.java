package com.codewithmosh.template;

public class WindowA extends Window{
    @Override
    protected void beforeClose() {
        System.out.println("Before closing window A...");
    }

    @Override
    protected void afterClose() {
        System.out.println("After closing window A...");
    }
}
