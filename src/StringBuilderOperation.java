public class StringBuilderOperation {
    public static void main(String[] args) {
        // we can change the string ,modify it mtlb ki mutate kr skta hai
        StringBuilder test = new StringBuilder(" hello");

    System.out.println(test);
    // this can be done only in string Builder
    test.setCharAt(0, 'A');
    test.insert(1, 'f');
    // to add at any index
    test.insert(test.length(), 'f');
    System.out.println(test.substring(2, 5));
    // to delete a character in the StringBuilder
    test.deleteCharAt(0);
    // to add to the last of the string 
    test.append('A');

    // performance of StringBuilder is O(n)  which is way faster than the normal string O(n^2)
    StringBuilder a = new StringBuilder("hey");
    for(int i=0; i< 100; i++) {
        a.append(i);
    }
    
    System.out.println(a);

    // System.out.println(test);

    }
    
}
