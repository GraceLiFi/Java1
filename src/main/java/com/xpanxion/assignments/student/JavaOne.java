package com.xpanxion.assignments.student;
import java.util.Scanner;
import java.util.regex.*;
import java.util.Random;
public class JavaOne {

    //
    // Constructors
    //

    public JavaOne() {
    }

    //
    // Public methods
    //

    public void ex1() {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = console.nextLine();
        System.out.println("Your name in uppercase is: " + name.toUpperCase());
        console.close();

    }

    public void ex2() {
        int numUpp = 0;
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = console.nextLine();
        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                numUpp++;
            }

        }
        System.out.println("The number of upper case letters is: " + numUpp);
        console.close();
    }

    public void ex3() {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = console.nextLine();
        String[] splitApart = input.split(" ");
        String[] newString = new String[splitApart.length];
        for (int i = 0; i < splitApart.length; i++) {
            if (i % 2 == 0) {
                newString[i] = splitApart[i].toUpperCase();
            } else {
                newString[i] = splitApart[i];
            }
        }

        for (int i = 0; i < newString.length; i++) {
            System.out.print(newString[i] + " ");
        }
        console.close();
    }



    public void ex4() {
        boolean isPalindrome = false;
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = console.nextLine();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(input.length()-1-i)) {
                isPalindrome = true;
            }
            else {
                isPalindrome = false;
            }

        }
        if(isPalindrome == true) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
        console.close();
    }

    public void ex5() {
        Scanner console = new Scanner (System.in);
        while (true) {
            int cons = 0;
            int vowels = 0;
            System.out.println("Enter a string: ");
            String input = console.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] inputStr = input.split(" ");
            for (int i = 0; i < inputStr.length; i++) {
                for (int j = 0; j < inputStr[i].length(); j++) {
                    if (Pattern.matches("[bcdfghjklmnpqrstvwxyz]", Character.toString(inputStr[i].charAt(j)).toLowerCase())) {
                        cons++;
                    }
                    else if (Pattern.matches("[aeiou]", Character.toString(inputStr[i].charAt(j)).toLowerCase())) {
                        vowels++;
                    }
                }
            }
            System.out.println("Number of vowels: " + vowels);
            System.out.println("Number of consonants: " + cons);
        }
        console.close();
    }

    public void ex6() {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = console.nextInt();
        System.out.println("Enter second number: ");
        int num2 = console.nextInt();
        System.out.println("Result: " + (num1 + num2));
        console.close();
    }

    public void ex7() {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = console.nextInt();
        System.out.println("Enter second number: ");
        int num2 = console.nextInt();
        console.nextLine();
        System.out.println("Enter operation (add, sub, mul, div): ");
        String op = console.nextLine();
        double result = 0;
        if (op.equals("sub")) {
            result = num1 - num2;
        }
        else if (op.equals("add")) {
            result = num1+ num2;
        }
        else if (op.equals("mul")) {
            result = num1 * num2;
        }
        else if (op.equals("div")) {
            result = (double) num1/num2;
        }
        System.out.println("Result: " + result);
        console.close();
    }

    public void ex8() {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter price per square feet: ");
        double price = console.nextDouble();
        console.nextLine();
        double total = 0;
        while(true) {
            System.out.println("Enter room dimensions (width x height): ");
            String dimensions = console.nextLine();
            if (dimensions.equals("done")) {
                break;
            }
            int width = Integer.parseInt(dimensions.split(" ")[0]);
            int length = Integer.parseInt(dimensions.split(" ")[2]);
            total = total + (double)width*length*price;

        }
        System.out.printf("Total cost: $%.2f", total);
        console.close();
    }

    public void ex9() {
        Random randNum = new Random();
        Scanner console = new Scanner(System.in);
        int num = randNum.nextInt(5) + 1;
        int input;
        do {
            System.out.println("Enter a number: ");
            input = console.nextInt();
            if (input == num) {
                System.out.println("You guessed it!!!");
            }
            else {
                System.out.println("Try again...");
            }
        } while(input != num);
        console.close();
    }

    public void ex10() {
        Scanner console = new Scanner (System.in);
        System.out.println("Enter a string: ");
        String input = console.nextLine();
        String[] strArr = input.split(" ");
        for (int i = 0; i < strArr.length; i ++) {
            for(int j = 0; j < strArr[i].length(); j++) {
                for (int k = 0; k < j; k++) {
                    System.out.print(" ");
                }
                System.out.println(strArr[i].charAt(j));
            }
        }
    }

    //
    // Private helper methods
    //
}
