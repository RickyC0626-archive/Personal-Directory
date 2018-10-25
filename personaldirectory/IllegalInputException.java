/* 	IllegalInputException Class

	Description: Deals with exceptions
	caused by unwanted or illegal user inputs.
	Similar to the InputMismatchException class

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
