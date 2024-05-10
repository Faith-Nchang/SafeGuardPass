
/*
 * CMSC 204
 * Instructor: Khandan Vahabzadeh Monshi
 * UnmatchedException class
 * @author Faith Fru Nchang
 */

public class UnmatchedException extends Exception {

	public UnmatchedException()
	{
		super("The passwords do not match");
	}
	
	public UnmatchedException(String message)
	{
		super(message);
	}
}
