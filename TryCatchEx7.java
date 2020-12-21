/*public class TryClassEx1{
public static void main(String[] agrs) {
try {
int data =50/0;
}
catch(ArithmeticException e){System.out.println(e);}
System.out.println("rest of the code..");
}
}

public class TryCatchEx2{
public static void main(String[] agrs){
try {
int data = 50/0;
}
catch(Exception e){
System.out.println("Rest of the code");
}
}
}


public class TryCatchEx7{
public static void main (String[] agrs){
try{
int arr[] ={1,3,4,6};
System.out.println(arr[10]);
 
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println(e);

}
System.out.println("Rest of the code");
}
}*/

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TryCatchEx10{
puclic static void main(String [] agrs){

PrintWriter pw;
try{
pw = new PrintWriter("jtp.txt");
pw.println("saved");

}
catch(FileNotFoundException e){
System.out.println(e);
}
System.out.println("Rest of teh code");

}
}