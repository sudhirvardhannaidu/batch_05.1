public class MyCalculator extends Frame  
{  
  
public boolean setClear=true;  
double number, memValue;  
char op;  
  
String digitButtonText[] = {"7", "8", "9", "4", "5", "6", "1", "2", "3", "0", "+/-", "." };  
String operatorButtonText[] = {"/", "sqrt", "*", "%", "-", "1/X", "+", "=" };  
String memoryButtonText[] = {"MC", "MR", "MS", "M+" };  
String specialButtonText[] = {"Backspc", "C", "CE" };  
  
MyDigitButton digitButton[]=new MyDigitButton[digitButtonText.length];  
MyOperatorButton operatorButton[]=new MyOperatorButton[operatorButtonText.length];  
MyMemoryButton memoryButton[]=new MyMemoryButton[memoryButtonText.length];  
MySpecialButton specialButton[]=new MySpecialButton[specialButtonText.length];  
  
Label displayLabel=new Label("0",Label.RIGHT);  
Label memLabel=new Label(" ",Label.RIGHT);  
  
final int FRAME_WIDTH=325,FRAME_HEIGHT=325;  
final int HEIGHT=30, WIDTH=30, H_SPACE=10,V_SPACE=10;  
final int TOPX=30, TOPY=50;  
///////////////////////////  
MyCalculator(String frameText)//constructor  
{  
super(frameText);  
  
int tempX=TOPX, y=TOPY;  
displayLabel.setBounds(tempX,y,240,HEIGHT);  
displayLabel.setBackground(Color.BLUE);  
displayLabel.setForeground(Color.WHITE);  
add(displayLabel);  
  
memLabel.setBounds(TOPX,  TOPY+HEIGHT+ V_SPACE,WIDTH, HEIGHT);  
add(memLabel);  
  
// set Co-ordinates for Memory Buttons  
tempX=TOPX;   
y=TOPY+2*(HEIGHT+V_SPACE);  
for(int i=0; i<memoryButton.length; i++)  
{  
memoryButton[i]=new MyMemoryButton(tempX,y,WIDTH,HEIGHT,memoryButtonText[i], this);  
memoryButton[i].setForeground(Color.RED);  
y+=HEIGHT+V_SPACE;  
}  
  
//set Co-ordinates for Special Buttons  
tempX=TOPX+1*(WIDTH+H_SPACE); y=TOPY+1*(HEIGHT+V_SPACE);  
for(int i=0;i<specialButton.length;i++)  
{  
specialButton[i]=new MySpecialButton(tempX,y,WIDTH*2,HEIGHT,specialButtonText[i], this);  
specialButton[i].setForeground(Color.RED);  
tempX=tempX+2*WIDTH+H_SPACE;  
}  
