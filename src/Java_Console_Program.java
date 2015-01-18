import java.util.Scanner;

/**
 * Main class
 */
public class Java_Console_Program {
    /**
    * Main method
    * @param args 
    */
    public static void main(String[] args) {
		int id;
		String code;
		
		Scanner in = new Scanner(System.in);
			
		System.out.print("Enter id: ");
		id = in.nextInt();in.nextLine();
		
		System.out.print("Enter code: ");
		code = in.nextLine();
		
		System.out.print("values " + id + " " + code);		
    }
}
