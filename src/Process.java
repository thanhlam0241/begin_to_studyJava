import java.io.IOException;
import java.util.*;

public class Process {
    public final int s=12;
    public final void Call(){
        int s=0;
        System.out.println(s);
    }
    public void method() throws IOException{
        throw new IOException("Fuck you");
    }
    public static void main(String args []) {
        List<Integer> concoc = new ArrayList<Integer>(100);
        for (int i = 0; i < 10; i++) {
            concoc.add(i);
        }
        for (int i : concoc) {
            System.out.println(i);
        }
        Process ia = new Process();
     /* try{
          ia.method();
      }
      catch(IOException e){

             System.out.println("Maybe");
        }*/
        List<String> hello = new LinkedList<String>();
        hello.add("Fuck you");
        hello.add("Du ma may");
        hello.add("Con cac");
        System.out.println(hello.get(0));

        Iterator<String> iterator = null;
        iterator = hello.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        //listIterator = Iterator
        hello.add(2, "Con chim");
        ListIterator<String> listIterator = null;
        listIterator = hello.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        List<String> world = new LinkedList<>();
        world.add("Ok");//add method
        world.addAll(hello);  //addAll method
        for (String element : world) {
            System.out.println(element);
        }
        hello.set(0, "Fuckkkkkkkk you");//example about set method
        System.out.println(hello.get(0));
        hello.remove(0);//example about remove method
        System.out.println(hello.get(0));
        hello.remove("Du ma may"); //example about remove method
        System.out.println(hello.get(0));
        System.out.println(hello.contains("Fuck you"));//contains,there is no "Fuck you" element,so false
        System.out.println(hello.indexOf("Con chim"));//indexOf:the first index of "Con chim" element
        System.out.println(hello.lastIndexOf("Con chim"));//lastIndexOf:like indexOf,but last index

        List<Character> characterList = new LinkedList<>();
        characterList.add('A');
        characterList.add('D');
        characterList.add('z');
        characterList.add('m');
        Collections.sort(characterList);//arrange
        for (char i : characterList) {
            System.out.println(i);
        }
        try {
            List<Character> characterList1 = new ArrayList<>(100);
            Collections.copy(characterList1, characterList);
            for (char i : characterList1) {
                System.out.println(i);
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Da xu ly");
        }
        System.gc();

    }
}

