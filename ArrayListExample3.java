import java.util.*;
public class ArrayListExample3{
public static void main(String[] agrs){
ArrayList<String>list = new ArrayList<String>();
list.add("Mango");
list.add("Apple");
list.add("Orange");
list.add("Grapes");

for (String fruit : list)
System.out.println(fruit);

}
}