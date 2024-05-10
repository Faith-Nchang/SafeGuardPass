
/**
 * CMSC 204
 * Instructor: Khandan Vahabzadeh Monshi
 * WeakPasswordException class
 * @author Faith Fru Nchang
 */

public class WeakPasswordException extends Exception {
	
	public WeakPasswordException()
	{
		super("The password is OK but weak - it contains fewer than 10 characters.");
	}
	
	public WeakPasswordException(String message)
	{
		super(message);
	}
}
