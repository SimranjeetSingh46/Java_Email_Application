package emailapp;

public class EmailApp {
	
	public static void main(String[] args) {
		Email em1 = new Email("John", "Smith");
		em1.setAlternateEmail("\n js@gmail.com");
		System.out.print(em1.getalternateEmail());
		System.out.println(em1.showInfo());
		
		
		
	}

}
