/*	InputMismatchException class

	Description: Overrides the original class
	and outputs a custom message

	Authors: Ricky Chon
*/

class InputMismatchException extends Exception
{
	InputMismatchException()
	{

	}

	InputMismatchException(String s)
	{
		super(s);
	}
}
