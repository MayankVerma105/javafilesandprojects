import java.util.*;
class TreeSet4{
public static void main(String[] agrs){
TreeSet<String> set = new TreeSet<String>();
set.add("A");
set.add("B");
set.add("C");
set.add("D");
set.add("E");
System.out.println("Intial Set : " + set);
System.out.println("Reverse Set : " + set.descendingSet());
System.out.println("Head Set : " +set.headSet("C",true));
System.out.println("TailSet :" +set.tailSet("C",false));
}
}