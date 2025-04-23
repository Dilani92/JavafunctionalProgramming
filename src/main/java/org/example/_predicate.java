package org.example;

import java.util.function.Predicate;

public class _predicate {
    public static void main(String[] args) {
        System.out.println("With Predicate");
        System.out.println(isPhoneNumberValid("0771589906"));
        System.out.println(isPhoneNumberValid("0071589906"));
        System.out.println(isPhoneNumberValid("077158990"));

        System.out.println("Without Predicate");
        System.out.println(isPhoneNumberValidPredicate.test("0771589906"));
        System.out.println(isPhoneNumberValidPredicate.test("0071589906"));
        System.out.println(isPhoneNumberValidPredicate.test("077158990"));

        System.out.println(isPhoneNumberValidPredicate.and(containsNumber3).test("0771583906"));
    }

    static String isPhoneNumberValid(String phoneNumber){
        return (phoneNumber.startsWith("07") && phoneNumber.length() == 10) ? "Valid" : "Not a Valid Number" ;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length() == 10;

    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");
}
