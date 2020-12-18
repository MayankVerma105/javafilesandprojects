import java.awt.*;
import java.awt.event.*;
class Demo1 extends Frame implements ActionListener
{
	TextField tf;
	Demo1()
	{
		tf = new TextField();
		tf.setBounds(60,50,170,20);
		Button b = new Button("Click Me");
		b.setBounds(100,120,80,30);
		b.addActionListener(this);
		add(tf);
		add(b);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
		tf.setText("Hello Mayank");
	}


	public static void main(String... s)
	{
		new Demo1();
	}
}