import java.util.*;
class MapEx2{
public static void main(String[] agrs){
Map<Integer,String> map = new HashMap <Integer,String>();
map.put(100,"Amit");
map.put(101,"Vijay");
map.put(102,"Rahul");
for (Map.Entry m: map.entrySet()){
System.out.println(m.getKey()+" "+m.getValue());
}
}
}