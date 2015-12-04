import java.util.Scanner;

public class WhosOnFirst {
	
	static Scanner userInput = new Scanner(System.in);


	public static void main(String[] args) 
	{
		int stage = 0;
		String buttonLabel = ""; 
		String display = "";


		while (stage <= 5)
		{
			// make sure we've got valid input
			Boolean valid = false;
			while (!valid)
			{
				System.out.println("Which word is showing on the display?");
				System.out.println("(If there is no word on the display, just hit ENTER.)");
				System.out.print("-- Word: ");
				display = userInput.nextLine().toLowerCase();

				if (display.equals("quit"))
				{
					break;
				}

				switch(display)
				{
					case "ur":
						System.out.println("Enter the word on the UPPER LEFT button.");
						valid = true;
						break;
					case "first":
					case "okay":
					case "c":
						System.out.println("Enter the word on the UPPER RIGHT button.");
						valid = true;
						break;
					case "yes":
					case "nothing":
					case "led":
					case "they are":
						System.out.println("Enter the word on the MIDDLE LEFT button.");
						valid = true;
						break;
					case "blank":
					case "read":
					case "red":
					case "you":
					case "your":
					case "you're":
					case "their":
						System.out.println("Enter the word on the MIDDLE RIGHT button.");
						valid = true;
						break;
					case "":
					case "reed":
					case "leed":
					case "they're":
						System.out.println("Enter the word on the BOTTOM LEFT button.");
						valid = true;
						break;
					case "display":
					case "says":
					case "no":
					case "lead":
					case "hold on":
					case "you are":
					case "there":
					case "see":
					case "cee":
						System.out.println("Enter the word on the BOTTOM RIGHT button.");
						valid = true;
						break;
					default:
						System.out.println("-----------------------");
						System.out.println("BAD INPUT. Looping...");
						System.out.println("-----------------------");
						break;

				}
			}
			


			System.out.print("-- Word: ");
			buttonLabel = userInput.nextLine().toLowerCase();

			System.out.print("You entered ");
			System.out.println(buttonLabel);
			String[] wordArray; 

			if (buttonLabel.equals("ready"))
			{
				wordArray = new String[]{"YES","OKAY","WHAT","MIDDLE","LEFT","PRESS","RIGHT","BLANK","READY","NO","FIRST","UHHH","NOTHING","WAIT"};
			}
			else if (buttonLabel.equals("first"))
			{
				wordArray = new String[]{"LEFT", "OKAY", "YES", "MIDDLE", "NO", "RIGHT", "NOTHING", "UHHH", "WAIT", "READY", "BLANK", "WHAT", "PRESS", "FIRST"};
			}
			else if (buttonLabel.equals("no"))
			{
				wordArray = new String[]{"BLANK", "UHHH", "WAIT", "FIRST", "WHAT", "READY", "RIGHT", "YES", "NOTHING", "LEFT", "PRESS", "OKAY", "NO", "MIDDLE"};
			}
			else if (buttonLabel.equals("blank"))
			{
				wordArray = new String[]{"WAIT", "RIGHT", "OKAY", "MIDDLE", "BLANK", "PRESS", "READY", "NOTHING", "NO", "WHAT", "LEFT", "UHHH", "YES", "FIRST"};
			}
			else if (buttonLabel.equals("nothing"))
			{
				wordArray = new String[]{"UHHH", "RIGHT", "OKAY", "MIDDLE", "YES", "BLANK", "NO", "PRESS", "LEFT", "WHAT", "WAIT", "FIRST", "NOTHING", "READY"};
			}
			else if (buttonLabel.equals("yes"))
			{
				wordArray = new String[]{"OKAY", "RIGHT", "UHHH", "MIDDLE", "FIRST", "WHAT", "PRESS", "READY", "NOTHING", "YES", "LEFT", "BLANK", "NO", "WAIT"};
			}
			else if (buttonLabel.equals("what"))
			{
				wordArray = new String[]{"UHHH", "WHAT", "LEFT", "NOTHING", "READY", "BLANK", "MIDDLE", "NO", "OKAY", "FIRST", "WAIT", "YES", "PRESS", "RIGHT"};
			}
			else if (buttonLabel.equals("uhhh"))
			{
				wordArray = new String[]{"READY", "NOTHING", "LEFT", "WHAT", "OKAY", "YES", "RIGHT", "NO", "PRESS", "BLANK", "UHHH", "MIDDLE", "WAIT", "FIRST"};
			}
			else if (buttonLabel.equals("left"))
			{
				wordArray = new String[]{"RIGHT", "LEFT", "FIRST", "NO", "MIDDLE", "YES", "BLANK", "WHAT", "UHHH", "WAIT", "PRESS", "READY", "OKAY", "NOTHING"};
			}
			else if (buttonLabel.equals("right"))
			{
				wordArray = new String[]{"YES", "NOTHING", "READY", "PRESS", "NO", "WAIT", "WHAT", "RIGHT", "MIDDLE", "LEFT", "UHHH", "BLANK", "OKAY", "FIRST"};
			}
			else if (buttonLabel.equals("middle"))
			{
				wordArray = new String[]{"BLANK", "READY", "OKAY", "WHAT", "NOTHING", "PRESS", "NO", "WAIT", "LEFT", "MIDDLE", "RIGHT", "FIRST", "UHHH", "YES"};
			}
			else if (buttonLabel.equals("okay"))
			{
				wordArray = new String[]{"MIDDLE", "NO", "FIRST", "YES", "UHHH", "NOTHING", "WAIT", "OKAY", "LEFT", "READY", "BLANK", "PRESS", "WHAT", "RIGHT"};
			}
			else if (buttonLabel.equals("wait"))
			{
				wordArray = new String[]{"UHHH", "NO", "BLANK", "OKAY", "YES", "LEFT", "FIRST", "PRESS", "WHAT", "WAIT", "NOTHING", "READY", "RIGHT", "MIDDLE"};
			}
			else if (buttonLabel.equals("press"))
			{
				wordArray = new String[]{"RIGHT", "MIDDLE", "YES", "READY", "PRESS", "OKAY", "NOTHING", "UHHH", "BLANK", "LEFT", "FIRST", "WHAT", "NO", "WAIT"};
			}
			else if (buttonLabel.equals("you"))
			{
				wordArray = new String[]{"SURE", "YOU ARE", "YOUR", "YOU'RE", "NEXT", "UH HUH", "UR", "HOLD", "WHAT?", "YOU", "UH UH", "LIKE", "DONE", "U"};
			}
			else if (buttonLabel.equals("you are"))
			{
				wordArray = new String[]{"YOUR", "NEXT", "LIKE", "UH HUH", "WHAT?", "DONE", "UH UH", "HOLD", "YOU", "U", "YOU'RE", "SURE", "UR", "YOU ARE"};
			}
			else if (buttonLabel.equals("your"))
			{
				wordArray = new String[]{"UH UH", "YOU ARE", "UH HUH", "YOUR", "NEXT", "UR", "SURE", "U", "YOU'RE", "YOU", "WHAT?", "HOLD", "LIKE", "DONE"};
			}
			else if (buttonLabel.equals("you're"))
			{
				wordArray = new String[]{"YOU", "YOU'RE", "UR", "NEXT", "UH UH", "YOU ARE", "U", "YOUR", "WHAT?", "UH HUH", "SURE", "DONE", "LIKE", "HOLD"};
			}
			else if (buttonLabel.equals("ur"))
			{
				wordArray = new String[]{"DONE", "U", "UR", "UH HUH", "WHAT?", "SURE", "YOUR", "HOLD", "YOU'RE", "LIKE", "NEXT", "UH UH", "YOU ARE", "YOU"};
			}
			else if (buttonLabel.equals("u"))
			{
				wordArray = new String[]{"UH HUH", "SURE", "NEXT", "WHAT?", "YOU'RE", "UR", "UH UH", "DONE", "U", "YOU", "LIKE", "HOLD", "YOU ARE", "YOUR"};
			}
			else if (buttonLabel.equals("uh huh"))
			{
				wordArray = new String[]{"UH HUH", "YOUR", "YOU ARE", "YOU", "DONE", "HOLD", "UH UH", "NEXT", "SURE", "LIKE", "YOU'RE", "UR", "U", "WHAT?"};
			}
			else if (buttonLabel.equals("uh uh"))
			{
				wordArray = new String[]{"UR", "U", "YOU ARE", "YOU'RE", "NEXT", "UH UH", "DONE", "YOU", "UH HUH", "LIKE", "YOUR", "SURE", "HOLD", "WHAT?"};
			}
			else if (buttonLabel.equals("what?"))
			{
				wordArray = new String[]{"YOU", "HOLD", "YOU'RE", "YOUR", "U", "DONE", "UH UH", "LIKE", "YOU ARE", "UH HUH", "UR", "NEXT", "WHAT?", "SURE"};
			}
			else if (buttonLabel.equals("done"))
			{
				wordArray = new String[]{"SURE", "UH HUH", "NEXT", "WHAT?", "YOUR", "UR", "YOU'RE", "HOLD", "LIKE", "YOU", "U", "YOU ARE", "UH UH", "DONE"};
			}
			else if (buttonLabel.equals("next"))
			{
				wordArray = new String[]{"WHAT?", "UH HUH", "UH UH", "YOUR", "HOLD", "SURE", "NEXT", "LIKE", "DONE", "YOU ARE", "UR", "YOU'RE", "U", "YOU"};
			}
			else if (buttonLabel.equals("hold"))
			{
				wordArray = new String[]{"YOU ARE", "U", "DONE", "UH UH", "YOU", "UR", "SURE", "WHAT?", "YOU'RE", "NEXT", "HOLD", "UH HUH", "YOUR", "LIKE"};
			}
			else if (buttonLabel.equals("sure"))
			{
				wordArray = new String[]{"YOU ARE", "DONE", "LIKE", "YOU'RE", "YOU", "HOLD", "UH HUH", "UR", "SURE", "U", "WHAT?", "NEXT", "YOUR", "UH UH"};
			}
			else if (buttonLabel.equals("like"))
			{
				wordArray = new String[]{"YOU'RE", "NEXT", "U", "UR", "HOLD", "DONE", "UH UH", "WHAT?", "UH HUH", "YOU", "LIKE", "SURE", "YOU ARE", "YOUR"};
			}
			else
			{
				System.out.println("BAD INPUT");
				break;
			}

			System.out.println("-----------------------");
			System.out.println("Words will be listed below. Press ENTER to advance,");
			System.out.println("press ! when one of the words appears on one of the buttons on the panel.");
			System.out.println("-----------------------");

			int i = 0;

			String inputString = "";

			while ((inputString != "!\n") && (i < wordArray.length))
			{
				System.out.println(wordArray[i++]);
				inputString = userInput.nextLine();

			}

			if (i == wordArray.length)
			{
				System.out.println("Did it seriously wait until the last one? That's evil. Or you fucked up.");
				System.out.println("Advancing anyway...");
			}

			stage++;


		}
	}
}