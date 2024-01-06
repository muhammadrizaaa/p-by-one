import java.util.ArrayList;
import java.util.Scanner;

public class Soal01 {

	public static void main(final String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> barang = new ArrayList<>();
		int totalBarang, beratMax, totalBerat, counter;
		totalBarang = input.nextInt();
		beratMax = input.nextInt();
		totalBerat = 0;
		counter = 0;
		for (int i = 0; i < totalBarang; i++) {
			barang.add(input.nextInt());
		}
		for (int i = 0; i < totalBarang; i++) {
			totalBerat = barang.get(i) + totalBerat;
			counter++;

			if (totalBerat > beratMax) {
				totalBerat -= barang.get(i);
				counter--;

				continue;
			} else {
				System.out.print(i + 1 + " ");
			}
		}
		System.out.println();
		System.out.println(" Barang, total berat " + totalBerat);
	}
}
