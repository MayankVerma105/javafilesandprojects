import java.util.*;
public class LinkedList4{
public static void main(String [] agrs){
LinkedList <String> ll = new LinkedList<String>();
ll.add("Ravi");
ll.add("Vijay");
ll.add("Ajay");
Iterator i = ll.descendingIterator();
while(i.hasNext())
{
System.out.println(i.next());
}
}
}