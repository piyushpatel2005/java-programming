package org.piyushpatel2005.functional;

public class Main {
    public static void main(String[] args) {
        Predicate<String> p1 = s -> s.length() < 20;
        Predicate<String> p2 = s -> s.length() > 5;

        boolean b = p1.test("Hello");
        System.out.println("Hello is shorter than 20 chars: " + b);

        Predicate<String> p3 = p1.and(p2);
        System.out.println("Within 5 and 20? " + p3.test("Hello"));
        System.out.println("Within 5 and 20? " + p3.test("Hello World"));

        Predicate<String> p4 = p1.or(p2);
        System.out.println("Below 5 or more than 20? " + p4.test("Hello"));
        System.out.println("Below 5 or more than 20? " + p4.test("Hello World"));

        Predicate<String> p5 = Predicate.isEqualsTo("Yes");
        System.out.println("P5 For Yes: " + p5.test("Yes"));
    }
}
