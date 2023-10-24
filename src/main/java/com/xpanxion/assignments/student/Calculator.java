package com.xpanxion.assignments.student;
import java.util.ArrayList;
public class Calculator {
    public static ArrayList<String> history = new ArrayList<>();
    private double firstNum;
    private double secondNum;
    private double total;
    private String operator;
    private String op;

    public Calculator(double firstNum, double secondNum, String operator) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.operator = operator;
    }

    public void setTotal() {
        if (operator.equals("sub")) {
            total = firstNum - secondNum;
            this.op = "-";
        }
        else if (operator.equals("add")) {
            total = firstNum+ secondNum;
            this.op = "+";
        }
        else if (operator.equals("mul")) {
            total = firstNum * secondNum;
            this.op = "*";
        }
        else if (operator.equals("div")) {

            total = (double) firstNum/secondNum;
            this.op = "/";
        }
    }

    public double getTotal() {
        return this.total;
    }
    public void addToHistory() {

        history.add(firstNum + op + secondNum + " = " + total);
    }

    public static void historyPrint() {
        for (int i = 0; i < history.size(); i++) {
            System.out.println(history.get(i));
        }
    }
    public String toString() {
        return firstNum + op + secondNum + " = " + total;
    }
}
