package com.pattern;

public class Config {
    private static Logger logger;
    private static DataBase dbWithLogger;

    static {
        logger = new Logger();

        DataBase dataBase = new DataBaseMemory();

        dbWithLogger = new LoggerDecorator(dataBase, logger);
    }

    public static DataBase getDatabase() {
        return dbWithLogger;
    }

    public static Logger getLogger() {
        return logger;
    }
}
