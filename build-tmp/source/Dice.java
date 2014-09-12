import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Dice extends PApplet {

gamble[] roll = new gamble[100];
int i = 0;
int sum = 0;

public void setup()
{
	size(260,300);
	background(255);
	noLoop();
	
}


public void draw()
{
for(int y = 13; y < 261; y += 26)
	{
		for(int x = 13; x < 261; x += 26)
		{
			roll[i] = new gamble(x, y);
			roll[i].show();
			i++;
		}
	}
	textAlign(CENTER);
	textSize(24);
	text("Sum = " + sum, 130, 290);
}

public void mousePressed()
{
	background(255);
	i = 0;
	sum = 0;
	redraw();
}
class gamble
{
	int x, y, diceNum;
	gamble(int tempX, int tempY)
	{
		x = tempX;
		y = tempY;
	}
	public void show()
	{
		stroke(0);
		fill((int)(Math.random()* 256),(int)(Math.random()* 256),(int)(Math.random()*256));
		rect(x - 12, y - 12, 25, 25);
		diceNum = (int)(Math.random()* 6) + 1;
		sum += diceNum;
		fill(0);
		if(diceNum == 1)
		{
			ellipse(x, y, 3, 3);
		}
		if(diceNum == 2)
		{
			ellipse(x - 6.5f, y - 6.5f, 3, 3);
			ellipse(x + 6.5f, y + 6.5f, 3, 3);
		}
		if(diceNum == 3)
		{
			ellipse(x - 6.5f, y - 6.5f, 3, 3);
			ellipse(x, y, 3, 3);
			ellipse(x + 6.5f, y + 6.5f, 3, 3);
		}
		if(diceNum == 4)
		{
			ellipse(x - 6.5f, y - 6.5f, 3, 3);
			ellipse(x + 6.5f, y + 6.5f, 3, 3);
			ellipse(x - 6.5f, y + 6.5f, 3, 3);
			ellipse(x + 6.5f, y - 6.5f, 3, 3);
		}
		if(diceNum == 5)
		{
			ellipse(x - 6.5f, y - 6.5f, 3, 3);
			ellipse(x + 6.5f, y + 6.5f, 3, 3);
			ellipse(x - 6.5f, y + 6.5f, 3, 3);
			ellipse(x + 6.5f, y - 6.5f, 3, 3);
			ellipse(x, y, 3, 3);
		}
		if(diceNum == 6)
		{
			ellipse(x - 6.5f, y - 7 * (sqrt(3)/2), 3, 3);
			ellipse(x + 6.5f, y + 7 * (sqrt(3)/2), 3, 3);
			ellipse(x - 6.5f, y + 7 * (sqrt(3)/2), 3, 3);
			ellipse(x + 6.5f, y - 7 * (sqrt(3)/2), 3, 3);
			ellipse(x - 6.5f, y, 3, 3);
			ellipse(x + 6.5f, y, 3, 3);
		}
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Dice" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
