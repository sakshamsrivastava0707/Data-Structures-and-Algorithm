import java.util.Scanner;
public class StringImmutabilityExample {
    public static void main(String[] args){
        System.out.println("hey");
        String s1 = " hello ";
        String s2 = " hello ";
        // these s1 and s2 has same memory in intern pool , both are pointing to same shell

        // when we intialize string with new keyword, it points to new shell irrespective that the
        // " hello " string already exist
        String s3 = new String(" hello ");
 // == operator will just check the address of the string , it does not check the value of the two stirng
        System.out.println( s1 == s3 );

        // always use equals to operator to compare the contents of the string s1.equals(s3)
        //equals to first check the value of the reference if not same , then it will check each charater line by line 
        // if everything matches only then it returns true

        // but jb hm == operator sa compare krta hai toh woh kaval address ko compare krta hai , agr address alag hai toh wo
        // false return krdega jo ki galat hai s1 and s3 String case ka andhr
        System.out.println(" when comparing address as well as character by character comparison -> "+ s1.equals(s3));

        s3 = " tello "; // kuki string immutable hai toh tello string ka ek bhi char change nhi krskta hu
        // meaning ki ma string ka instance ko change (mutate ) kisi bhi condition mai nhi kr skta hu
        System.out.println(s3);
        char a = s3.charAt(1) ;
      
    }
}
