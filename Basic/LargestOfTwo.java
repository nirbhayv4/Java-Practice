package Basic;

import java.util.*;

public class LargestOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();
        if (A >= B) {
            System.out.println("A is largest of 2");
        } else {
            System.out.println("B is largest of 2");
        }
    }
}
