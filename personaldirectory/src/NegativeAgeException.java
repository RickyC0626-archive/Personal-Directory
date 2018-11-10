/*	NegativeAgeException Class

	Description: Deals with exceptions
	that are caused by negative age values

	Authors: Ricky Chon

*/

class NegativeAgeException extends Exception
{
	NegativeAgeException()
	{

	}

	NegativeAgeException(String s)
	{
		super(s);
	}
}
