
package buckyseries;

import java.util.ArrayList;
import java.util.List;


public class BuckySeries {


    public static void main(String[] args) {
     
        String[] things= {"eggs", "lasers", "hats", "pies"};
        List<String> list1 = new ArrayList <String>();
        
        //add array items to list1
        for(String x: things)
            list1.add(x);
        
        String[] morethings = {"lasers", "hats"};
        List<String> list2 = new ArrayList<String>(); 
        
        //add array items to list2
        for(String y: morethings)
            list2.add(y);
        
        //print out list1
        for (int i = 0; i < list1.size(); i++) {
            System.out.printf("%s ", list1.get(i));
            
          editlist(list1,list2);
            System.out.println();
             
            for (int i = 0; i < list1.size(); i++) {
            System.out.printf("%s ", list1.get(i));
             }
        }
        
            public static void editlist(Collection<String> L1, Collection<String>L2){
        
        Iterator<String> it = L1.iterator();
        while(it.hasNext()) {
            if (L2.contains(it.next())) {
                it.remove();
            }
    }
}
