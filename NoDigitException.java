
/**
 * CMSC 204
 * Instructor: Khandan Vahabzadeh Monshi
 * NoDigitException class
 * @author Faith Fru Nchang
 */

public class NoDigitException extends Exception {
	
	public NoDigitException()
	{
		super("The password must contain at least one digit");
	}
	
	public NoDigitException(String message)
	{
		super(message);
	} 
}
