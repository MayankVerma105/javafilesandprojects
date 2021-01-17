import java.util.*;
public class CollectionExample{
public static void main(String[] agrs){
List<String> list = new ArrayList<String>();
list.add("C");
list.add("Core Java");
list.add("Advance Java");
System.out.println("Initial collection Value : " +list);
Collections.addAll(list,"Servelt","Hibernate");
System.out.println("After adding elements collections value : "+list);
String[] strArr = {"C#",".NET"};
Collections.addAll(list,strArr);
System.out.println("After adding array collection value : " +list);
}
}