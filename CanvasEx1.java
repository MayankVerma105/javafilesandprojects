import java.awt.*;
public class CanvasEx1{
public CanvasEx1(){
Frame f = new Frame();
f.add(new MyCanvas());
f.setLayout(null);
f.setSize(400,400);
f.setVisible(true);

}
public static void main(String[] agrs){
new CanvasEx1();

}
}
class MyCanvas extends Canvas{
public MyCanvas(){
setBackground(Color.GRAY);
setSize(300,200);


}
public void paint(Graphics g){
g.setColor(Color.RED);
g.fillOval(75,75,150,75);
}
}