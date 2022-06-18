package HackerRank;

import javax.xml.transform.Result;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class CompareTheTriplets {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        ListIterator<Integer> itr1 = a.listIterator();
        ListIterator<Integer> itr2 = b.listIterator();
        List<Integer> it = new ArrayList<Integer>();
        int pa = 0;
        int pb = 0;
        /*if (a.get(0) < b.get(0)) {
            pb++;
        }
        if (a.get(0) > b.get(0)) {
            pa++;
        }*/
        while (itr1.hasNext()) {
            int st1=itr1.next();
            int st2=itr2.next();
            if (st1 < st2) {
                pb++;
            }
            if (st1 > st2) {
                pa++;
            }
        }
        it.add(pa);
        it.add(pb);
        return it;

    }

    public static void main(String[] args) throws IOException {
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        list1.add(17);
        list1.add(28);
        list1.add(30);
        list1.add(434);
        list2.add(99);
        list2.add(16);
        list2.add(8);
        list2.add(42);
        System.out.println(list1.get(0));
        System.out.println(list2.get(0));
        System.out.println(compareTriplets(list1,list2));

    }
}