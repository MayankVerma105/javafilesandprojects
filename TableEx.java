import javax.swing.*;
public class TableEx{
JFrame f;
TableEx()
{
f = new JFrame();
String data [][]= {{"101","Amit","670000"},
		{"102","Jai","720000"},
		{"103","Pavan","800000"}
		};
String column[] = {"ID","NAME","SALARY"};
JTable jt = new JTable (data,column);
jt.setBounds(30,40,200,300);
JScrollPane sp = new JScrollPane(jt);
f.add(jt);
f.setSize(400,400);
f.setVisible(true);

}
public static void main(String[] agrs){
new TableEx();
}
}