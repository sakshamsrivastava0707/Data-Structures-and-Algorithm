import java.util.*;
public class HashmapsExample {
    public static void main(String[] args) {
        // System.out.println("hey");
        HashMap<String, Integer> hm = new HashMap<>();
        // this is how we put inside the hashmap
        hm.put("india", 34);
        hm.put("pakistan", 20);
        hm.put("Australia", 15);
        // there is no specific order inside the hashmap
        System.out.println(hm);
        // TO CHECK IF THE KEY IS PRESENT OR NOT
      System.out.println(hm.containsKey("india"));  
      System.out.println(hm.containsKey("ARABIA"));

      // if the key is not present then it will just show null
        System.out.println(hm.get("Aus"));

        System.out.println(hm.get("india"));
        // if we put the same kind of key again , then it values gets overwritten by latest values
        hm.put("india", 100);

        // to get all the keys of the HashMap
        Set<String> keys = hm.keySet();
        // this gives all the keys inside the Hashmap
        System.out.println(keys);
        for( String eachKey: keys) {
            // we are putting this is the Integer because we are storing the values inside the hashmap as an Integer type
            Integer val = hm.get(eachKey);
            System.out.println(eachKey + " => " + val);
        }
    }
    
}
