class TestFinallyEx{
public static void main(String [] agrs){
try{
int a = 25/0;
System.out.println(a);
}
catch(ArithmeticException e){System.out.println(e);}
finally {System.out.println("Finally Block is always executed");}
System.out.println("rest of the code..");
}
}