import java.util.Scanner;

public class Password {
	
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		
		String tempString;
		
		while(true)
		{

		System.out.println ("Input letters for each character without seperation. To quit enter 'QUIT'");
		System.out.print ("-- First Characters: ");
		tempString = userInput.next();
		if (tempString.equals("QUIT"))
			break;
		char[] firstRow = tempString.toCharArray();
		System.out.print("--Second Row: ");
		tempString = userInput.next();
		char[] secondRow = tempString.toCharArray();
		System.out.print("--Third Row: ");
		tempString = userInput.next();
		char[] thirdRow = tempString.toCharArray();
		System.out.print("--Fourth Row: ");
		tempString = userInput.next();
		char[] fourthRow = tempString.toCharArray();
		System.out.print("--Fifth Row: ");
		tempString = userInput.next();
		char[] fifthRow = tempString.toCharArray();
		
		boolean found = false;
			
		for (int i = 0; i < firstRow.length; i++)
		{
			for (int j = 0; j < secondRow.length; j++)
			{
				for (int k = 0; k < thirdRow.length; k++)
				{
					for (int l = 0; l < fourthRow.length; l++)
					{
						for (int m = 0; m < fifthRow.length; m++)
						{
							
							tempString = "" + firstRow[i] + secondRow[j] + thirdRow[k] + fourthRow[l] + fifthRow[m];
							if (isWord(tempString))
							{
								System.out.println("WORD IS: " + tempString);
								found = true;
							}
						}
					}
				}
			}
		}
		if (found == false)
			System.out.println("NOTHING FOUND. JASON.");
		
		System.out.println("\n");
		}

	}
	
	public static boolean isWord(String inputString)
	{
		//about after again below could
		//every first found great house
		//large learn never other place
		//plant point right small sound
		//spell still study their there
		//these thing think three water
		//where which world would write
		
		if (inputString.equals("about") || inputString.equals("after") || inputString.equals("again") || inputString.equals("below") || inputString.equals("could"))
				return true;
		if (inputString.equals("every") || inputString.equals("first") || inputString.equals("found") || inputString.equals("great") || inputString.equals("house"))
			return true;
		if (inputString.equals("large") || inputString.equals("learn") || inputString.equals("never") || inputString.equals("other") || inputString.equals("place"))
			return true;
		if (inputString.equals("plant") || inputString.equals("point") || inputString.equals("right") || inputString.equals("small") || inputString.equals("sound"))
			return true;
		if (inputString.equals("spell") || inputString.equals("still") || inputString.equals("study") || inputString.equals("their") || inputString.equals("there"))
			return true;
		if (inputString.equals("these") || inputString.equals("thing") || inputString.equals("think") || inputString.equals("three") || inputString.equals("water"))
			return true;
		if (inputString.equals("where") || inputString.equals("which") || inputString.equals("world") || inputString.equals("would") || inputString.equals("write"))
			return true;
				
		return false;
	}
	

}
