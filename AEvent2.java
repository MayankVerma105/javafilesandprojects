import java.awt.*;
import java.awt.event.*;
class AEvent2 extends Frame{
TextField tf;
AEvent2(){
tf = new TextField();
tf.setBounds(60,50,170,20);
Button b = new Button("Click me");
b.setBounds(100,120,80,30);
Outer o = new Outer(this);
b.addActionListener(o);
add(b);add(tf);
setSize(300,300);
setLayout(null);
setVisible(true);

}
public static void main(String[] agrs)
{
new AEvent2();
}
}

class Outer implements ActionListener{
AEvent2 obj;
Outer(AEvent2 obj){
this.obj = obj;
}
public void actionPerformed(ActionEvent e){
obj.tf.setText("Welcome");
}
}


