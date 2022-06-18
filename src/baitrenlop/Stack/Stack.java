package baitrenlop.Stack;

public class Stack<T> {
    private Object[] elements;
    private int size;
    public Stack(){
        elements=new Object[10];
    }
    public Stack(int capacity){
        elements=new Object[capacity];
    }
}
