
/**
 * CMSC 204
 * Instructor: Khandan Vahabzadeh Monshi
 * NoLowerAlphaException class
 * @author Faith Fru Nchang
 */

public class NoLowerAlphaException extends Exception {

	public NoLowerAlphaException()
	{
		super("The password must contain at least one lowercase alphabetic character");
	}
	
	public NoLowerAlphaException(String message)
	{
		super(message);
	}
}
