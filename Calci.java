## `CALCI USNG JAVA`
import java.awt.*;
import java.awt.event.*;
class Calci implements ActionListener
{
TextField t1,t2,t3;
Button b1,b2;
Void launchFrame()
{
Frame fr= new Frame();
t1 = new TextField(10);
t2 =new  TextField(10);
t3 =new  TextField(10);
b1 =new Button("+");
b2 =new Button("-");
Label l1= new Label("Enter the 1st number") ;
Label l2= new Label("Enter the 2nd number") ;
Label l3= new Label("Result") ;
fr.setLayout(new FlowLayout());
b1.addActionListener(this);
b2.addActionListener(this);
fr.add(t1);
fr.add(t2);
fr.add(t3);
fr.add(b1);
fr.add(b2);
fr.add(l1);
fr.add(l2);
fr.add(l3);
fr.setVisible(true);
fr.setSize(400,400);
}
public void actionPerformed(ActionEvent a)
{
int x =Integer.parseInt(t1.getText());
int y=Integer.parseInt(t2.getText());
if(a.getSource()==b1)
{
int z=x+y;
t3.setText(Integer.toString(z));
}
if(a.getSource()==b2)
{
int z=x-y;
t3.setText(Integer.toString(z));
}
}
public static void main(String arg[])
{
 Calci obj= new Calci();
obj.launchFrame();
}
}



