import java.awt.*;
import java.awt.event.*;
class Temp extends Frame implements ActionListener
{ TextField t1=new TextField();
  TextField t2=new TextField();
  Label l1=new Label("Farenheight"); 
  Label l2=new Label("Celsius");
   Temp()
  { setTitle("Temperature");
    setSize(400,200);
    setBackground(Color.black);
    setForeground(Color.red);
   
     setResizable(false);
    setLayout(new GridLayout(5,5));
    add(l1);
    add(t1);
    add(l2);
    add(t2);
   t1.addActionListener(this);
   t2.setEditable(false);
   setVisible(true);
  
  }
public void actionPerformed(ActionEvent ae)
 { Double f=Double.parseDouble(t1.getText());
   String s=Double.toString(((f-32)/1.8));
   t2.setText(s);
  }
 public static void main(String a[])
 { Temp t=new Temp();
 }
} 
