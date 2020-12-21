import java.io.IOException;
class Testthrows1{
void m() throws IOException{
throw new IOException("device error");
}
void n() throws IOException{
m();
}
void p(){
try{
n();

}
catch(Exception e){System.out.println("exception handled");}
}
public static void main(String agrs[])
{
Testthrows1 obj = new Testthrows1();
obj.p();
System.out.println("normal flow");
}
}

/*import java.io.*;  
class M{  
 void method()throws IOException{  
  throw new IOException("device error");  
 }  
}  
public class Testthrows2{  
   public static void main(String args[]){  
    try{  
     M m=new M();  
     m.method();  
    }catch(Exception e){System.out.println("exception handled");}     
  
    System.out.println("normal flow...");  
  }  
} */ 