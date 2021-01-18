import java.util.*;
import java.io.*;
class Student{  
int rollno;  
String name;  
int age;  
Student(int rollno,String name,int age){  
this.rollno=rollno;  
this.name=name;  
this.age=age;  
}  
} 
class AgeComparator implements Comparator {
public int compare(Object o1, Object o2){
Student s1 = (Student)o1;
Student s2 = (Student)o2;

if (s1.age == s2.age)
return 0;
else if(s1.age>s2.age)
return 1;
else 
return -1;
}
}
public int NameComparator implements Comparator {
public int compare(Object o1, Object o2){
Student s1 = (Student)o1;
Student s2 = (Student)o2;

return s1.name.compareTo(s2.name);
}
}
class Simple{
public static void main(String[] agrs){
ArrayList al = new ArrayList();
al.add(new Student(101,"Vijay",23));
al.add(new Student(102,"Ajay",24));
al.add(new Student(103,"Jai",25));

System.out.println("Sorting by name");

Collections.sort(al, new NameComparator());
Iterator i = al.iterator();
while(i.hasNext()){
Student st=(Student)i.next();
System.out.println(st.rollno+" "+st.name+" "+st.age);
}

System.out.println("Sorting by age");

Collections.sort(al, new AgeComparator());
Iterator i2 = al.iterator();
while(i2.hasNext()){
Student st=(Student)i2.next();
System.out.println(st.rollno+" "+st.name+" "+st.age);
}
}
}