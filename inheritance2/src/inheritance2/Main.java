package inheritance2;

public class Main {

	public static void main(String[] args) {
		
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.add(new DatabaseLogger()); //INHERITANCE EN ÖNEMLİ ÖZELLİKLERDEN
		customerManager.add(new FileLogger()); //INHERITANCE EN ÖNEMLİ ÖZELLİKLERDEN

	}

}
