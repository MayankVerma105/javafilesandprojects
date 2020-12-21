class Animal{
void eat(){System.out.println("eating..");}
}
class Dog extends Animal{
void eat(){System.out.println("eating bread");}
void bark(){System.out.println("barking");}
void work(){
super.eat();
bark();
}
}
class TestSuper{
public static void main(String[] agrs){
Dog d = new Dog();
d.work();
}
}