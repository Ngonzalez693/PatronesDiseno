package com.pattern;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Obtener la base de datos configurada con logger
        DataBase dbWithLogger = Config.getDatabase();
        Logger logger = Config.getLogger();

        // Insertar algunos registros
        dbWithLogger.insert("Registro1");
        dbWithLogger.insert("Registro2");

        // Obtener y mostrar los registros
        List<String> registros = dbWithLogger.registers();
        System.out.println("Registros en la base de datos: " + registros);

        // Mostrar los logs
        List<String> logs = logger.get();
        System.out.println("Logs: " + logs);
    }
}
