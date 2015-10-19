import java.util.Scanner;
import java.lang.Character;

public class Wires {
	
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		
		String tempString;
		boolean loop = true;
		
		while(loop)
		{

			System.out.println("Enter the first letters of the wire colors in order.");
			System.out.println("EXAMPLE: Red, Yellow, White, Black --> rywB");
			System.out.println("NOTE: blue --> b      black --> B");
			

			tempString = userInput.next();
			if (tempString.equals("QUIT")) 
			{
				loop = false;
				System.out.println("Quitting.");
			}


			if (tempString.length() == 3)
			{
				char a = tempString.charAt(0);
				char b = tempString.charAt(1);
				char c = tempString.charAt(2);

				System.out.println("First wire: " + a);
				System.out.println("Second wire: " + b);
				System.out.println("Third wire: " + c);



				if ((a != 'r') && (b != 'r') && (c != 'r'))
				{
					System.out.println("---------------------------");
					System.out.println("CUT THE SECOND WIRE");
					System.out.println("---------------------------");
				}
				else if (c == 'w')
				{
					System.out.println("---------------------------");
					System.out.println("CUT THE LAST WIRE");
					System.out.println("---------------------------");
				}
				else if (countColor(tempString,'b') > 1)
				{
					System.out.println("---------------------------");
					System.out.println("CUT THE LAST BLUE WIRE");
					System.out.println("---------------------------");
				}
				else
				{
					System.out.println("---------------------------");
					System.out.println("CUT THE LAST WIRE");
					System.out.println("---------------------------");
				}
			}

			else if (tempString.length() == 4)
			{
				if ((countColor(tempString,'r') > 1) && oddLastDigit())
				{
					System.out.println("---------------------------");
					System.out.println("CUT THE LAST RED WIRE");
					System.out.println("---------------------------");

				}
				else if ((tempString.charAt(3) == 'y') && (countColor(tempString,'r') == 0))
				{
					System.out.println("---------------------------");
					System.out.println("CUT THE FIRST WIRE");
					System.out.println("---------------------------");
				}
				else if (countColor(tempString,'b') == 1)
				{
					System.out.println("---------------------------");
					System.out.println("CUT THE FIRST WIRE");
					System.out.println("---------------------------");
				}
				else if (countColor(tempString,'y') > 1)
				{
					System.out.println("---------------------------");
					System.out.println("CUT THE LAST WIRE");
					System.out.println("---------------------------");
				}
				else
				{
					System.out.println("---------------------------");
					System.out.println("CUT THE SECOND WIRE");
					System.out.println("---------------------------");
				}
			}

			else if (tempString.length() == 5)
			{
				char e = tempString.charAt(4);
				if ((e == 'B') && (oddLastDigit()))
				{
					System.out.println("---------------------------");
					System.out.println("CUT THE FOURTH WIRE");
					System.out.println("---------------------------");
				}
				else if ((countColor(tempString,'r') == 1) && (countColor(tempString,'y') > 1))
				{
					System.out.println("---------------------------");
					System.out.println("CUT THE FIRST WIRE");
					System.out.println("---------------------------");
				}
				else if (countColor(tempString,'B') == 0)
				{
					System.out.println("---------------------------");
					System.out.println("CUT THE SECOND WIRE");
					System.out.println("---------------------------");
				}
				else 
				{
					System.out.println("---------------------------");
					System.out.println("CUT THE FIRST WIRE");
					System.out.println("---------------------------");
				}

			}
			else if (tempString.length() == 6)
			{
				if ((countColor(tempString,'y') == 0) && oddLastDigit())
				{
					System.out.println("---------------------------");
					System.out.println("CUT THE THIRD WIRE");
					System.out.println("---------------------------");
				}
				else if ((countColor(tempString,'y') == 1) && (countColor(tempString,'w') > 1))
				{
					System.out.println("---------------------------");
					System.out.println("CUT THE FOURTH WIRE");
					System.out.println("---------------------------");
				}
				else if (countColor(tempString,'r') == 0)
				{
					System.out.println("---------------------------");
					System.out.println("CUT THE LAST WIRE");
					System.out.println("---------------------------");
				}
				else
				{
					System.out.println("---------------------------");
					System.out.println("CUT THE FOURTH WIRE");
					System.out.println("---------------------------");
				}

			}
			else
			{
				System.out.println("---------------------------");
				System.out.println("ERROR: BAD INPUT");
				System.out.println("---------------------------");
			}

		}

	}
	
	public static int countColor (String inputString, char color)
	{
		int count = 0;
		for (int i = 0; i < inputString.length(); i++)
		{
			char c = inputString.charAt(i);
			if (c == color)
			{
				count++;
			}
		}
		return count;
	}

	public static boolean oddLastDigit()
	{
		System.out.println("ENTER THE LAST DIGIT OF THE BOMB'S SERIAL NUMBER: ");
		int lastDigit = Integer.parseInt(String.valueOf(userInput.next().charAt(0)));

		return ((lastDigit % 2 ) == 0);
	}
	

}
