/*	DayOutOfBoundsException Class

	Description: Handles exception from date of birth
	if day is greater than the current day of the current
	month and year

	Authors: Ricky Chon
*/

class DayOutOfBoundsException extends Exception
{
	DayOutOfBoundsException()
	{

	}

	DayOutOfBoundsException(String s)
	{
		super(s);
	}
}
