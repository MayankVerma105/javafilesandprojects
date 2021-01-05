import java.util.*;
public class ArrayListExample2{
public static void main(String agrs[]){
ArrayList<String> list = new ArrayList<String>();
list.add("Mango");
list.add("Banana");
list.add("Apple");
list.add("Grapes");
//Traversing
Iterator itr = list.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}
}
}