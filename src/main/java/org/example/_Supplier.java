package org.example;

import java.awt.*;
import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDBConnectionUrl());
        System.out.println(getDBConnectionUrlSupplier.get());
    }
    static String getDBConnectionUrl(){
        return "jdbc://localhost:5656/users";
    }

    static Supplier<List<String>> getDBConnectionUrlSupplier = () ->
            List.of("jdbc://localhost:5656/users" ,
                    "jdbc://localhost:5656/customer"
            );
}
