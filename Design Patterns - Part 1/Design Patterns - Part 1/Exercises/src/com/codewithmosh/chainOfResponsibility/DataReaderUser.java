package com.codewithmosh.chainOfResponsibility;

public class DataReaderUser {
    private DataReader reader;

    public DataReaderUser(DataReader reader) {
        this.reader = reader;
    }

    public void read(String file){
        reader.readFile(file);
    }
}
