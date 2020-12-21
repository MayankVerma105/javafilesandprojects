/*public class TryClassEx1{
public static void main(String[] agrs) {
try {
int data =50/0;
}
catch(ArithmeticException e){System.out.println(e);}
System.out.println("rest of the code..");
}
}*/

public class TryCatchEx2{
public static void main(String[] agrs){
try {
int data = 50/0;
}
catch(Exception e){System.out.println(e);}
System.out.println("Rest of the code");
}
}

