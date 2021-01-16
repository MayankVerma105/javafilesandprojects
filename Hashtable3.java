import java.util.*;
class Hashtable3{
public static void main(String[] main){
Hashtable<Integer,String> hm = new Hashtable <Integer,String>();
hm.put(100,"Amit");
hm.put(102,"Ravi");
hm.put(101,"Vijay");
hm.put(103,"Rahul");

System.out.println(hm.getOrDefault(101,"Not Found"));
System.out.println(hm.getOrDefault(105,"Not Found"));
}
}