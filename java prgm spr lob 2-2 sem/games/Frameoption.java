import java.awt.*;
import java.io.*;
import java.awt.event.*;

public class Frameoption
{
        public static void main(String [] args)
        {
                Frame f=new ShowFrame("show definition");
                f.setSize(600,300);
                f.setVisible(true);
        }
}

class ShowFrame extends Frame
{
        private List termList=new List();
        private TextArea definitionArea=new TextArea();
        private String[]terms={"Button","Checkbox","choice","label","list","scrollbar","TextArea","Textfeild"};
        private String[]definitions={"A labelled button that can \n be pressed","A box that can be clicked \n\"on\"off\" ",
         "A menu that displays one\n item at aitem",
         "A string that can be \n positioned next to"+"other\n components",
        "A scrolling list of items",
        "A sliding bar that can be \neither horizontal or"+"vertical",
        "A multiline area in which \n text can be displayed"+"or \n edited",
        "A single line of text that \n can be displayed"+ "or \n edited"};
 
        public ShowFrame(String title)
        {
                super(title);
                for(int i=0;i<terms.length;i++)
        termList.add(terms[i]);
        termList.addItemListener(new ListListener());
        add("West",termList);
        definitionArea.setEditable(false);
        add("Center",definitionArea);
        addWindowListener(new WindowCloser());
        }
        class ListListener implements ItemListener
        {
        public void itemStateChanged(ItemEvent evt)
        {
        int index=termList.getSelectedIndex();
        definitionArea.setText(definitions[index]);
        }
        }

        class WindowCloser extends WindowAdapter
        {
        public void WindowClosing(WindowEvent evt)
        {
                System.exit(0);
        }
        }
}
