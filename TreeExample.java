import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
public class TreeExample{
JFrame f;
TreeExample(){
f = new JFrame();
DefaultMutableTreeNode style = new DefaultMutableTreeNode ("Style");
DefaultMutableTreeNode color = new DefaultMutableTreeNode ("Color");
DefaultMutableTreeNode font = new DefaultMutableTreeNode ("Font");
style.add(color);
style.add(font);
DefaultMutableTreeNode red = new DefaultMutableTreeNode("Red");
DefaultMutableTreeNode blue = new DefaultMutableTreeNode ("Blue");
DefaultMutableTreeNode green = new DefaultMutableTreeNode ("Green");
DefaultMutableTreeNode yellow = new DefaultMutableTreeNode ("Yellow");
color.add(red);color.add(blue);color.add(green);color.add(yellow);
DefaultMutableTreeNode arial = new DefaultMutableTreeNode("Arial");
DefaultMutableTreeNode calibri = new DefaultMutableTreeNode ("Calibri");

font.add(arial);font.add(calibri);
JTree jt = new JTree(style);
f.add(jt);
f.setSize(400,400);
f.setVisible(true);

}
public static void main(String[] agrs){
new TreeExample();

}
}
