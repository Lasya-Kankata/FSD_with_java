import java.util.Scanner;

public class MultipleOfN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[10];
		Scanner scnr = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter element: " + i);
			arr[i] = scnr.nextInt();
		}
		System.out.println("nth element: ");
		int n = scnr.nextInt();
		byte flag = 1;
		for (int i = 0; i < arr.length; i++) {
			if (n % arr[i] == 0) {
				flag = 0;
			}
		}
		if (flag == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}