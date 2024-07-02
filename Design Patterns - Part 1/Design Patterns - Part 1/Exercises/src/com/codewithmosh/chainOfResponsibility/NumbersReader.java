package com.codewithmosh.chainOfResponsibility;

public class NumbersReader extends DataReader{
    protected NumbersReader(DataReader reader) {
        super(reader);
    }

    public String getExtension(){
        return ".numbers";
    }

    @Override
    void doReadFile(String file) {
        System.out.println("Reading .numbers file...");
    }
}
