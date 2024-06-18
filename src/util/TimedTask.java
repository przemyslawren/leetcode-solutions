package util;

@FunctionalInterface
public interface TimedTask<T> {
    T execute();
}
