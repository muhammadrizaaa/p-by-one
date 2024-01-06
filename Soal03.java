import java.util.Scanner;

public class Soal03 {

	public static void main(final String[] args) {
		Scanner input = new Scanner(System.in);
		int panjang = input.nextInt();
		String[][] array = new String[panjang][panjang];
		String a = "";
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				a = input.next();
				array[i][j] = a;
			}
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length; j++) {
				System.out.print(array[i][j] + " ");
				if (j == panjang - 1) {
					System.out.print(array[i][1] + " ");
				}
			}

		}

	}
}
