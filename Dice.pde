gamble[] roll = new gamble[100];
int i = 0;
int sum = 0;

void setup()
{
	size(260,300);
	background(255);
	noLoop();
	
}


void draw()
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

void mousePressed()
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
	void show()
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
			ellipse(x - 6.5, y - 6.5, 3, 3);
			ellipse(x + 6.5, y + 6.5, 3, 3);
		}
		if(diceNum == 3)
		{
			ellipse(x - 6.5, y - 6.5, 3, 3);
			ellipse(x, y, 3, 3);
			ellipse(x + 6.5, y + 6.5, 3, 3);
		}
		if(diceNum == 4)
		{
			ellipse(x - 6.5, y - 6.5, 3, 3);
			ellipse(x + 6.5, y + 6.5, 3, 3);
			ellipse(x - 6.5, y + 6.5, 3, 3);
			ellipse(x + 6.5, y - 6.5, 3, 3);
		}
		if(diceNum == 5)
		{
			ellipse(x - 6.5, y - 6.5, 3, 3);
			ellipse(x + 6.5, y + 6.5, 3, 3);
			ellipse(x - 6.5, y + 6.5, 3, 3);
			ellipse(x + 6.5, y - 6.5, 3, 3);
			ellipse(x, y, 3, 3);
		}
		if(diceNum == 6)
		{
			ellipse(x - 6.5, y - 7 * (sqrt(3)/2), 3, 3);
			ellipse(x + 6.5, y + 7 * (sqrt(3)/2), 3, 3);
			ellipse(x - 6.5, y + 7 * (sqrt(3)/2), 3, 3);
			ellipse(x + 6.5, y - 7 * (sqrt(3)/2), 3, 3);
			ellipse(x - 6.5, y, 3, 3);
			ellipse(x + 6.5, y, 3, 3);
		}
	}
}