package Basic;

import java.util.*;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();

        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");

        }
    }
}
