package com.codewithmosh.memento;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<DocumentState> states = new ArrayList<>();

    public void push(DocumentState state){
        states.add(state);
    }

    public DocumentState pop(){
        return states.removeLast();
    }
}
