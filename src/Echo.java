import java.util.Scanner;

public class Echo {

	public static void main(String[] args) {
		System.out.print("input the word: ");
		
		Scanner input = new Scanner(System.in);
		String line = input.nextLine();
		System.out.println(line);
	}

}
