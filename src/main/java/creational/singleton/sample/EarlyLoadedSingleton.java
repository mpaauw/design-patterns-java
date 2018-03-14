package creational.singleton.sample;

import sun.plugin.dom.exception.InvalidStateException;

/**
 * Describes an early-loaded Singleton class (loaded when a EarlyLoadedSingleton class is first instantiated).
 */
public class EarlyLoadedSingleton {
    private final static EarlyLoadedSingleton instance = new EarlyLoadedSingleton();

    private EarlyLoadedSingleton() {}

    public static EarlyLoadedSingleton getInstance() throws InvalidStateException {
        if(instance != null) {
            throw new InvalidStateException("Instance already exists."); // shout
        }
        return instance;
    }
}
