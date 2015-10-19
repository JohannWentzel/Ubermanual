import java.util.Scanner;
import java.lang.Character;

public class Button {
	
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		
		String color;
		String buttonText;
		int numBatteries;


		System.out.println("Enter button color. ");
		System.out.print("-- Color: ");
		color = userInput.next().toLowerCase();

		System.out.println("Enter the text on the button. ");
		System.out.print("-- Text: ");
		buttonText = userInput.next().toLowerCase();

		numBatteries = promptBatteries();
	


		if ((color.equals("blue")) && (buttonText.equals("abort")))
		{
			holdButton();
		}
		else if ((numBatteries > 1) && (buttonText.equals("detonate")))
		{
			System.out.println("----------------------------------------------");
			System.out.println("PRESS BUTTON AND IMMEDIATELY RELEASE");
			System.out.println("----------------------------------------------");
		}
		else if ((color.equals("white")) && promptCAR())
		{
			holdButton();
		}
		else if ((numBatteries > 2) && promptFRK())
		{
			System.out.println("----------------------------------------------");
			System.out.println("PRESS BUTTON AND IMMEDIATELY RELEASE");
			System.out.println("----------------------------------------------");
		}
		else if (color.equals("yellow"))
		{
			holdButton();
		}
		else if ((color.equals("red")) && buttonText.equals("hold"))
		{
			System.out.println("----------------------------------------------");
			System.out.println("PRESS BUTTON AND IMMEDIATELY RELEASE");
			System.out.println("----------------------------------------------");
		}
		else
		{
			holdButton();
		}


	}

	static void holdButton()
	{
		System.out.println("Hold the button. What color is the light strip?");
		System.out.print("-- Color: ");
		String color = userInput.next().toLowerCase();
		if (color.equals("blue"))
		{
			System.out.println("----------------------------------------------");
			System.out.println("RELEASE WHEN THE TIMER HAS A 4 IN ANY POSITION");
			System.out.println("----------------------------------------------");
		}
		else if (color.equals("white"))
		{
			System.out.println("----------------------------------------------");
			System.out.println("RELEASE WHEN THE TIMER HAS A 1 IN ANY POSITION");
			System.out.println("----------------------------------------------");
		}
		else if (color.equals("yellow"))
		{
			System.out.println("----------------------------------------------");
			System.out.println("RELEASE WHEN THE TIMER HAS A 5 IN ANY POSITION");
			System.out.println("----------------------------------------------");
		}
		else
		{
			System.out.println("----------------------------------------------");
			System.out.println("RELEASE WHEN THE TIMER HAS A 1 IN ANY POSITION");
			System.out.println("----------------------------------------------");
		
		}

	}

	static boolean promptFRK()
	{
		System.out.println("Lit indicator with label FRK? ");
		System.out.print("-- y/n: ");
		return (userInput.next().toLowerCase().equals("y"));
	}

	static int promptBatteries()
	{
		System.out.println("How many batteries on the bomb?");
		System.out.print("-- Batteries: ");
		return Integer.parseInt(String.valueOf(userInput.next().charAt(0)));
	}
		static boolean promptCAR()
	{
		System.out.println("Lit indicator with label CAR? ");
		System.out.print("-- y/n: ");
		return (userInput.next().toLowerCase().equals("y"));
	}

}
