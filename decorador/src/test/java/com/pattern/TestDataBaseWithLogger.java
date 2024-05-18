package com.pattern;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestDataBaseWithLogger {

    private Logger logger = new Logger();
    private DataBase sinLogger = new DataBaseMemory();
    
    private DataBase db;
    
    @Before
    public void init() {
        // construir un LoggerDecorator usando la base de datos sinLogger y el logger
        db = new LoggerDecorator(sinLogger, logger);
    }
    
    // de este test no hay que modificar nada
    @Test
    public void test_logger_decorator() {
        assertNotNull("falta inicializar db en el metodo init()", db);
        assertFalse("logger no esta vacio", logger.get().contains("inserta entrada"));
        db.insert("entrada");
        
        assertTrue("db no ha recibido entrada", sinLogger.registers().contains("entrada"));
        assertTrue("no se ha registrado la entrada", logger.get().contains("inserta entrada"));

        // lectura con el adapter con logger
        List<String> registers = db.registers();
        
        assertTrue("el adapter no tiene la nueva entrada", registers.contains("entrada"));
        assertTrue("no se ha registrado la lectura", logger.get().contains("lectura"));
    }
}
