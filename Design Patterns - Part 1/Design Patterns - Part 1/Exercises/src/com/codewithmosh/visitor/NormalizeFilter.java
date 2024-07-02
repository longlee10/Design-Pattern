package com.codewithmosh.visitor;

public class NormalizeFilter implements Filter{
    @Override
    public void apply(FormatSegment formatSegment) {
        System.out.println("Normalize in format segment...");
    }

    @Override
    public void apply(FactSegment factSegment) {
        System.out.println("Normalize in fact segment...");
    }
}
