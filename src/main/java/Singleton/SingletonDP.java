package Singleton;

public final class SingletonDP {

    private static SingletonDP singletonDP;
    private SingletonDP() {

    }

    public static SingletonDP getInstance() {
        //Double Check Locking...
        synchronized (SingletonDP.class) {
            if (singletonDP == null) {
                singletonDP = new SingletonDP();
            }
        }
        return singletonDP;
    }
}
