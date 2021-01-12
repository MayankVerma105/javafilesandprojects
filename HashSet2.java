import java.util.*;
class HashSet2{
public static void main(String[] agrs){
HashSet<String> set = new HashSet<String>();
set.add("Ravi");
set.add("Vijay");
set.add("Ravi");
set.add("Ajay");
Iterator i = set.iterator();
while(i.hasNext()){
System.out.println(i.next());
}
}
}