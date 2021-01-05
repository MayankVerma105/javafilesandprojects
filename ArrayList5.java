import java.util.*;
class Student{
int rollno;
String name;
int age;
Student(int rollno,String name, int age){
this.rollno = rollno;
this.name = name;
this.age =age;

}
}


class ArrayList5{
public static void main(String[] agrs){
Student s1 = new Student(101,"Mayank",20);
Student s2 = new Student(102,"Ravi",21);
Student s3 = new Student(103,"Saurav",23);

ArrayList <Student> list = new ArrayList<Student>();
list.add(s1);
list.add(s2);
list.add(s3);
Iterator itr = list.iterator();

while(itr.hasNext()){
Student st = (Student)itr.next();
System.out.println(st.rollno+ " "+ st.name + " " + st.age);
}
}
}