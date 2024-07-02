package com.codewithmosh.visitor;

public class ReverbFilter implements Filter{
    @Override
    public void apply(FormatSegment formatSegment) {
        System.out.println("Reverb in format segment...");
    }

    @Override
    public void apply(FactSegment factSegment) {
        System.out.println("Reverb in fact segment...");
    }
}
