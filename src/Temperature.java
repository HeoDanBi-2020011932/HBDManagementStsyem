import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		System.out.println("È­¾¾ ¿Âµµ: ");
		Scanner input = new Scanner(System.in);
		double tem1 =input.nextInt();

		double tem2= 5.0/9.0 * (tem1-32.0);
		System.out.printf("¼·¾¾ ¿Âµµ´Â %f ÀÔ´Ï´Ù",tem2);
	}

}
