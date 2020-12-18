class A
{
A get()
{
return this;
}
}
class B1 extends A{
B1 get()
{
return this;
}
void message()
{
System.out.println("Welcome to covariant realation");
}

public static void main(String[] agrs)
{
new B1().get().message();
}
}