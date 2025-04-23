package org.example;

import java.util.ArrayList;
import java.util.List;

//Imperative - Declarative Approach ========================>>>>>
public class ImperativeDeclarativeApproach {
    static class Person{
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender{
        MALE, FEMALE
    }
    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("John" , Gender.MALE),
            new Person("Maria" , Gender.FEMALE),
            new Person("Aisha" , Gender.FEMALE),
            new Person("Alex" , Gender.MALE),
            new Person("Alice" , Gender.MALE)

        );

        System.out.println("//Imperative approach");
        //Imperative approach
        List<Person> females = new ArrayList<>();

        for (Person person : people){
            if (person.gender.equals(Gender.FEMALE)){
                females.add(person);
            }
        }
        for (Person person : females){
            System.out.println(person);
        }

        System.out.println("//Declarative Approach");
        //Declarative Approach
        people.stream()
                .filter(person -> person.gender.equals(Gender.FEMALE))
                .toList()
                .forEach(System.out::println);
    }
}

