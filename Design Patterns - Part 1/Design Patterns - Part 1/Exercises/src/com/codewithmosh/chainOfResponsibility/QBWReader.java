package com.codewithmosh.chainOfResponsibility;

public class QBWReader extends DataReader{
    protected QBWReader(DataReader reader) {
        super(reader);
    }

    public String getExtension(){
        return ".qbw";
    }

    @Override
    void doReadFile(String file) {
        System.out.println("Reading .qbw file...");
    }
}
