package com.pattern;

import java.util.ArrayList;
import java.util.List;

public class DataBaseMemory implements DataBase {
    
    private final List<String> values = new ArrayList<>();

    @Override
    public void insert(String register){
        values.add(register);
    }

    @Override
    public List<String> registers(){
        return new ArrayList<>(values);
    }
}
