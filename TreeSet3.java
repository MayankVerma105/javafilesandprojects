import java.util.*;
class TreeSet3{
public static void main(String [] agrs){
TreeSet<Integer> set = new TreeSet<Integer>();
set.add(23);
set.add(66);
set.add(12);
set.add(15);
System.out.println("Highest Value : " +set.pollFirst());
System.out.println("Lowest Value : " +set.pollLast());
}
}
