/* 	TextFormat Class

	Desception: Fancy text formats for aesthetics

	Authors: Ricky Chon
*/

public class TextFormat
{
	private final String textReset = "\033[0m";
	private final String blackText = "\033[30m";
	private final String redText = "\033[31m";
	private final String greenText = "\033[32m";
	private final String yellowText = "\033[33m";
	private final String blueText = "\033[34m";
	private final String magentaText = "\033[35m";
	private final String cyanText = "\033[36m";
	private final String whiteText = "\033[37m";

	public String toBlackText(String text)
	{
		return blackText + text + textReset;
	}

	public String toRedText(String text)
	{
		return redText + text + textReset;
	}

	public String toGreenText(String text)
	{
		return greenText + text + textReset;
	}

	public String toYellowText(String text)
	{
		return yellowText + text + textReset;
	}

	public String toBlueText(String text)
	{
		return blueText + text + textReset;
	}

	public String toMagentaText(String text)
	{
		return magentaText + text + textReset;
	}

	public String toCyanText(String text)
	{
		return cyanText + text + textReset;
	}

	public String toWhiteText(String text)
	{
		return whiteText + text + textReset;
	}

	public void loading() throws InterruptedException
	{
		String loadText = toGreenText("\nLoading.....");

		for(char c : loadText.toCharArray())
		{
			Thread.sleep(60);
			System.out.print(c);
		}
		clearScreen();
	}

	public void clearScreen()
	{
		// \033[H moves cursor to top left corner of the screen
		// \033[2J clears the screen
    	System.out.print("\033[H\033[2J");
    	System.out.flush();
	}

	//Methods for user interface
	public void wrongSelection() throws InterruptedException
	{
		System.out.println(toRedText("\nYou must enter a valid selection. Try again.\n"));
		Thread.sleep(500);
		clearScreen();
	}
}
