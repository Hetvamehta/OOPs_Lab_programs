package bpack;

import apack.A;

public class B extends A {
    public B(int pubVar, int protVar, int privVar) {
        super(pubVar, protVar, privVar);
    }

    public void display() {
        System.out.println("From B (inherits A):");
        System.out.println("public variable: " + pubVar);
        System.out.println("protected variable: " + protVar);
        System.out.println("private variable: not accessible in subclass");
    }
}
