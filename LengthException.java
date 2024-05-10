
/**
 * CMSC 204
 * Instructor: Khandan Vahabzadeh Monshi
 * LengthException class
 * @author Faith Fru Nchang
 */
public class LengthException extends Exception{
	
	// Constructor to generate an error message
	public LengthException()
	{
		super("The password must be at least 6 characters long");
	}
	
	public LengthException(String message)
	{
		super(message);
	}

}
