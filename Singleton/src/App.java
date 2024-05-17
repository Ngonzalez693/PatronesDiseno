public class App {
    public static void main(String[] args) throws Exception {
        
        Singleton instancia1 = Singleton.getSingleton();
        Singleton instancia2 = Singleton.getSingleton();

        // Verificar que ambas referencias apuntan a la misma instancia
        if (instancia1 == instancia2) {
            System.out.println("Ambas instancias son iguales.");
        } else {
            System.out.println("Las instancias son diferentes.");
        }
    }
}
