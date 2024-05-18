package com.pattern;

import java.util.List;

public class LoggerDecorator implements DataBase {
    
    private final DataBase dataBase;
    private final Logger logger;

    public LoggerDecorator(DataBase dataBase, Logger logger) {
        this.dataBase = dataBase;
        this.logger = logger;
    }

    @Override
    public void insert(String register) {
        logger.add("inserta " + register);
        dataBase.insert(register);
    }
    
    @Override
    public List<String> registers() {
        logger.add("lectura");
        return dataBase.registers();
    }
}
