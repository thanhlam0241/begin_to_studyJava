package Study;

import java.util.ArrayList;
import java.util.List;

public class testArrayList {
    public static void main(String[] args){
        List<Integer> arrayList= new ArrayList<>(100);
        arrayList.add(7);
        System.out.println(arrayList.get(0));//7
        arrayList.add(8);            //add: them phan tu vao arraylist
        arrayList.add(9);
        arrayList.add(1,7);//chen phan tu vao vi tri index
        arrayList.set(0,6);       //dat lai phan tu thu i
        System.out.println(arrayList.get(0));//6
        arrayList.remove(2);//xoa chi so thu index
        arrayList.clear();//xoa het tat ca
        arrayList.add(56);
        arrayList.add(100);
        arrayList.add(656);
        System.out.println(arrayList.get(0));//56
        System.out.println(arrayList);
        Object[] arr=arrayList.toArray();//chuyen arrayList thanh 1 array
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
