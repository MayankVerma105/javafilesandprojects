import java.util.*;
class ArrayListExample4{
public static void main(String[] agrs){
ArrayList <String> list  = new ArrayList <String>();
list.add("Ravi");
list.add("Vijay");
list.add("Ravi");
list.add("Ajay");

System.out.println("Traversing list through List Iterator : ");

ListIterator <String> list1 = list.listIterator(list.size());
while (list1.hasPrevious())
{
String str = list1.previous();
System.out.println(str);

}

System.out.println("Traversing list through for loop :");
list.forEach(a->{
System.out.println(a);
});
System.out.println("Traversing list through forEachRemaining() method : ");

Iterator <String> itr = list.iterator();
itr.forEachRemaining(a->{
System.out.println(a);
});

}
}