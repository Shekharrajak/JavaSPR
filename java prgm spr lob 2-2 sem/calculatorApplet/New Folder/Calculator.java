import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;



public class Calculator extends Applet implements ActionListener, KeyListener
{

final int MAX_INPUT_LENGTH = 17;



final int INPUT_MODE = 0;
final int RESULT_MODE = 1;
final int ERROR_MODE = 2;
int displayMode;

Label displayLabel;

double lastNumber;

char lastOperator;

public Calculator()
 {
 super();
 setLayout (new BorderLayout());

 Panel buttonPanel = new Panel();

 Panel numberPanel = new Panel();
 numberPanel.setLayout(new GridLayout(4, 3)); 

 addButtonToPanel (numberPanel, new Button("7"), Color.blue);
 addButtonToPanel (numberPanel, new Button("8"), Color.blue);
 addButtonToPanel (numberPanel, new Button("9"), Color.blue);
 addButtonToPanel (numberPanel, new Button("4"), Color.blue);
 addButtonToPanel (numberPanel, new Button("5"), Color.blue);
 addButtonToPanel (numberPanel, new Button("6"), Color.blue);
 addButtonToPanel (numberPanel, new Button("1"), Color.blue);
 addButtonToPanel (numberPanel, new Button("2"), Color.blue);
 addButtonToPanel (numberPanel, new Button("3"), Color.blue);
 addButtonToPanel (numberPanel, new Button("."), Color.blue);
 addButtonToPanel (numberPanel, new Button("0"), Color.blue);
 addButtonToPanel (numberPanel, new Button("+/-"), Color.blue);

 buttonPanel.add(numberPanel);

 Panel operatorPanel = new Panel();
 operatorPanel.setLayout(new GridLayout(4, 1)); 

 addButtonToPanel (operatorPanel, new Button("/"), Color.green);
 addButtonToPanel (operatorPanel, new Button("*"), Color.green);
 addButtonToPanel (operatorPanel, new Button("-"), Color.green);
 addButtonToPanel (operatorPanel, new Button("+"), Color.green);

 buttonPanel.add(operatorPanel);

 Panel controlPanel = new Panel();
 controlPanel.setLayout(new GridLayout(4, 1)); 

 addButtonToPanel (controlPanel, new Button("AC"), Color.cyan);
 addButtonToPanel (controlPanel, new Button("C"), Color.cyan);
 addButtonToPanel (controlPanel, new Button("="), Color.cyan);

 buttonPanel.add(controlPanel);

 displayLabel = new Label("");
 displayLabel.setAlignment(Label.CENTER);

 add(displayLabel, "North");

 displayResult(0);

 add(buttonPanel);
 addKeyListener(this);
 requestFocus();

 clearAll();
 }

void setDisplayString(String s)
 {
 displayLabel.setText(s);
 }

String getDisplayString ()
 {
 return displayLabel.getText();
 }

void clearAll()
 {
 setDisplayString("0");
 lastOperator = 0;
 lastNumber = 0;
 displayMode = INPUT_MODE;
 boolean clearOnNextDigit = true;
 }

void clearLastEntry()
 {
 setDisplayString("0");
 boolean clearOnNextDigit = true;
 displayMode = INPUT_MODE;
 }


void displayResult(double result)
 {
 setDisplayString(Double.toString(result));
 lastNumber = result;
 displayMode = RESULT_MODE;
 boolean clearOnNextDigit = true;
 }

void displayError(String errorMessage)
 {
 setDisplayString(errorMessage);
 lastNumber = 0;
 displayMode = ERROR_MODE;
 boolean clearOnNextDigit = true;
 }

void addButtonToPanel(Panel panel, Button button, Color backgroundColour)
 {
 panel.add(button);
 button.setBackground(backgroundColour);
 button.addKeyListener(this);
 button.addActionListener(this);
 }

public void actionPerformed (ActionEvent e)
 {
 processButton(e.getActionCommand()); 
 }


void processButton(String command) 
 {
 if (command.equals("0")) addDigit(0);
 if (command.equals("1")) addDigit(1);
 if (command.equals("2")) addDigit(2);
 if (command.equals("3")) addDigit(3);
 if (command.equals("4")) addDigit(4);
 if (command.equals("5")) addDigit(5);
 if (command.equals("6")) addDigit(6);
 if (command.equals("7")) addDigit(7);
 if (command.equals("8")) addDigit(8);
 if (command.equals("9")) addDigit(9);
 if (command.equals(".")) addDecimalPoint();
 if (command.equals("*")) processOperator('*');
 if (command.equals("-")) processOperator('-');
 if (command.equals("/")) processOperator('/');
 if (command.equals("+")) processOperator('+');
 if (command.equals("=")) processEquals();
 if (command.equals("+/-")) processSignChange();
 if (command.equals("AC")) clearAll();
 if (command.equals("C")) clearLastEntry();
 }

double getNumberInDisplay()
 {
 String input = displayLabel.getText();
 return Double.parseDouble(input);
 }


double processLastOperator() throws DivideByZeroException
 {
 double result = 0;
 double numberInDisplay = getNumberInDisplay();
 switch (lastOperator)
  {
  case '*':
   result = lastNumber * numberInDisplay;
   break;
  case '+':
   result = lastNumber + numberInDisplay;
   break;
  case '-':
   result = lastNumber - numberInDisplay;
   break;
  case '/':
   if (numberInDisplay == 0)
    throw (new DivideByZeroException());
   result = lastNumber / numberInDisplay;
   break;
  }  
 return result;
 } 

void processOperator(char op) 
 {
 if (displayMode != ERROR_MODE)
  {
  double numberInDisplay = getNumberInDisplay();
  if (lastOperator != 0) 
   {
   try
    {
    double result = processLastOperator();
    displayResult(result);
    lastNumber = result;
    }
   catch (DivideByZeroException e)
    {
    displayError("Division by zero!");
    }
   }
  else
   {
   lastNumber = numberInDisplay;
   }
  boolean clearOnNextDigit = true;
  lastOperator = op;
  }
 }



void processEquals()
 {
 if (displayMode != ERROR_MODE)
  {
  try
   {
   double result = processLastOperator();
   displayResult(result);
   }
  catch (DivideByZeroException e)
   {
   displayError("Division by zero!");
   }
  lastOperator = 0;
  }
 }



void processSignChange()
 {
 if (displayMode == INPUT_MODE)
  {
  String input = getDisplayString();
  if (input.length() > 0)
   {
   if (input.indexOf("-") == 0)
    setDisplayString(input.substring(1));
   else
    setDisplayString("-" + input);
   }
  }
 else if (displayMode == RESULT_MODE)
  {
  double numberInDisplay = getNumberInDisplay();
  if (numberInDisplay != 0)
   displayResult(-numberInDisplay);
  }
 
 }


void addDigit(int digit)
 {
  if (clearOnNextDigit)
  setDisplayString("");

 
 String inputString = getDisplayString();
 if ((!inputString.equals("0") || digit > 0)  && inputString.length() < MAX_INPUT_LENGTH)
  {
  setDisplayString(inputString + digit);
  }
 displayMode = INPUT_MODE;
 clearOnNextDigit = false;
 }

void addDecimalPoint()
 {
 displayMode = INPUT_MODE;
 if (clearOnNextDigit)
  setDisplayString("");
 String inputString = getDisplayString();

 
 if (inputString.indexOf(".") < 0)
  setDisplayString(new String(inputString + "."));
 }

public void keyPressed(KeyEvent e)
 {
 }

public void keyReleased(KeyEvent e)
 {
 }


public void keyTyped(KeyEvent e)
 {
 String command;
 char keyChar = e.getKeyChar();
 if (keyChar == KeyEvent.VK_ENTER)
  {
  command = new String("=");
  }
 else if (keyChar == KeyEvent.VK_ESCAPE)
  {
  command = new String("C");
  }
 else
  {
  
  byte bytes[] = {(byte)keyChar};
  command = new String(bytes);
  }
 processButton(command);
 }
}



class DivideByZeroException extends Exception
 {
 DivideByZeroException()
  {
  super("Divide by zero");
  }
 }


