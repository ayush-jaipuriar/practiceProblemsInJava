import java.io.*;
import java.util.*;

interface Age {
    int x = 21;

    void getAge();
}

class AnonymousDemo {
    public static void main(String[] args) {
        Age ob1 = new Age() {
            @Override
            public void getAge() {
                System.out.println("Age is " + x);
            }
        };
        ob1.getAge();
    }
}
