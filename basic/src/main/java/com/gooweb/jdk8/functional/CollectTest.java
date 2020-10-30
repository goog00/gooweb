package com.gooweb.jdk8.functional;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

/**
 * @author steng
 * @description
 * @date 2020-10-29 14:18
 **/
public class CollectTest {

    /**
     * 构建列表
     *
     * @return
     */
    private static List<Person> buildPersonList() {
        List<Person> personList = new LinkedList<>();
        personList.add(new Person("Apple", 12));
        personList.add(new Person("Box", 12));
        personList.add(new Person("Cat", 20));
        personList.add(new Person("Dog", 26));
        personList.add(new Person("Eye", 62));
        return personList;
    }

    /**
     * 向list中添加元素
     */
    public void older20Test() {
        List<Person> older20List = new LinkedList<>();
        buildPersonList().stream().filter(person -> person.getAge() > 20)
                .forEach(person -> older20List.add(person));
        System.out.println(older20List);

    }

    //[Person{name='D', age=26}, Person{name='E', age=62}]
    public void older20CollectTest() {
        List<Person> older20List = buildPersonList().stream()
                .filter(person -> person.getAge() > 20)
                .collect(Collectors.toList());
        System.out.println(older20List);
    }

    //    Grouped by age: {20=[Person{name='C', age=20}], 26=[Person{name='D', age=26}], 12=[Person{name='A', age=12}, Person{name='B', age=12}], 62=[Person{name='E', age=62}]}
    public void groupByAgeTest() {
        Map<Integer, List<Person>> peopleByAge =
                buildPersonList().stream()
                        .collect(Collectors.groupingBy(Person::getAge));
        System.out.println("Grouped by age: " + peopleByAge);
    }

    //    People grouped by age: {20=[C], 26=[D], 12=[A, B], 62=[E]}
    public void getNameGroupByAgeTest() {
        Map<Integer, List<String>> nameOfPeopleByAge =
                buildPersonList().stream()
                        .collect(Collectors.groupingBy(Person::getAge, Collectors.mapping(Person::getName, Collectors.toList())));
        System.out.println("People grouped by age: " + nameOfPeopleByAge);
    }

    //    Oldest person of each letter:
//    {A=Optional[Person{name='Apple', age=12}], B=Optional[Person{name='Box', age=12}], C=Optional[Person{name='Cat', age=20}], D=Optional[Person{name='Dog', age=26}], E=Optional[Person{name='Eye', age=62}]}
    public void groupByFirstLetterTest() {
        Comparator<Person> byAge = Comparator.comparing(Person::getAge);
        Map<Character, Optional<Person>> oldestPersonOfEachLetter =
                buildPersonList().stream()
                        .collect(Collectors.groupingBy(person -> person.getName().charAt(0),
                                Collectors.reducing(BinaryOperator.maxBy(byAge))));
        System.out.println("Oldest person of each letter:");
        System.out.println(oldestPersonOfEachLetter);
    }

    public static void main(String[] args) {
        CollectTest collectTest = new CollectTest();
        collectTest.older20Test();
    }
}
