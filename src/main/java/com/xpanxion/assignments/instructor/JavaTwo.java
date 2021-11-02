package com.xpanxion.assignments.instructor;

import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class JavaTwo {

    /**
     * Person List
     */
    public void ex1() {
        var personList = new ArrayList<Person>();

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Person: ");
            var inString = scanner.nextLine();
            if (inString.equals("done")) {
                break;
            }

            // Parse input.
            var stringTokenizer = new StringTokenizer(inString);
            var id = Integer.parseInt(stringTokenizer.nextToken().replace(",", ""));
            var firstName = stringTokenizer.nextToken();
            var lastName = stringTokenizer.nextToken();

            // Build list.
            personList.add(new Person(id, firstName, lastName));
        }

        for (Person p: personList) { // For each.
            System.out.println(p);
        }
    }

    /**
     * Person HashMap
     */
    public void ex2() {
        var hashMap = new HashMap<Integer, Person>();

        var p1 = new Person(1, "Peter", "Jones");
        var p2 = new Person(2, "John", "Smith");
        var p3 = new Person(3, "Mary", "Jane");

        hashMap.put(1, p1);
        hashMap.put(2, p2);
        hashMap.put(3, p3);

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Person ID: ");
            var inString = scanner.nextLine();
            if (inString.equals("done")) {
                break;
            }
            System.out.println(hashMap.get(Integer.parseInt(inString)));
        }
    }

    /**
     *
     */
    public void ex3() {

    }

    /**
     *
     */
    public void ex4() {

    }

    /**
     *
     */
    public void ex5() {

    }

    /**
     *
     */
    public void ex6() {

    }

    /**
     *
     */
    public void ex7() {

    }

    /**
     *
     */
    public void ex8() {

    }

    /**
     *
     */
    public void ex9() {

    }

    /**
     *
     */
    public void ex10() {

    }
}
