package dk.rosenheim.java;

public class Person {
    String navn;
    int age;
    public Person(){

    }
    public Person(String navn){
        this.navn = navn;
    }                   // Overload
    public Person(int age){
        this.age = age;
    }
}
