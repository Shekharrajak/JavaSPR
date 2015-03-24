/*
        Print Hello World in an Applet in different Colors Example
        This Java example shows how to create an applet which shows "Hello World" text in
        different colors using Java Applet and Color classes.
*/
 
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
 
/*
        <applet code = "HelloWorldInDifferentColorsExample" width = 300 height = 300>
        </applet>
*/
 
public class HelloWorldInDifferentColorsExample extends Applet{
       
        public void paint(Graphics g){
               
                Color c[] = {Color.blue,Color.cyan, Color.darkGray, Color.gray,
                                Color.green, Color.lightGray, Color.magenta, Color.orange, Color.pink,
                                Color.red, Color.white, Color.yellow};
               
                for(int  i = 0; i<c.length; i++){
                        g.setColor(c[i]);
                        g.drawString("Hello World...",50,50+10*i);
                }
        }
}