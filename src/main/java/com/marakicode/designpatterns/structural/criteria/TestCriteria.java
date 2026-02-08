package com.marakicode.designpatterns.structural.criteria;

import java.util.List;

public class TestCriteria {
    public static void test() {
        var persons = List.of(
                new Person("Abebe", Gender.MALE, MartialStatus.MARRIED),
                new Person("Alemu", Gender.MALE, MartialStatus.SINGLE),
                new Person("Kebede", Gender.MALE, MartialStatus.MARRIED),
                new Person("Almaz", Gender.FEMALE, MartialStatus.SINGLE),
                new Person("Hanan", Gender.FEMALE, MartialStatus.MARRIED)
        );
        var femaleCriteria = new FemaleCriteria();
        var females = femaleCriteria.meetCriteria(persons);
        var maleCriteria = new MaleCriteria();
        var males = maleCriteria.meetCriteria(persons);

        System.out.println("FEMALES:");
        females.stream()
                .map(Person::getName)
                .forEach(System.out::println);

        System.out.println("MALES:");
        males.stream()
                .map(Person::getName)
                .forEach(System.out::println);

        var singleCriteria = new SingleCriteria();
        var singles = singleCriteria.meetCriteria(persons);

        System.out.println("Singles: ");
        singles.stream()
                .map(Person::getName)
                .forEach(System.out::println);

        var marriedCriteria = new MarriedCriteria();
        var marriedPersons = marriedCriteria.meetCriteria(persons);

        System.out.println("Married: ");
        marriedPersons.stream()
                .map(Person::getName)
                .forEach(System.out::println);

        var femaleMarried = new AndCriteria<>(femaleCriteria, marriedCriteria);
        var marriedFemales = femaleMarried.meetCriteria(persons);

        System.out.println("Married Females");

        marriedFemales.stream()
                .map(Person::getName)
                .forEach(System.out::println);

        var maleOrFemale = new OrCriteria<>(maleCriteria,femaleCriteria);
        var maleOrFemales = maleOrFemale.meetCriteria(persons);

        System.out.println("Male or Females");
        maleOrFemales.stream()
                .map(Person::getName)
                .forEach(System.out::println);

    }
}
