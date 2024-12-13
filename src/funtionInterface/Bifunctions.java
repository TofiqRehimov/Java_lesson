package funtionInterface;

@FunctionalInterface
public interface Bifunctions<T, U, R> {
    R BiF(T t, U u);
}
