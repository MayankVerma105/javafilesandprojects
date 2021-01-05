import java.util.*;
public class ArrayList7{
public static void main(String[] agrs){
ArrayList <String> al = new ArrayList<String>();
System.out.println("Initial elements :");
al.add("Ravi");
al.add("Ajay");
al.add("Vijay");
System.out.println("After invoking add(E e) method " +al);
al.add(1,"Gaurav");
System.out.println("After invoking add(int index, E element) method : " +al);
ArrayList<String> al2 = new ArrayList <String>();
al2.add("Sonu");
al2.add("Monu");
al.addAll(al2);//Adding second list ele to 1st list
System.out.println("After invoking addAll(Collection<? extends E> c) method : " + al);
ArrayList <String> al3 = new ArrayList<String>();
al3.add("Rahul");
al3.add("Ayush");
al.addAll(al3);
System.out.println("After invoking allAdd(int index, Collection<? extends E> c) method :" + al);

}
}