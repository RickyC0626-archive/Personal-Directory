/*	MonthOutOfBoundsException class

	Description: Handles the exception from date of birth
	if month is greater than the current month

	Authors: Ricky Chon
*/

class MonthOutOfBoundsException extends Exception
{
	MonthOutOfBoundsException()
	{

	}

	MonthOutOfBoundsException(String s)
	{
		super(s);
	}
}
