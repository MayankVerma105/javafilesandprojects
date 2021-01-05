import java.util.*;
public class LinkedList2{
public static void main(String[] agrs){
LinkedList<String> ll = new LinkedList <String>();
System.out.println("Intial elements..");
ll.add("Ravi");
ll.add("Vijay");
ll.add("Ajay");
System.out.println("After invoking add(E e) method : " + ll);
ll.add(1,"Gaurav");
System.out.println("After invoking add(int index, E element ) method : " + ll);
//making new LinkedList
LinkedList<String> ll2 = new LinkedList <String>();
ll2.add("Sonu");
ll2.add("Monu");
ll.addAll(ll2);
System.out.println("After invoking addAll(Collection<? extends E> c) method :" + ll);
LinkedList <String> ll3 = new LinkedList<String>();
ll3.add("Rahul");
ll3.add("Ayush");
ll.addAll(1,ll3);
System.out.println("After invoking addAll(int index, Collection<? extends E> c) method :" + ll);
ll.addFirst("Mayank");
System.out.println("After invoking addFirst(E e) method : " + ll);
ll.addLast("Harsh");
System.out.println("After invoking addLast(E e) method : " + ll);

}
}