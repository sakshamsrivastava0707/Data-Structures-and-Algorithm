import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       System.out.println("enter a string");
       String abc = sc.nextLine();
        // System.out.println(sc);4
        System.out.println(abc);


        int[] arr = new int[6];
        arr[2] =2;
        for(int val : arr) {
            System.out.println(val);
        }
    }
}
