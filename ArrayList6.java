import java.io.*;
import java.util.*;

class ArrayList6{
public static void main(String[] agrs){
ArrayList<String> al = new ArrayList<String>();
al.add("Ravi");
al.add("Vijay");
al.add("Ajay");


try{
FileOutputStream fos = new FileOutputStream("file");
ObjectOutputStream oos = new ObjectOutputStream(fos);
oos.writeObject(al);
fos.close();
oos.close();

FileInputStream fis = new FileInputStream("file");
ObjectInputStream ois = new ObjectInputStream(fis);
ArrayList list = (ArrayList)ois.readObject();
System.out.println(list);
}
catch(Exception e){
System.out.println(e);
}
}
}