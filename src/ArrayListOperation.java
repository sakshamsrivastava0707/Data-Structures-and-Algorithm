import java.util.ArrayList;
public class ArrayListOperation {
    // ArrayList<Integer> list = new ArrayList<>()
    public static void main( String[] args) {
        // ArrayList is similiar to vector in c++
        ArrayList<Integer> list = new ArrayList<>();
        list.add(56);
        list.add(57);
        list.add(59);
        // this replaces at a particular index , if we want to set out of index , this will give error
        // list.set(1,50);
        list.add(2,50); // this will add element at index 2 and move the other array one size on the right
        System.out.println(list);
        System.out.println(list.size());
        // for(int i=0 ; i< list.size(); i++) {
        //     // get function to retrieve the value in the array list
        //     int num = list.get(i);
        //     // list.remove(list.get(i)); // this removes from the list
        //     System.out.println(num + " at index => " + i);
        // }

        System.out.println(list);
        System.out.println(list.size());

    }
}
