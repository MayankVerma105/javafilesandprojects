import java.util.*;
public class ListExample1{
public static void main(String[] agrs){
List<String> list = new ArrayList<String>();
list.add("Mango");
list.add("Apple");
list.add("Grapes");
list.add("Orange");
for (String fruit : list)
System.out.println(fruit);
}
}