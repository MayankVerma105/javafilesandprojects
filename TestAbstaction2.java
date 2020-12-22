abstract class Bike{
Bike(){System.out.println("Bike is created");}
abstract void run();
void changeGear(){System.out.println("gear charged");}
}
class Honda extends Bike {
void run(){System.out.prNintln("running safety");}
}
class TestAbstaction2{
public static void main(String[] agrs){
Bike obj = new Honda();
obj.run();
obj.changeGear();
}
}