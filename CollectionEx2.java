import java.util.*;
public class CollectionEx2{
public static void main(String[] main){
List<Integer> list = new ArrayList<Integer>();
list.add(23);
list.add(66);
list.add(12);
list.add(46);
list.add(67);
list.add(8);
System.out.println("Value of maximum element from the collection is : " +Collections.min(list));
}
}