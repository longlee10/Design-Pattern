package com.codewithmosh.visitor;

public class NoiseReductionFilter implements Filter{
    @Override
    public void apply(FormatSegment formatSegment) {
        System.out.println("Noise reduction in format segment...");
    }

    @Override
    public void apply(FactSegment factSegment) {
        System.out.println("Noise reduction in fact segment...");
    }
}
