package com.java.lambdas.designpattern.concepts;

import java.util.Objects;

@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);

    default Consumer<T> andThen(Consumer<T> other){
        Objects.requireNonNull(other);  //specified to now where null pointer is thrown
        return (T t)->{this.accept(t);
        other.accept(t);};
    }
}
