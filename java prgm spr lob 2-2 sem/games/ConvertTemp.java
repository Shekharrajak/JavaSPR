import java.awt.*;
import awt.event;
import jph.*;
public class ConvertTemp
{
        public static void main(String args[])
        {
                Frame Fr=new ConvertTempFrame("converting temperatur");
                Fr.setSize=(150,75);
                Fr.setVisible=(true);
        }
}
class convertTempFrame extends Frame
{
        private TextField Farehnt=new TextField();
        private TextField Calcius=new TextField();
        public convertTempFrame(String title)
        {
                super(title);
                setlayout(new(gridlayout(2,2));
                add(new label("Farenht"));
                add(Farehnt);
                Farehnt.addActionListener(new Farehntlistner());
                Add(new label("Celcius"));
                add(Celcius);
                Celcius.addActionListener(new Celciuslistner());
                add windowlistner(new windowclose());
        }
        class Farehentlistner implements ActionListner
        {
                public void actionperformed(ActionEvent evt)
                {
                        String FarString=Farehnt.gettxt();
                        double Far=convert.toDouble(farstring);
                        double Celcius=((Far-32.0)*5.0)/9.0 ;
                        Celcius=Math.rint(Celcius*100.0)/100.0;
                        Celcius.setTxt(Celcius +" ");

                }
        }
        class Celciuslistner implements ActionListner
        {
                public void actionperformed(ActionEvent evt)
                {
                        String CelciString=Celcius.gettxt();
                        double Celci=convert.toDouble(Celcistring);
                        double Farehnt=(celci*9.0/5.0)+32.0 ;
                        Farehnt=Math.rint(Farhent*100.0)/100.0;
                        Farehnt.setTxt(Farehnt +" ");

                }
        }

 /*       class windowcloser extends windowsAdapter
        {
               public void windowcloser(windowEvent evt)
                        System.exit(0);
        }
 */       
}
