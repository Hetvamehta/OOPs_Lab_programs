package dpack;

import bpack.B;
import cpack.C;

public class ProtectedDemo {
    public static void main(String[] args) {
        System.out.println("Hetva-25");
        B bObj = new B(1, 2, 3);
        C cObj = new C();

        bObj.display();
        System.out.println();
        cObj.display();
    }
}
