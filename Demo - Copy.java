import javax.swing.*;
public class Demo
{
public static void main(String... s)
{
JFrame f = new JFrame("Swing First Example");
JButton b = new JButton("Click");
b.setBounds(130,100,100,40);
f.add(b);
f.setSize(400,500);
f.setLayout(null);
f.setVisible(true);
}
}