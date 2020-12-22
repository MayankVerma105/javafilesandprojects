class Testimmutablestring{  
 public static void main(String args[]){  
   String s="Sachin";  
   String s1=s.concat(" Tendulkar");//concat() method appends the string at the end  
   System.out.println(s1);//will print Sachin because strings are immutable objects  
 }  
}  