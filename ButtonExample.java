import javax.swing.*;      
public class ButtonExample{    
ButtonExample(){    
JFrame f=new JFrame("Button Example");            
JButton b=new JButton(new ImageIcon("icon.jfif"));    
b.setBounds(100,100,300, 80);    
f.add(b);    
f.setSize(300,400);    
f.setLayout(null);    
f.setVisible(true);    
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }         
public static void main(String[] args) {    
    new ButtonExample();    
}    
}  