package functional.pkginterface.example;

/**
 *
 * @author onure
 */

@FunctionalInterface
public interface GreetingMessage {
    public abstract void greet(String name);
}
