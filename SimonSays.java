import java.util.Scanner;

public class SimonSays {
	
	static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) 
	{
		int strikes = -1;
		boolean hasVowel = false;

		System.out.println("How many strikes do you have?");
		System.out.print("-- Strikes: ");
		strikes = Integer.parseInt(String.valueOf(userInput.next().charAt(0)));

		System.out.println("Does the serial number contain a vowel?");
		System.out.print("-- y/n: ");
		hasVowel = (userInput.next().toLowerCase().charAt(0) == 'y');

		if (hasVowel)
		{
			if (strikes == 0)
			{
				System.out.println("Yes vowel, 0 strikes");
				ssLoop("|  BLUE  |   RED   |  YELLOW  |  GREEN   |","bryg");
			}
			else if (strikes == 1)
			{
				System.out.println("Yes vowel, 1 strike");
				ssLoop("| YELLOW  |  GREEN  |  BLUE  |  RED   |","ygbr");
			}
			else if (strikes == 2)
			{
				System.out.println("Yes vowel, 2 strikes");
				ssLoop("|  GREEN  |   RED   |  YELLOW  |  BLUE   |","gryb");
			}
		}
		else
		{
			if (strikes == 0)
			{
				System.out.println("No vowel, 0 strikes");
				ssLoop("| BLUE  |  YELLOW  |  GREEN  |  RED   |","bygr");
			}
			else if (strikes == 1)
			{
				System.out.println("No vowel, 1 strike");
				
				ssLoop("|   RED   |   BLUE   |  YELLOW  |  GREEN   |","rbyg");


			}
			else if (strikes == 2)
			{
				System.out.println("No vowel, 2 strikes");
				ssLoop("| YELLOW | GREEN  |  BLUE  |  RED   |","ygbr");

			}
		}


	}

	// Takes in 4 character strings - non-translated is rbyg (red blue green yellow).
	static void ssLoop(String translation, String abbrev)
	{


		String standard = "rbgy";
		String input = "";
		String output = "";
		String verboseOutput = "";
		char translatedChar = 'x';

		System.out.println("--------------------------------------------");
		System.out.println("|   RED   |   BLUE   |  GREEN  |  YELLOW   |");
		System.out.println("--------------------------------------------");
		System.out.println("              Translates to:                ");
		System.out.println("--------------------------------------------");
		System.out.println(translation);

		System.out.println("--------------------------------------------");

		while (true)
		{
			output = "";
			verboseOutput = "";
			System.out.println("Enter the first letters of the flashing color sequence.");
			System.out.println("Example: red,blue,green --> rbg");
			System.out.println("To quit, enter 'quit'.");
			System.out.print("-- Colors: ");
			input = userInput.next().toLowerCase();
			if (input.equals("quit"))
			{
				break;
			}

			for (int i = 0; i < input.length(); i++)
			{
				translatedChar = abbrev.charAt(standard.indexOf(input.charAt(i)));
				//output = output + translatedChar;
				if (translatedChar == 'r')
				{
					verboseOutput = verboseOutput + "RED ";
				}
				else if (translatedChar == 'b')
				{
					verboseOutput = verboseOutput + "BLUE ";
				}
				else if (translatedChar == 'g')
				{
					verboseOutput = verboseOutput + "GREEN ";
				}
				else if (translatedChar == 'y')
				{
					verboseOutput = verboseOutput + "YELLOW ";
				}
			}
			System.out.println("--------------------------------------------");
			System.out.println("            PRESS IN THIS ORDER:            ");
			System.out.println(verboseOutput);
			System.out.println("--------------------------------------------");

		}

	}

}
