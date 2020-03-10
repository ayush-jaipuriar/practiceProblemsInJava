import java.io.*;
import java.util.*;

class OuterClass {
    int data = 10;

    int getData() {
        return data;
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        if (outer.getData() < 20) {
            class InnerClass {
                int getValue() {
                    System.out.println("Inside inner class");
                    return outer.data; // Inner local class has access to the object created of the outer class
                }
            }
            InnerClass in = new InnerClass();
            System.out.println(in.getValue());

        } else {
            System.out.println("Inside outer class");
        }
    }
}