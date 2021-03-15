package com.java.lambdas.designpattern.concepts;

public class PlaywithConsumer {

    public static void main(String ...args){
        Consumer<String> c1 = s->System.out.println("c1--->" + s);
        Consumer<String> c2 = s->System.out.println("c2--->" + s);
        //Chaining of consumers basic way
        Consumer<String> c3= s->{
            c1.accept(s);
            c2.accept(s);
        };
        c3.accept("Basic implementation");

        // using  and then default method has effect of null pointer exception whose location cannot be determined
        Consumer c4 = c1.andThen(c2);
        c4.accept("Using default");

      //  Consumer c4 = c1.andThen(null); // use this to produce a null pointer and trace back the point of execution
    }
}
