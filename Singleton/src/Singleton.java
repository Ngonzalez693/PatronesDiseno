public class Singleton {
    
    private static Singleton INSTANCE;
    private Singleton() {}

    public synchronized static Singleton getSingleton() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

    private Object readResolve() {
        return INSTANCE;
    }
}