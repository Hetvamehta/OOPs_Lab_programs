package cpack;

import apack.A;

public class C {
    public void display() {
        A obj = new A(10, 20, 30);
        System.out.println("From C (object of A):");
        System.out.println("public variable: " + obj.pubVar);
        System.out.println("protected variable: not accessible outside package without inheritance");
        System.out.println("private variable: not accessible outside class A");
    }
}
