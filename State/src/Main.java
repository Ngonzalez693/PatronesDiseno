public class Main {
    public static void main(String[] args) throws Exception {
        User user = new User();
        
        System.out.println("Current State: " + user.onActive());
        System.out.println("Current State: " + user.onBuy());
        System.out.println("Current State: " + user.onLock());
        System.out.println("Current State: " + user.onDisable());
        System.out.println("Current State: " + user.onActive());
    }
}
