public class Player{
int number = 0;

public class guess(){
number = (int) (Math.random() * 10);
System.out.println("I'm guessing" +number);

}
}
public class GuessLauncher{
public static void main(String[] agrs){
GuessGame game = new GuessGame();
game.startGame();
}
}