import java.util.*;
class TestVector1{
public static void main(String[] agrs){
Vector<String> v = new Vector<String>();
v.add("umesh");
v.addElement("irfan");
v.addElement("kumar");
//traversing
Enumeration e = v.elements();
while(e.hasMoreElements()){
System.out.println(e.nextElement());
}
}
}