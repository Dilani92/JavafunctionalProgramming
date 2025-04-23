package org.example;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionalInterface {

    //Functions takes 1 argument and produces one result
    static Function<Integer, Integer> incrementByOneFunction =
            number -> number+1;

    static Function<Integer , Integer> incrementBy10 =
            number -> number * 10;


    static int incrementByOne(int number){
        return number + 1;
    }

    //BiFunction =======>>>>>>>
    static BiFunction<Integer , Integer , Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne , numberToMultiplyBy)
                    -> (numberToIncrementByOne + 1) * numberToMultiplyBy;

    static int incrementByOneAndMultiply(int number , int numToMultiplyBy){
        return (number + 1) * numToMultiplyBy;
    }

    public static void main(String[] args) {
        int increment = incrementByOne(1);
        System.out.println(increment);

        int incrementFunction = incrementByOneFunction.apply(1);
        System.out.println(incrementFunction);

        int multiply  = incrementBy10.apply(incrementFunction);
        System.out.println(multiply);

        Function<Integer, Object> addAndMultiply = incrementByOneFunction.andThen(incrementBy10);
        System.out.println(addAndMultiply.apply(4));

        //BiFunction takes 2 argument and produced 1 result
        System.out.println(incrementByOneAndMultiply(4, 100));

        System.out.println(incrementByOneAndMultiplyBiFunction.apply(4, 100));
    }
}

