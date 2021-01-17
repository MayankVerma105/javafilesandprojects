import java.util.*;
class TestSort3{
public static void main(String[] agrs){
ArrayList al = new ArrayList();
al.add(Integer.valueOf(201));
al.add(Integer.valueOf(101));
al.add(230);

Collections.sort(al);

Iterator i = al.iterator();
while(i.hasNext()){
System.out.println(i.next());
}
}
}