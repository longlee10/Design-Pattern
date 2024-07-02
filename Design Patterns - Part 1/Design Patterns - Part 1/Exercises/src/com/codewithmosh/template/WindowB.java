package com.codewithmosh.template;

public class WindowB extends Window{
    @Override
    protected void beforeClose() {
        System.out.println("Before closing window B...");
    }

    @Override
    protected void afterClose() {
        System.out.println("After closing window B...");
    }
}
