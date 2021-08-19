public class StringBasicOperation {
    public static void main(String[] args){
        String demo = "hellothis is me";
        char ch = demo.charAt(4);
        // for(int i= 0; i<demo.length(); i++) {
        //     System.out.println("this is element inside the" + demo.charAt(i));
        // }
        // String shortString = demo.substring( beginingIndex, endIndex+1);
        String shortstring = demo.substring(0, 5);
        String shortstring1 = demo.substring(0, 2);

        // String shortstring = demo.substring(0, 5);

        System.out.println("this is substring =>  " + shortstring);
        System.out.println("this is substring =>  " + shortstring1);

        System.out.println(ch);
        System.out.println("hey");
    }
    
}
