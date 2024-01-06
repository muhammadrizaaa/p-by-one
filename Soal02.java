import java.util.ArrayList;
import java.util.Scanner;

public class Soal02 {

	public static void main(final String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> kata1 = new ArrayList<>();
		String kata = input.nextLine();
		String vokal = kata.substring(kata.length() - 1);
		String hasil = kata.replaceAll("[aiueoAIUEO]", vokal);
		char a;
		int counter = 0;
		String hasil1 = "";
		String hasilBalik = "";
		for (int i = 0; i < hasil.length(); i++) {
			a = hasil.charAt(i);
			hasil1 = hasil1 + a;
			hasilBalik = a + hasilBalik;
			if (Character.isWhitespace(a)) {
				if (counter % 2 == 0) {
					kata1.add(hasil1.replace(" ", ""));
					hasil1 = "";
					hasilBalik = "";
					counter++;
					continue;
				} else {
					kata1.add(hasilBalik.replace(" ", ""));
					hasil1 = "";
					hasilBalik = "";
					counter++;
					continue;
				}
			}
		}
		String final1 = "";
		for (int i = 0; i < kata1.size(); i++) {
			System.out.print(kata1.get(i) + " ");
		}

		System.out.println(final1 + " ");
	}
}
