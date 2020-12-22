import javax.swing.*;
public class Simple2 extends JFrame{
JFrame f;
Simple2(){
JButton b = new JButton("Click me");
b.setBounds(130,100,100,40);

add(b);
setSize(400,500);
setLayout(null);
setVisible(true);

}
public static void main (String[] agrs){
new Simple2();
}
}