import java.util.*;
class TestSort1{
public static void main(String[] agrs){
ArrayList<String> al = new ArrayList<String>();
al.add("Viru");
al.add("Saurav");
al.add("Mukesh");
al.add("Mayank");

Collections.sort(al);
Iterator itr = al.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}
}
}