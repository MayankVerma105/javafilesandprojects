import java.util.*;
public class ArrayListEx4{
public static void main(String[] agrs ){
ArrayList<String> list = new ArrayList <String>();
list.add("Mango");
list.add("Apple");
list.add("Orange");
list.add("Grapes");
System.out.println("Returning Elements : " + list.get(1));
list.set(1,"Dates");

for(String fruit : list)
System.out.println(fruit);
}
}