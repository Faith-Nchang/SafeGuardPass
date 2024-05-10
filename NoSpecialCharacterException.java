
/**
 * CMSC 204
 * Instructor: Khandan Vahabzadeh Monshi
 * NoSpecialCharacterException class
 * @author Faith Fru Nchang
 */

public class NoSpecialCharacterException extends Exception {
	
	public NoSpecialCharacterException()
	{
		super("The password must contain at least one special character");
	}
	
	public NoSpecialCharacterException(String message)
	{
		super(message);
	}
}
