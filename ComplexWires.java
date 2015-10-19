import java.util.Scanner;

public class ComplexWires {
	
	static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) 
	{
		System.out.println ("FORMAT: Y/N for ALL. NO SPACES.");
		System.out.println("PreReq: Serial End in Even Number, Parallel Port, 2+ Batteries: YYY/NNN/etc");
		String preReqs = userInput.next();
		System.out.println ("Wires: <RED><BLUE><STAR><LED>. NO SEPERATION");
		System.out.println (" Ex: 'YNYY' for Red with both. If no wire, input 'X'");
		System.out.print ("-- First Wire: ");
		String firstWire = userInput.next();
		System.out.print ("-- Second Wire: ");
		String secondWire = userInput.next();
		System.out.print ("-- Third Wire: ");
		String thirdWire = userInput.next();
		System.out.print ("-- Fourth Wire: ");
		String fourthWire = userInput.next();
		System.out.print ("-- Fifth Wire: ");
		String fifthWire = userInput.next();
		System.out.print ("-- Sixth Wire: ");
		String sixthWire = userInput.next();

		
		if (checkCut(firstWire,preReqs))
			System.out.println (" Cut Wire 1");
		if (checkCut(secondWire,preReqs))
			System.out.println (" Cut Wire 2");
		if (checkCut(thirdWire,preReqs))
			System.out.println (" Cut Wire 3");
		if (checkCut(fourthWire,preReqs))
			System.out.println (" Cut Wire 4");
		if (checkCut(fifthWire,preReqs))
			System.out.println (" Cut Wire 5");
		if (checkCut(sixthWire,preReqs))
			System.out.println (" Cut Wire 6");
		
		System.out.println("... if nothing shown, you're fucked.");
		
		System.out.println (firstWire + secondWire + thirdWire);
		System.out.println (fourthWire + fifthWire + sixthWire);
		System.out.println (preReqs + preReqs.charAt(0) + preReqs.charAt(1) + preReqs.charAt(2));
		
	}
	public static boolean checkCut(String inputString, String accessories)
	{
		if (inputString.equals("NNNN") || inputString.equals("YNYN") || inputString.equals("NNYN"))
			return true;
		else if (inputString.equals("YNNN") || inputString.equals("NYNN") || inputString.equals("YYNN") || inputString.equals("YYNY"))
		{
			if ( accessories.charAt(0) == 'Y')
				return true;
		}
		else if (inputString.equals("YYYN") || inputString.equals("NYNY") || inputString.equals("NYYY"))
		{	
			if (accessories.charAt(1) == 'Y')
				return true;
		}
		else if (inputString.equals("YNNY") || inputString.equals("YNYY") || inputString.equals("NNYY"))
		{
			if (accessories.charAt(2) == 'Y')
				return true;
		}
		return false;
	}

}
