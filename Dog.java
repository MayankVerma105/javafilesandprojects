class Dog {
int size;
String breed;
String name;

void bark(){
System.out.println("Ruff!..Ruff!..");
}
}
class DogTestDrive{
public static void main(String[] agrs){
Dog d = new Dog();
d.size = 40;
d.name = "Peter";
}
}