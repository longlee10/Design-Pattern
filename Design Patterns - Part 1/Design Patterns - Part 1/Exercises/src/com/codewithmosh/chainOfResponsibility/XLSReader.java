package com.codewithmosh.chainOfResponsibility;

public class XLSReader extends DataReader{
    protected XLSReader(DataReader reader) {
        super(reader);
    }

    public String getExtension(){
        return ".xls";
    }

    @Override
    void doReadFile(String file) {
        System.out.println("Reading .xls file...");
    }
}
