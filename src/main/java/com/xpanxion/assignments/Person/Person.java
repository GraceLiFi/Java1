package com.xpanxion.assignments.Person;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.ArrayList;
public class Person {
    private String firstName;
    private String lastName;
    private int id;

    public Person( int id,String firstName, String lastName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.id = id;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String setLastNameFor7 (String lastname) {
        this.lastName = lastname;
        return this.lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName () {
        return this.firstName;
    }

    public String getLastName () {
        return this.lastName;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return this.id;
    }
    public String toString() {
        return "Person{id=" + this.id + ", firstName='" + this.firstName + "', lastName='" + this.lastName + "'}";

    }

}
