/*Java throw keyeord example*/

public class TestThrow1{
static void validate(int age){
if (age < 18)
throw new ArithmeticException("not valid");
else
System.out.println("Wel to vote");
}
public static void main(String[] args){
validate(12);
System.out.println("rest of the code..");
}
}