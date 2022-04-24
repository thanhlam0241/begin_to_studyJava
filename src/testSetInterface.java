import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Iterator;
public class testSetInterface {
     public static void main(String args[]){
         //Create a Hash Set
         Set<Integer> set1=new HashSet<>(10);//non-arranged
         set1.add(1);
         set1.add(100);
         set1.add(23);
         System.out.println(set1);
         //Create a TreeSet
         Set<Integer> set2=new TreeSet<>();//can be automatically arranged
         set2.add(1);
         set2.add(100);
         set2.add(23);
         System.out.println(set2);
         //Create a set from a list
         List<Integer> list1=new ArrayList<>(10);
         list1.add(2);
         list1.add(20);
         list1.add(12);
         list1.add(2);
         list1.add(1);
         list1.add(3);
         list1.add(5);
         System.out.println(list1);
         //No condition
         Set<Integer> set3=new TreeSet<>(list1);
         System.out.println(set3);
         //Have conditions
         Set<Integer> set4=new TreeSet<>(list1);
         set4=list1.stream().filter(number->number%2==0).collect(Collectors.toSet());
         System.out.println(set4);
         //Display elements of a set
         //Use the advanced for loop
         for(int i:set4){
             System.out.println(i);
         }
         //use iterator
         Iterator<Integer> it=null;
         it=set4.iterator();
         while(it.hasNext()){
             System.out.println(it.next());
         }
         //Add elements
         //use add() method
         set4.add(45);

         //remove a element
         set4.remove(45);
         System.out.println(set4);

         System.out.println(set4.contains(3));//false
         System.out.println(set4.size());//number of elements ,maybe 3
         set4.clear();//clear all elements of set4

         set1.clear();
         set2.clear();
         set1.add(1);
         set1.add(2);
         set1.add(3);
         set2.add(1);
         set2.add(3);

         //containsAll():is subset
         System.out.println(set1.containsAll(set2));
         //addAll(): merge all elements from set2 to set1
         set2.add(434);
         set2.addAll(set1);//
         System.out.println(set2);
         set2.clear();
         set2.add(1);
         set2.add(2);
         set2.add(223);
         set2.add(23);
         /*set1.retainAll(set2);//find subset of set1 and set2
         System.out.println(set1);*/
         //removeAll():
         set1.removeAll(set2);
         System.out.println(set1);






     }
}
