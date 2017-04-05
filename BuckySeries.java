
package buckyseries;

import java.util.*;

public class BuckySeries {


    public static void main(String[] args) {
    
        String[] things = {"apples", "noobs", "pwnge","bacon","goATS"};
        
        List<String> list1 = new LinkedList<String>();
        
        for(String x : things)
            list1.add(x);
        
        String[] things2 = {"sausage", "bacon", "goats", "harrypotter"};
        List<String> list2 = new LinkedList<String>();
            for(String y : things2)
                list2.add(y);
            
            list1.addAll(list2);
            list2 = null;
            
            printMe(list1);
            removeStuff(list1, 2, 5);
            printMe(list1);
            reverseMe(list1);
    }
    
    //printMe method
    private static void printMe(List<String> L) {
        for(String b : L)
            System.out.printf("%s ", b);
        System.out.println();
    }
    
    //removeStuff method
    private static void removeStuff(List<String> L, int from, int to) {
        L.subList(from, to).clear();
    }
    
    //reverseMe method
    private static void reverseMe(List<String> L) {
        ListIterator<String> chris = L.listIterator(L.size());
        while(chris.hasPrevious())
            System.out.printf("%s ", chris.previous());
    }
}
