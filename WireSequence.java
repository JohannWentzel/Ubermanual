import java.util.Scanner;

public class WireSequence {
	static Scanner userInput = new Scanner(System.in);
	final 

	public static void main(String[] args) 
	{
		String tempWire;
		
		int redCounter = 0;
		int blueCounter = 0;
		int blackCounter = 0;
		
		System.out.println("FORMAT: <COLOUR><CONNECTION> (R,B,N)(ABC)"); // N for Black?
		System.out.println("Give one wire at a time. Enter 'QUIT' to exit");
		while (true)
		{
		System.out.print (" -- Wire: ");
		tempWire = userInput.next();
		
		if (tempWire.equals("QUIT"))
			break;
		
		if (tempWire.charAt(0) == 'R')
		{
			redWire(tempWire.charAt(1), redCounter);
			redCounter++;
		}
		if (tempWire.charAt(0) == 'B')
		{
			blueWire(tempWire.charAt(1), blueCounter);
			blueCounter++;
		}if (tempWire.charAt(0) == 'N')
		{
			blackWire(tempWire.charAt(1), blackCounter);
			blackCounter++;
		}
		}
	}
	
	public static void redWire(char connectedTo, int counter)
	{
		if (counter == 0 && (connectedTo == 'C'))
			System.out.println("CUT");	
		else if (counter == 1 && (connectedTo == 'B'))
			System.out.println("CUT");	
		else if (counter == 2 && (connectedTo == 'A'))
			System.out.println("CUT");	
		else if (counter == 3 && (connectedTo == 'A' || connectedTo == 'C'))
			System.out.println("CUT");	
		else if (counter == 4 && (connectedTo == 'B'))
			System.out.println("CUT");	
		else if (counter == 5 && (connectedTo == 'A' || connectedTo == 'C'))
			System.out.println("CUT");	
		else if (counter == 6)
			System.out.println("CUT");	
		else if (counter == 7 && (connectedTo != 'C'))
			System.out.println("CUT");	
		else if (counter == 8 && (connectedTo == 'B'))
			System.out.println("CUT");	
		else 
			System.out.println("LEAVE");
	}
	public static void blueWire(char connectedTo, int counter)
	{
		if (counter == 0 && (connectedTo == 'B'))
			System.out.println("CUT");	
		else if (counter == 1 && (connectedTo != 'C'))
			System.out.println("CUT");	
		else if (counter == 2 && (connectedTo == 'B'))
			System.out.println("CUT");	
		else if (counter == 3 && (connectedTo == 'A'))
			System.out.println("CUT");	
		else if (counter == 4 && (connectedTo == 'B'))
			System.out.println("CUT");	
		else if (counter == 5 && (connectedTo != 'A'))
			System.out.println("CUT");	
		else if (counter == 6 && (connectedTo == 'C'))
			System.out.println("CUT");	
		else if (counter == 7 && (connectedTo != 'B'))
			System.out.println("CUT");	
		else if (counter == 8 && (connectedTo == 'A'))
			System.out.println("CUT");	
		else 
			System.out.println("LEAVE");
	}
	public static void blackWire(char connectedTo, int counter)
	{
		if (counter == 0)
			System.out.println("CUT");	
		else if (counter == 1 && (connectedTo != 'B'))
			System.out.println("CUT");	
		else if (counter == 2 && (connectedTo == 'B'))
			System.out.println("CUT");	
		else if (counter == 3 && (connectedTo != 'B'))
			System.out.println("CUT");	
		else if (counter == 4 && (connectedTo == 'B'))
			System.out.println("CUT");	
		else if (counter == 5 && (connectedTo != 'A'))
			System.out.println("CUT");	
		else if (counter == 6 && (connectedTo != 'C'))
			System.out.println("CUT");	
		else if (counter == 7 && (connectedTo == 'C'))
			System.out.println("CUT");	
		else if (counter == 8 && (connectedTo == 'C'))
			System.out.println("CUT");	
		else 
			System.out.println("LEAVE");
	}
	

}
