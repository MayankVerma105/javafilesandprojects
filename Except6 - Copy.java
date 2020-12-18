class Except6{
public static void main(String[] args){
try{
try{
System.out.println("Going to divide");
int b= 39/0;
}
catch(ArithmeticException e){System.out.println(e);}
System.out.println("Other Statement");
}
catch(Exception e){System.out.println("Handeled");}
System.out.println("Normal flow");
}
}