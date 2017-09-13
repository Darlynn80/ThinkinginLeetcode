package net.thingking.coding;

@FunctionalInterface

public interface Func<T, TResult> {

    TResult invoke(T arg);

}
