package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String companySuffix = "anycompany.com";
	
	
	//Constructor to receive first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
	
		//Call a method asking for the department - return the department
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
		
		//Call method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + this.password);
		
		//Combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		System.out.println("Your email is: " + email);
	}
	
	//Ask for department
	private String setDepartment() {
		System.out.print("LIST OF DEPARTMENT CODES \n 1 for Sales \n 2 for Development \n 3 for Accounting \n 0 for none \nEnter department code: ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		
		if(depChoice == 1) {
			return "sales";
		} else if(depChoice == 2) {
			return "dev";
		} else if(depChoice == 3) {
			return "acct";
		} else {
			return "";
		}
		
	}
	
	
	//Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		
//		loop through the array one at a time once it generates this, we're going to return
//		a password a character at a time.
		for(int i = 0 ; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
//			System.out.println(rand); //random numbers
//			System.out.println(passwordSet.charAt(rand)); //random characters
		}
		return new String(password);
	}
	
	
	//Set mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	//Set alternative email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	//Change password
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}
	
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String showInfo() {
		return "NAME: " + firstName + " " + lastName + "\n" +
				"COMPNAY EMAIL: " + email + "\n" +
				"MAILBOX CAPACITY: " + mailboxCapacity + "MB\n";
	}
}
