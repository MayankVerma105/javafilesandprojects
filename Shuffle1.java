class Shuffle1{
public static void main(String[] args){

int x = 3;
if (x > 2){ 
System.out.println("a");
}
while (x > 0){
x= x-1;
System.out.println("-");
if (x==2){
System.out.println("b c");
}
if (x== 1){
System.out.println("d");
x=x-1;
}
}
}
}
