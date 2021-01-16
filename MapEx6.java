import java.util.*;
class MapEx6{
public static void main(String[] agrs){
Map<Integer, String> map = new HashMap<Integer,String>();
map.put(100,"Amit");
map.put(101,"Vijay");
map.put(102,"Rahul");
map.entrySet()
     //Returns a sequential Stream with this collection as its source  
     .stream()  
     //Sorted according to the provided Comparator  
     .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))  
     //Performs an action for each element of this stream  
     .forEach(System.out::println);  
 }  

}