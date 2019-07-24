package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Email em1 = new Email("John", "Smith");
		Email em2 = new Email("Adhiraj", "Pathak");
		
		
		System.out.println(em1.showInfo());
		System.out.println(em2.showInfo());
	}

}
