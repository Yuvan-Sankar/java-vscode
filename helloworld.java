import java.util.Scanner;
public class helloworld {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter percentage:");
		int per = sc.nextInt();

		if (per >= 95) {
			System.out.println("A+");
		} else if (per >= 85) {
			System.out.println("A");
		} else if (per >= 75) {
			System.out.println("B+");
		} else if (per >= 65) {
			System.out.println("B");
		} else if (per >= 55) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}
	}
}
