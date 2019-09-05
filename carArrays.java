import java.util.*;

public class CarArrays
{
	public static void main(String[]args)
	{	
		Scanner scan = new Scanner(System.in);
		
		boolean[] ignition = new boolean[10];
		int[] x = new int[10];
		int[] y = new int[10];
		char[] colorChar = new char[10];
		int[] car = new int[10];
		
		for(int i = 0; i < 10; i++)
		{
			x[i] = randomizePosition();
			y[i] = randomizePosition(); 
			colorChar[i] = assignColor(); 
			car[i] = i+1; 
		}
		
		while(true)
		{
			System.out.println("which car would you like to use?(Choose from 1 - 10)");
			System.out.println("Input: "); 
			int carNumb = scan.nextInt(); 
			
			System.out.println();	
			
			System.out.println("What would you like to do?");
			System.out.println("1: Turn the ignition on/off");
			System.out.println("2: Change the position of the car");
			System.out.println("Q: Quit this program");
			System.out.println("Input: "); 
			
			String input = scan.next();
			System.out.println();
		
			if(input.equals("1"))
			{
				ignition[carNumb-1] = ignitionSwitch(ignition[carNumb-1]); 
				reportState(ignition[carNumb-1], colorChar[carNumb-1], x[carNumb-1], y[carNumb-1], car[carNumb-1]);
			}
			else if(input.equals("2"))
			{
				System.out.println("In which direction do you want to move the car?");
				System.out.println("H: Horizontal");
				System.out.println("V: Vertical");
				System.out.println("Diretion: ");
				String inputSecond = scan.next();
				System.out.println();
				
				if(inputSecond.equals("H"))
				{
					System.out.println("Enter a movement distance: ");
					int inputH = scan.nextInt();
					
					x[carNumb-1] = moveHorizontally(x[carNumb-1], inputH, ignition[carNumb-1]);
					reportState(ignition[carNumb-1], colorChar[carNumb-1], x[carNumb-1], y[carNumb-1], car[carNumb-1]);	
				}
				else if(inputSecond.equals("V"))
				{
					System.out.println("Enter a movement distance: ");
					int inputV = scan.nextInt(); 

					y[carNumb-1] = moveVertically(y[carNumb-1], inputV, ignition[carNumb-1]); 
					reportState(ignition[carNumb-1], colorChar[carNumb-1], x[carNumb-1], y[carNumb-1], car[carNumb-1]);
				}
				else
				{
					System.out.println("you put the wrong input here, try again");
					System.out.println();
				}
			}
			else if(input.equals("Q"))
			{
				System.out.println("you ended the program");
				return;
			}
			else
			{
				System.out.println("you put the wrong input here, try again");
				System.out.println();
			}
		}
	}
	
	public static int randomizePosition()
	{
		int randNumber = (int)(Math.random() * 20 + 1);
		return randNumber;
	}
	
	public static char assignColor()
	{
		String colorString = "RGBWS";
		int tmp = (int)(Math.random() * colorString.length());	
		char colorChar = colorString.charAt(tmp);
		return colorChar; 
	}
	
	public static boolean ignitionSwitch(boolean ignition)
	{
		ignition = !ignition;
		return ignition;
	}
	
	public static int moveHorizontally(int x, int xInput, boolean ignitionState)
	{		
		if(ignitionState == false)
		{
			System.out.println("the ignitionState is off");
			System.out.println();
			return x;
		}
		else
		{
			if(x + xInput < 1 || x + xInput > 20)
			{
				System.out.println("out of boundary");
				System.out.println();
				return x;
			}
			else
			{
				return x + xInput; 
			}
		}
	}
	
	public static int moveVertically(int y, int yInput, boolean ignitionState)
	{	
		if(ignitionState == false)
		{
			System.out.println("the ignitionState is off");
			System.out.println();
			return y;
		}
		else
		{
			if(y + yInput < 1 || y + yInput > 20)
			{
				System.out.println("out of boundary");
				System.out.println();
				return y;
			}
			else
			{
				return y + yInput; 
			}
		}
	}
	
	public static void reportState(boolean ignition, char charColor, int x, int y, int carNumb)
	{
		String ignitionState = "";
		String stringColor = "";
		String position  = "(" +x+ "," +y+ ")";
		
		if(ignition == true)
		{
			ignitionState = "on";
		}
		else
		{
			ignitionState = "off";
		}
		
		if(charColor == 'R')
		{
			stringColor = "Red";
		}
		else if(charColor == 'G')
		{
			stringColor = "Green";
		}
		else if(charColor == 'B')
		{
			stringColor = "Black";
		}
		else if(charColor == 'W')
		{
			stringColor = "White";
		}
		else if(charColor == 'S')
		{
			stringColor = "Silver";
		}
		
		System.out.println("Car Information");
		System.out.println("Car#: " + carNumb);
		System.out.println("Color: " + stringColor);
		System.out.println("Ignition: " + ignitionState);
		System.out.println("Location: " + position);
		
		for(int i = 1; i <= 20; i++)
		{
			for(int j = 1; j <= 20; j++)
			{
				if((j == x) &&(i == y))
				{
					System.out.print(charColor);
				}
				else
				{
					System.out.print("-");	
				}
			}
			System.out.println();
		}
	}	
}