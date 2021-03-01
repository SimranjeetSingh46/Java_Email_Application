package emailapp;
import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String alternateEmail;
	private int mailboxcapacity = 500;
	private int defaultPasswordLength = 10;
	private String companySuffix = "mynewcompany.com";
	private String email;
			
	
	// Constructor to receive the first name and last name
	public Email(String firstName,  String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email Created: " + this.firstName + " " + this.lastName);
		
		// calling a method asking for the department return the department 
		
		this.department = setDepartment();
		System.out.print("Department: " + this.department);
		
		//call a method that return random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.print("Your password is:  \n" + this.password);
		
		//Combine elements to generate Email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;		
		System.out.print("\n Your email is:  \n" + email);
	}
	 
	// Ask for the department 
	private String setDepartment() {
		System.out.print("Deaprtment Codes \n1 for sales\n2 for Development\n3 for Accounting \n0 for more\n Enter Department code");
		Scanner in = new Scanner(System.in);
		
		int depChoice = in.nextInt();
		
		if (depChoice == 1) {
			return "sales";
		}
		else if (depChoice == 2) {
			return "dev";
		}
		else if (depChoice == 3) {
			return "acct";
		}
		else
		{
			return " ";
		}
		
	}
	
	
	// Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "abcdefghijklmnopqurstuvwxyz01234567891!@#$%";
		char [] password = new char[length];
		for (int i=0; i< length; i++ ) {
			int rand = (int)(Math.random()* passwordSet.length());
			System.out.println(rand);
			password[i] = passwordSet.charAt(rand);
			
		}
		return new String(password);
		
	}
	
	// Set the mailbox capacity 
	public void setMailboxCapacity(int capacity) {
		this.mailboxcapacity = capacity;
	}
	
	// Set the alternative email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
		}
	
	// Change the password
	public void changePassword(String password ) {
		this.password = password;
	}
	
	public int getMailBoxCapacity() {
		return mailboxcapacity;
		
	}
	
	public String getalternateEmail() {
		return alternateEmail;
		
	}
	
	public String getPassword() {
		return password;
		
	}
	
	public String showInfo() {
		return "\n Display Name : " + firstName + " " + lastName + 
			   "\n Company Name: " + email +
			   "\n Mail Box Capacity: " + mailboxcapacity + "mb";
	}

}


