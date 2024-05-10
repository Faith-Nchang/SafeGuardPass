/**
 * CMSC 204
 * Instructor: Khandan Vahabzadeh Monshi
 * PasswordCheckerUtility class
 * @author Faith Fru Nchang
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;

public class PasswordCheckerUtility {

	public PasswordCheckerUtility()
	{
		
	}
	
	/**
	 * compare whether two passwords are the same
	 * @param password - the right password to be checked for 
	 * @param passwordConfirm - password to be checked against password for
	 * @throws UnmatchedException - throws this exception if the passwords are different
	 */
	public static void comparePasswords(String password, String passwordConfirm) throws UnmatchedException
	{
		if (!password.equals(passwordConfirm))
			throw new UnmatchedException();
	}
	
	
	/**
	 * compare equality of two passwords
	 * @param password - the right password to be checked for 
	 * @param passwordConfirm - password to be checked against password for
	 * @return true if the passwords are the same, false other wise
	 */
	public static boolean comparePasswordsWithReturn(String password, String passwordConfirm)
	{
		if (password.equals(passwordConfirm))
			return true;
		return false;
	}
	
	
	/**
	 *  checks whether a password has between 6 to 9 characters
	 * @param password - password to be checked for
	 * @return true if the password is between 6 to 9 characters and false otherwise
	 */
	public static boolean hasBetweenSixAndNineChars(String password)
	{
		int length = password.length();
		if (length >= 6 && length <= 9)
			return true;
		else
			return false;
	}
	
	
	
	
	/**
	 * Checks if the password contains at least one digit
	 * @param password - password to be checked if it contains a number
	 * @return true if it meets the digit the requirement
	 * @throws NoDigitException - if has no digit
	 */
	public static boolean hasDigit(String password) throws NoDigitException
	{
		boolean containsDigit = false;
		int index =0;
		// loops through the password string to verify if it has a digit
		while (!containsDigit && index < password.length())
		{
			if (Character.isDigit(password.charAt(index)))
			{
				containsDigit = true;
				break;
			}
			index++;
		}
		
		if (!containsDigit)
			throw new NoDigitException();
		return containsDigit;
	}
	
	
	/**
	 * checks if the password contains at least one lower case alpha character
	 * @param password - password string to check for lowercase requirement
	 * @return true if password meets requirement, and throws an exception otherwise
	 * @throws NoLowerAlphaException - thrown if password does not contain at least one lower case character
	 */
	public static boolean hasLowerAlpha(String password) throws NoLowerAlphaException
	{
		boolean containsLowerAlpha = false;
		int index =0;
		
		// loops through the password string to verify if a password contains lower case letter
		while (!containsLowerAlpha && index < password.length())
		{
			if (Character.isLetter(password.charAt(index)) && Character.isLowerCase(password.charAt(index)))
			{
				containsLowerAlpha = true;
				break;
			}
			index++;
		}
		// throws an exception if there is no lower case letter in the password
		if (!containsLowerAlpha)
			throw new NoLowerAlphaException();
		return containsLowerAlpha;
	}
	
	

	/**
	 * checks if the password contains at least one special character
	 * @param password - password string to check for the requirement
	 * @return - true if the password contains a special character
	 * @throws NoSpecialCharacterException - exception thrown when the password has no special character
	 */
	public static boolean hasSpecialChar(String password) throws NoSpecialCharacterException
	{
		Pattern pattern = Pattern.compile("[a-zA-Z0-9]*");
		Matcher matcher = pattern.matcher(password);
		// throws an exception if the password contains no special character
		if (matcher.matches())
			throw new NoSpecialCharacterException();
		return true;
	}

	
	/**
	 * checks if the password has an alpha upper case character
	 * @param password - password string to check for requirement
	 * @return  true if the password contains an upper alpha character
	 * @throws NoUpperAlphaException - throws this exception when the password contains no alpha upper character
	 */
	public static boolean hasUpperAlpha(String password) throws NoUpperAlphaException
	{
		boolean containsUpperAlpha = false;
		int index =0;
		
		// loops through the passwords string to check if the password contains an upper case letter
		while (!containsUpperAlpha && index < password.length())
		{
			if (Character.isLetter(password.charAt(index)) && Character.isUpperCase(password.charAt(index)))
			{
				containsUpperAlpha = true;
				break;
			}
			index++;
		}
		// throws an exception if the password has no upper case letter
		if (!containsUpperAlpha)
			throw new NoUpperAlphaException();
		return containsUpperAlpha;
	}
	
	
	/**
	 * checks if the password meets the minimum requirement of 6 characters long
	 * @param password - password string to check requirements
	 * @return true if the password has at least 6 characters
	 * @throws LengthException - throws this exception if the password has less than 6 characters
	 */
	public static boolean isValidLength(String password) throws LengthException
	{
		if (password.length() < 6)
			throw new LengthException();
		return true;
	}
	
	
	
	/**
	 * verifies if the password contains no more than two same characters in a sequence
	 * @param password - password to check requirement
	 * @return true if the password meets the requirement
	 * @throws InvalidSequenceException - thrown if the password has more than two characters in sequence
	 */
	public static boolean NoSameCharInSequence(String password) throws InvalidSequenceException
	{
		boolean isValidSequence = true;
		int numberOfCharOccurence = 0;
		for (int i =0; i < password.length(); i ++)
		{
			// ensures that the substring contains more than two characters
		    if (password.substring(i).length() > 2)
		    {
    		  for (int j =i; j < i+3; j ++)
    			{
    				if (password.charAt(i) == password.charAt(j))
    				{
    					numberOfCharOccurence++;
    				}
    			}
		    }
			
		    // checks if the current character has more than two characters
			if (numberOfCharOccurence > 2)
			{
				isValidSequence = false;
				break;
			}
			numberOfCharOccurence =0;
		}
		
		// throws an exception if the password has more than two characters in sequence
		if (!isValidSequence)
			throw new InvalidSequenceException();
		return isValidSequence;
		
	}
	
	
	/**
	 * 
	 * @param password
	 * @return Return true if valid password (follows all the following rules), returns false if an invalid password 1. At least 6 characters long - 2. At least 1 numeric character- 3. At least 1 uppercase alphabetic character - 4. At least 1 lowercase alphabetic character - 5. At least 1 special character - 6. No more than 2 of the same character in a sequence
	 * @throws LengthException - thrown if length is less than 6 characters
	 * @throws NoUpperAlphaException - thrown if no uppercase alphabetic
	 * @throws NoLowerAlphaException - thrown if no lowercase alphabetic
	 * @throws NoDigitException - thrown if no digit
	 * @throws NoSpecialCharacterException - thrown if does not meet SpecialCharacter requirement
	 * @throws InvalidSequenceException - thrown if more than 2 of same character.
	 */
	public static boolean isValidPassword(String password) throws LengthException, NoUpperAlphaException, NoLowerAlphaException, NoDigitException, NoSpecialCharacterException, InvalidSequenceException
	{
		// checks if the password is valid by verifying all the conditions
		
		// checks if the length is at least 6 characters
		if (isValidLength(password))
		{
			// checks if the password has an upper case letter
			if (hasUpperAlpha(password))
			{
				//checks if the password has a lower case letter
				if (hasLowerAlpha(password))
				{
					// checks if the password has a digit
					if (hasDigit(password))
					{
						// checks if the password has a special character
						if (hasSpecialChar(password))
						{
							// checks if the password has no more than two characters in sequence
							if (NoSameCharInSequence(password))
							{
								return true;
							}
						}
					}
				}
			}
		}
		return true;
	}
	
	
	/**
	 * Checks if password is VALID and the length is NOT between 6-9 characters
	 * @param password - password string to check if it is weak
	 * @return false if the password is valid and the length of password is NOT between 6 and 9 (inclusive). 
	 * @throws WeakPasswordException - throws this exception if the password's length is between 6 and 9 inclusive or the password is invalid
	 */
	public static boolean isWeakPassword(String password) throws WeakPasswordException
	{
		try
		{
			// if the password is valid and and has more than 9 characters, then it is not a weak password
			if (isValidPassword(password) && !hasBetweenSixAndNineChars(password))
				return false;
			else
				// throws this exception if the password is not valid or had between 6 and 9 characters
				throw new WeakPasswordException();
		}
		catch (Exception e)
		{
			throw new WeakPasswordException();
		}
		
	}
	
	
	
	
	/**
	 * this method receives an ArrayList of string passwords and returns an ArrayList of invalid passwords with their exception message
	 * @param passwords - list of passwords
	 * @return an ArrayList of invalid passwords with an exception message
	 */
	public static ArrayList<String> getInvalidPasswords(ArrayList<String> passwords)
	{
		ArrayList<String> invalidPasswords = new ArrayList<>();
		String currentPassword;
		// loops through the ArrayList to check if the password is invalid
		for (int i =0; i < passwords.size(); i++)
		{
			currentPassword = passwords.get(i);
			try
			{
				// if the password is valid, then no exception is thrown
				isValidPassword(currentPassword);
				
			}
			catch (Exception e)
			{
				// Concatenates the the password that caused an exception with the exception message.
				invalidPasswords.add(currentPassword + " " + e.getMessage());
			}
		}
		
		return invalidPasswords;
		
	}
	
	}
