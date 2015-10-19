import java.util.Scanner;

public class Memory
{

	static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args)
	{

		int num1,num2,num3,num4, num5,
			pos1,pos2,pos3,pos4,
			lab1,lab2,lab3,lab4;

			num1 = num2 = num3 = num4 = num5
			= pos1 = pos2 = pos3 = pos4
			= lab1 = lab2 = lab3 = lab4 = 0;

		System.out.println("---------------------------------");
		System.out.println("             STAGE 1");
		System.out.println("---------------------------------");

		System.out.println("What number is on the display?");
		System.out.print("-- Number: ");

		num1 = Integer.parseInt(String.valueOf(userInput.next().charAt(0)));

		switch(num1)
		{
			case 1:
				System.out.println("PRESS THE BUTTON AT POSITION 2.");
				System.out.println("What is that button's label?");
				System.out.print("-- Number: ");
				lab1 = Integer.parseInt(String.valueOf(userInput.next().charAt(0)));
				pos1 = 2;
				break;
			case 2:
				System.out.println("PRESS THE BUTTON AT POSITION 2.");
				System.out.println("What is that button's label?");
				System.out.print("-- Number: ");
				lab1 = Integer.parseInt(String.valueOf(userInput.next().charAt(0)));
				pos1 = 2;
				break;
			case 3:
				System.out.println("PRESS THE BUTTON AT POSITION 3.");
				System.out.println("What is that button's label?");
				System.out.print("-- Number: ");
				lab1 = Integer.parseInt(String.valueOf(userInput.next().charAt(0)));
				pos1 = 3;
				break;
			case 4: 
				System.out.println("PRESS THE BUTTON AT POSITION 4.");
				System.out.println("What is that button's label?");
				System.out.print("-- Number: ");
				lab1 = Integer.parseInt(String.valueOf(userInput.next().charAt(0)));
				pos1 = 4;
				break;
			default:
				System.out.println("WRONG INPUT!");
		}
		
		System.out.println("---------------------------------");
		System.out.println("             STAGE 2");
		System.out.println("---------------------------------");

		System.out.println("What number is on the display?");
		System.out.print("-- Number: ");

		num2 = Integer.parseInt(String.valueOf(userInput.next().charAt(0)));

		switch(num2)
		{
			case 1:
				System.out.println("PRESS THE BUTTON LABELED 4.");
				System.out.println("What is that button's position?");
				System.out.print("-- Number: ");
				pos2 = Integer.parseInt(String.valueOf(userInput.next().charAt(0)));
				lab2 = 4;
				break;
			case 2:
				System.out.println("PRESS THE BUTTON AT POSITION " + Integer.toString(pos1) + ".");
				System.out.println("What is that button's label?");
				System.out.print("-- Number: ");
				lab2 = Integer.parseInt(String.valueOf(userInput.next().charAt(0)));
				pos2 = pos1;
				break;
			case 3:
				System.out.println("PRESS THE BUTTON AT POSITION 1.");
				System.out.println("What is that button's label?");
				System.out.print("-- Number: ");
				lab2 = Integer.parseInt(String.valueOf(userInput.next().charAt(0)));
				pos2 = 1;
				break;
			case 4: 
				System.out.println("PRESS THE BUTTON AT POSITION " + Integer.toString(pos1) + ".");
				System.out.println("What is that button's label?");
				System.out.print("-- Number: ");
				lab2 = Integer.parseInt(String.valueOf(userInput.next().charAt(0)));
				pos2 = pos1;
				break;
			default:
				System.out.println("WRONG INPUT!");
		}

		System.out.println("---------------------------------");
		System.out.println("             STAGE 3");
		System.out.println("---------------------------------");

		System.out.println("What number is on the display?");
		System.out.print("-- Number: ");
		num3 = Integer.parseInt(String.valueOf(userInput.next().charAt(0)));

		switch(num3)
		{
			case 1:
				System.out.println("PRESS THE BUTTON LABELED " + Integer.toString(lab2) + ".");
				System.out.println("What is that button's position?");
				System.out.print("-- Number: ");
				pos3 = Integer.parseInt(String.valueOf(userInput.next().charAt(0)));
				lab3 = lab2;
				break;
			case 2:
				System.out.println("PRESS THE BUTTON LABELED " + Integer.toString(lab1) + ".");
				System.out.println("What is that button's position?");
				System.out.print("-- Number: ");
				pos3 = Integer.parseInt(String.valueOf(userInput.next().charAt(0)));
				lab3 = lab2;
				break;
			case 3:
				System.out.println("PRESS THE BUTTON AT POSITION 3.");
				System.out.println("What is that button's label?");
				System.out.print("-- Number: ");
				lab3 = Integer.parseInt(String.valueOf(userInput.next().charAt(0)));
				pos3 = 3;
				break;
			case 4: 
				System.out.println("PRESS THE BUTTON LABELED 4");
				System.out.println("What is that button's position?");
				System.out.print("-- Number: ");
				pos3 = Integer.parseInt(String.valueOf(userInput.next().charAt(0)));
				lab3 = 4;
				break;
			default:
				System.out.println("WRONG INPUT!");
		}

		System.out.println("---------------------------------");
		System.out.println("             STAGE 4");
		System.out.println("---------------------------------");

		System.out.println("What number is on the display?");
		System.out.print("-- Number: ");
		num4 = Integer.parseInt(String.valueOf(userInput.next().charAt(0)));

		switch(num4)
		{
			case 1:
				System.out.println("PRESS THE BUTTON AT POSITION " + Integer.toString(pos1) + ".");
				System.out.println("What is that button's label?");
				System.out.print("-- Number: ");
				lab4 = Integer.parseInt(String.valueOf(userInput.next().charAt(0)));
				pos4 = pos1;
				break;
			case 2:
				System.out.println("PRESS THE BUTTON AT POSITION 1");
				System.out.println("What is that button's label?");
				System.out.print("-- Number: ");
				lab4 = Integer.parseInt(String.valueOf(userInput.next().charAt(0)));
				pos4 = 1;
				break;
			case 3:
				System.out.println("PRESS THE BUTTON AT POSITION " + Integer.toString(pos2) + ".");
				System.out.println("What is that button's label?");
				System.out.print("-- Number: ");
				lab4 = Integer.parseInt(String.valueOf(userInput.next().charAt(0)));
				pos4 = pos2;
				break;
			case 4: 
				System.out.println("PRESS THE BUTTON AT POSITION " + Integer.toString(pos2) + ".");
				System.out.println("What is that button's label?");
				System.out.print("-- Number: ");
				lab4 = Integer.parseInt(String.valueOf(userInput.next().charAt(0)));
				pos4 = pos2;
				break;
			default:
				System.out.println("WRONG INPUT!");
		}

		System.out.println("---------------------------------");
		System.out.println("             STAGE 5");
		System.out.println("---------------------------------");

		System.out.println("What number is on the display?");
		System.out.print("-- Number: ");
		num5 = Integer.parseInt(String.valueOf(userInput.next().charAt(0)));

		switch(num5)
		{
			case 1:
				System.out.println("PRESS THE BUTTON LABELED " + Integer.toString(lab1) + ".");
				break;
			case 2:
				System.out.println("PRESS THE BUTTON LABELED " + Integer.toString(lab2) + ".");
				break;
			case 3:
				System.out.println("PRESS THE BUTTON LABELED " + Integer.toString(lab4) + ".");
				break;
			case 4: 
				System.out.println("PRESS THE BUTTON LABELED " + Integer.toString(lab3) + ".");
				break;
			default:
				System.out.println("WRONG INPUT!");
		}
	}
}