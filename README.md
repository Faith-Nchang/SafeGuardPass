# SafeGuardPass
SecurePassChecker is a robust application for validating password strength. Whether checking single passwords or batch files, it ensures compliance with stringent security criteria.

# Concepts
	ArrayList
	static
	Read  Files
	Javadoc
	JUnit Tests
	Exceptions
# requirements
 an application that will check for valid passwords.  The following rules must be followed to create a valid password.
1.	At least 6 characters long
2.	10 or more characters is a strong password, between 6 and 9 characters is a weak (but acceptable) password.
3.	At least 1 numeric character
4.	At least 1 uppercase alphabetic character
5.	At least 1 lowercase alphabetic character
6.	At least 1 special character
7.	No more than 2 of the same character in a sequence
Hello@123 – OK
AAAbb@123 – not OK
Aaabb@123 – OK

# Operation:
When the application begins, the user will be presented with a screen that states the above instructions for creating a password, two text entry boxes for typing in a password, and three buttons.  
If the user wants to check a single password, they will type in the password in both boxes and select the “Check Password” button.
If the user wants to read in and check a list of passwords, they will select the “Check Passwords in File” button, be presented with a file explorer, and select the file to read from.  Those passwords that failed the check will be displayed, with their error message.

# Utility Class
1.	Create a PasswordCheckerUtility class based on the Javadoc given you.  
2.	The PasswordCheckerUtility class will have at least three public methods:  
•	isValidPassword:
This method will check the validity of one password and return true if the password is valid and throw one or more exceptions if invalid.  (Refer to java doc for the list of the exceptions thrown)
•	isWeakPassword:
Checks if password is valid and the length is NOT between 6 -9 characters. It returns false if the password is valid and the length of password  is NOT  between 6 and 9 (inclusive) and throws WeakPasswordException otherwise. 
•	getInvalidPasswords
This method will accept an ArrayList of passwords as the parameter  and return an ArrayList with the status of any invalid passwords (weak passwords are not considered invalid).  The ArrayList of invalid passwords will be of the following format:
<password><blank><message of exception thrown>
# Exceptions
Provide exception classes for the following:
1.	Length of password is less than 6 characters (class LengthException)
Message – The password must be at least 6 characters long
2.	Password doesn’t contain an uppercase alpha character (class NoUpperAlphaException)
Message – The password must contain at least one uppercase alphabetic character
3.	Password doesn’t contain a lowercase alpha character (class NoLowerAlphaException)
Message – The password must contain at least one lowercase alphabetic character
4.	Password doesn’t contain a numeric character (class NoDigitException)
Message – The password must contain at least one digit
5.	Password doesn’t contain a special character (class NoSpecialCharacterException)
Message – The password must contain at least one special character 
6.	Password contains more than 2 of the same character in sequence (class InvalidSequenceException)
Message – The password cannot contain more than two of the same character in sequence.
7.	Password contains 6 to 9 characters which are otherwise valid (class WeakPasswordException)
Message – The password is OK but weak - it contains fewer than 10 characters.
8.	For GUI – check if Password and re-typed Password are identical (class UnmatchedException) 
Message – The passwords do not match
Throw this exception from the GUI, not the utility class.



