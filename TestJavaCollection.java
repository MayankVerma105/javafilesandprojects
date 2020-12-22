import java.util.*;
class TestJavaCollection{
public static void main(String[] agrs){
ArrayList<String> list = new ArrayList <String>();
list.add("Ravi");
list.add("Vijay");
list.add("Ravi");
list.add("Ajay");

Iterator itr = list.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}
}
}