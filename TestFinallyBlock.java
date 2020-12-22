class TestFinallyBlock{
public static void main(String[] agrs){
try{
int data =25/5;
System.out.println(data);
}
catch(NullPointerException e){System.out.println(e);}
finally{System.out.println("Finally block is always executed");
}
}
}