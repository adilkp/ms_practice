package Singleton;

public class SingletonMain {
    public static void main(String[] args) {
        SingletonDP s1 = SingletonDP.getInstance();
        SingletonDP s2 = SingletonDP.getInstance();

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
