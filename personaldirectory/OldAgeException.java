/*	OldAgeException Class

	Description: Deals with exceptions
	that are caused by ages over 122, the
	oldest age ever recorded

	Authors: Ricky Chon
*/

class OldAgeException extends Exception
{
	OldAgeException()
	{

	}

	OldAgeException(String s)
	{
		super(s);
	}
}
