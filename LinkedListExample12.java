import java.util.*;
class Book1 implements Comparable <Book1>{
int id;
String name,author,publisher;
int quantity;
public Book1(int id, String name, String author, String publisher, int quantity){
this.id = id ;
this.name = name;
this.author = author;
this.publisher = publisher;cls
this.quantity = quantity;

}

public int compareTo(Book1 b){
if (id>b.id){
return 1;
}
else if(id<b.id){
return -1;
}
else{
return 0;
}
}
}
public class LinkedListExample12 {
public static void main(String [] agrs){
Queue<Book1> queue = new PriorityQueue<Book1>();
 //Creating Books  
    Book1 b1=new Book1(121,"Let us C","Yashwant Kanetkar","BPB",8);  
    Book1 b2=new Book1(233,"Operating System","Galvin","Wiley",6);  
    Book1 b3=new Book1(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
    //Adding Books to the queue  
    queue.add(b1);  
    queue.add(b2);  
    queue.add(b3);
System.out.println("Traversing the queue elements : ");
//Travesing 
for(Book1 b: queue){
System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
queue.remove();
System.out.println("After removing one book record : ");
for(Book1 b:queue){
System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
}
}
}
}