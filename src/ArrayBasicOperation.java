import java.util.Scanner;
public class ArrayBasicOperation {

    // public static void takeArrayAsInput() {
        

    // }
    public static void DisplayArray( int[] arr) {
        // when array is passed as argument what gets actually passed is the 
        // value of the reference , if any change is made here in the array , it will reflect everywhere
        arr[4] = 6 ;
        arr[5] = 5 ;
        // now this changes will be reflected

        for( int val: arr){
            System.out.println(val);
        }
    }
    public static void DisplayArrayWithNewArray( int[] arr) {
        // when array is passed as argument what gets actually passed is the 
        // value of the reference , if any change is made here in the array , it will reflect everywhere
        arr = new int[5];
        arr[2] =10;
        // now this changes will be reflected

        for( int val: arr){
            System.out.println(val);
        }
    }
    public static void main(String[] args) {
        System.out.println("hey");
        Scanner sc=new Scanner(System.in);  
        /// arr.length is to get the size of the array
        int[ ] arr = new int[5];
        for(int i= 0; i< arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(arr);
        DisplayArrayWithNewArray(arr);
        for( int val: arr){
            System.out.println(val);
        }

    }
}
