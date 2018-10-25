/*	IllegalInputException Class

	Description: Handles exceptions that include
	unwanted or illegal inputs from the user

	Authors: Ricky Chon
*/

class IllegalInputException extends Exception
{
	IllegalInputException()
	{

	}

	IllegalInputException(String s)
	{
		super(s);
	}
}
