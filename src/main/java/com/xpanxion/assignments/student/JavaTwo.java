package com.xpanxion.assignments.student;

import com.xpanxion.assignments.Person.Person;

import java.util.*;
import java.text.NumberFormat;
import java.util.stream.Collectors;
import java.util.concurrent.TimeUnit;

public class JavaTwo {
    public JavaTwo() {

    }

    public void ex1() {
        ArrayList<Person> personList = new ArrayList<>();
        Scanner console = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Person: ");
            String input = console.nextLine();
            if (input.equals("done")) {
                break;
            }
            String[] inputStr = input.split(" ");
            String newId = inputStr[0].replace(",", "");
            String firstName = inputStr[1];
            String lastName = inputStr[2];
            Person p = new Person(Integer.parseInt(newId), firstName, lastName);
            personList.add(p);
        }
        System.out.println(personList);
    }

    public void ex2() {
        HashMap<Integer, Person> personHashMap = new HashMap<Integer, Person>();
        personHashMap.put(1, new Person(1, "Peter", "Jones"));
        personHashMap.put(2, new Person(2, "John", "Smith"));
        personHashMap.put(3, new Person(3, "Mary", "Jane"));
        Scanner console = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Person ID: ");
            String input = console.nextLine();
            if (input.equals("done")) {
                break;
            }
            int id = Integer.parseInt(input);
            Person value = personHashMap.get(id);
            System.out.println(value);

        }

    }

    public void ex3() {
        var invoice = new Invoice(1);
        invoice.addProduct(new Product(111, "Mustard", 2.00));
        invoice.addProduct(new Product(222, "Ketchup", 3.00));
        invoice.addProduct(new Product(333, "Franks Hot Sauce", 4.00));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));
    }

    public void ex4() {
        var invoice = new Invoice(1);
        invoice.addProduct(new Product(111, "Mustard", 2.00));
        invoice.addProduct(new Product(222, "Ketchup", 3.00));
        invoice.addProduct(new Product(333, "Franks Hot Sauce", 4.00));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));
    }

    public void ex5() {
        var repository = new Repository();
        var p = repository.getPerson(1);
        System.out.println(p);
    }

    public void ex6() {
        Scanner console = new Scanner(System.in);
        Calculator calculator;
        while (true) {
            System.out.println("Enter first number: ");
            String num = console.nextLine();
            if (num.equals("done")) {
                break;
            }
            int num1 = Integer.parseInt(num);
            System.out.println("Enter second number: ");
            int num2 = console.nextInt();
            console.nextLine();
            System.out.println("Enter operation (add, sub, mul, div): ");
            String op = console.nextLine();
            calculator = new Calculator(num1, num2, op);
            calculator.setTotal();
            System.out.println("Result: " + calculator.getTotal());
            calculator.addToHistory();
        }
        Calculator.historyPrint();
        console.close();
    }

    public void ex7() {
        var personList = Arrays.asList(

                new Person(1, "Peter", "Jones"),

                new Person(2, "John", "Smith"),

                new Person(3, "Sue", "Anderson"));


        personList.stream().map(e -> e.setLastNameFor7("xxx")).collect(Collectors.toList());

        System.out.println(personList);
    }

    public void ex8() {
        var personList = Arrays.asList(
                new Person(1, "Charlie", "Jones"),
                new Person(2, "Zoey", "Smith"),
                new Person(3, "Adam", "Anderson"));
        personList.sort(Comparator.comparing(Person::getLastName));
        System.out.println(personList);
    }


    public void ex9() {
        var personList = Arrays.asList(
                new Person(1, "Charlie", "Jones"),
                new Person(2, "Zoey", "Smith"),
                new Person(3, "Adam", "Anderson")
        );
        List<Person> filteredList = new ArrayList<>();
        for (Person person : personList) {
            if (person.getLastName().equals("Smith")) {
                filteredList.add(person);
            }
        }
        for (Person p : filteredList) {
            System.out.println(p);
        }
    }

    public void ex10() throws InterruptedException {
        Cat[] catNames = {new Cat("Alice"), new Cat("Bob"), new Cat("Charlie"), new Cat("Dan")};
        LinkedList<Cat> catQueue = new LinkedList<>(Arrays.asList(catNames));
        while(!catQueue.isEmpty()) {

            System.out.println(catQueue);
            catQueue.removeFirst();
            Thread.sleep(3000);
        }
    }

}