import java.util.*;
class HashSet3{
public static void main(String[] agrs){
HashSet<String> set = new HashSet <String>();
set.add("Ravi");
set.add("Vijay");
set.add("Arun");
set.add("Sumit");
System.out.println("An intial list of elements :" +set);
//Removing by name 
set.remove("Ravi");
System.out.println("After invoking remove(object) method: " + set);
HashSet<String> set1 = new HashSet<String>();
set1.add("Ajay");
set1.add("Gaurav");
set.addAll(set1);
System.out.println("Updated list : " +set);
set.removeAll(set1);
System.out.println("After invoking removeAll() method : " +set);
set.removeIf(str->str.contains("Vijay"));
System.out.println("After invoking removeIf() method : " +set);
set.clear();
System.out.println("After invoking clear() method : " +set);
}
}