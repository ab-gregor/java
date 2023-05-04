package collectiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CollectionDemo {
   public static void main(String[] args) {

       List<Integer> list = new ArrayList<>();
       list.add(1);
       list.add(2);
       list.add(3);
       list.add(4);
       list.add(5);
       list.add(2);

       for(int n: list) {
     //      System.out.println(n);
       }
     //  System.out.println(list.get(4));

      // System.out.println(list);


     // Set<Integer> set = new HashSet<>();
      Set<Integer> set = new TreeSet<>();
      set.add(11);
      set.add(2);
      set.add(43);
      set.add(54);
      set.add(15);
      set.add(2);
   //   System.out.println(set); // 1 2 3 4 5
       /*
         for(int n: set) {
             System.out.println(n);
         }


         Iterator<Integer> itr = set.iterator();
         while(itr.hasNext()) {
           System.out.println(itr.next());
         }  */

       Map<String, Integer> employeeWages = new HashMap<>();
       employeeWages.put("Thoma", 1000000);
       employeeWages.put("Sagar", 40000);
       employeeWages.put("Dona", 20000);
       employeeWages.put("Alan", 20000);


       System.out.println(employeeWages);
       System.out.println(employeeWages.get("Dona"));

       System.out.println(employeeWages.keySet());

       for(String name: employeeWages.keySet()) {
           System.out.println(name + "--->" + employeeWages.get(name));
       }

       for(Integer salary: employeeWages.values()) {
           System.out.println(salary + "--->");
       }
    }}