import java.util.*;
class Book{
String name, author, publisher;
int quantity;
public Book(int id, String name,String author, String publisher, int quantity){
this.id = id;
this.name = name;
this.author = author;
this.publisher = publisher;
this.quantity = quantity;
}
}

public class ArrayExample11{
public static void main(String[] agrs){
List<Book> list = new ArrayList<String>();
Book b1 = new Book(101,"Let us C","Yashwant Kanetkar","BPB",7);
Book b2 =  new Book(102,"Data Communications and Networking","Forouzan","Mc Graw Hill",4);
Book b3=new Book(103,"Operating System","Galvin","Wiley",6);  
//Adding to list 
list.add(b1);
list.add(b2);
list.add(b3);

for (Book b: list){
System.out.println(b.id +" "+ b.name +" "+ b.author +" "+ b.publisher +" "+ b.quantity);
}
}
}