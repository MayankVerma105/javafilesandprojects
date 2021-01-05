import java.util.*;
public class ArrayList8{
public static void main(String[] agrs){
ArrayList <String> al = new ArrayList<String>();
al.add("Ravi");
al.add("Vijay");
al.add("Ajay");
al.add("Anuj");
al.add("Gaurav");
System.out.println("Intial list.." + al);
//Removing by name
al.remove("Vijay");
System.out.println("After invoking remove(object) method : " +al);

//Remove on the basis of position 
al.remove(0);
System.out.println("After invoking remove(index) method :" + al);

//Creating another ArrayList
ArrayList<String> al2 = new ArrayList<String>();
al2.add("Ravi");
al2.add("Harpreet");
//Adding all the ele
al.addAll(al2);
System.out.println("Updated list :" + al);

al.removeAll(al2);
System.out.println("After invoking removeAll() method : " +al);

al.removeIf(str -> str.contains("Ajay"));
System.out.println("After invoking removeIf() method :" +al);

al.clear();
System.out.println("After invoking clear() method : " +al);


}
}