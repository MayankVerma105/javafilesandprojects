import java.util.*;
public class HashMapExample2{
public static void main(String[] agrs){
HashMap<Integer,String> map = new HashMap<Integer,String>();
map.put(1,"Mango");
map.put(2,"Apple");
map.put(3,"Banana");
map.put(1,"Grapes");
System.out.println("Iterating HashMap..");
for(Map.Entry m : map.entrySet()){
System.out.println(m.getKey()+" "+m.getValue());
}
}
}