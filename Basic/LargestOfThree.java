package Basic;

import java.util.*;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        sc.close();

        if ((A >= B) && (A >= C)) {
            System.out.println("Largest is A");
        } else if (B >= C) {
            System.out.println("Largest is B");
        } else {
            System.out.println("Largest is C");
        }
    }
}
