import java.util.Scanner;

public class Soal04 {

	public static void main(final String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int r = input.nextInt();
		int n = input.nextInt();
		System.out.println(hitung(a, r, n, 0));

	}
	public static int hitung(int a, int r, int n, int b){
		if(b == 0){
			return a+hitung(a, r, n, b+=1);
		}

		if(b == n){
			return 0;
		}
		int kali = a;
		for(int i = 0; i<b; i++){
			kali *=r; 
		}
		return kali + hitung(a, r, n, b+=1);
	}
}
