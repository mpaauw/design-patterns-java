package creational.singleton.sample;

public class LazyLoadedSingleton {
    private static LazyLoadedSingleton instance = null;

    private LazyLoadedSingleton() {
        if(instance != null) {
            throw new IllegalStateException("Instance already exists"); // shout
        }
    }

    public static LazyLoadedSingleton getInstance() {
        if(instance == null) {
            instance = new LazyLoadedSingleton();
        }
        return instance;
    }
}
