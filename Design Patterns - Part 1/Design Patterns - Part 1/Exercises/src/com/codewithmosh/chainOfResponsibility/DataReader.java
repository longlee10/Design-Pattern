package com.codewithmosh.chainOfResponsibility;

public abstract class DataReader {
    private DataReader nextReader;

    protected DataReader(DataReader reader) {
        this.nextReader = reader;
    }

    public void readFile(String file){
        if(file.endsWith(getExtension())) {
            this.doReadFile(file);
            return;
        }

        if(nextReader != null)
            nextReader.readFile(file);
        else
            throw new UnsupportedOperationException("File format not supported.");
    }

    abstract String getExtension();

    abstract void doReadFile(String file);
}
