import java.util.*;
class LinkedHashMap2{
public static void main(String[] agrs){
LinkedHashMap <Integer, String> map = new LinkedHashMap<Integer, String>();
map.put(100,"Amit");
map.put(101,"Vijay");
map.put(102,"Rahul");
//Fetch key
System.out.println("Keys : " +map.keySet());
//Fetch value
System.out.println("Values : " +map.values());
//fetching key-value pair
System.out.println("Key-Value Pairs : " +map.entrySet());

}
}