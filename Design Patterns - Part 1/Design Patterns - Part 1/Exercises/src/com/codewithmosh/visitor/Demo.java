package com.codewithmosh.visitor;

public class Demo {
    public static void main(String[] args) {
        var noiseReduction = new NoiseReductionFilter();
        var normalize = new NormalizeFilter();

        var wavFile = WavFile.read("data.wav");
        wavFile.execute(noiseReduction);
        wavFile.execute(normalize);
    }
}
