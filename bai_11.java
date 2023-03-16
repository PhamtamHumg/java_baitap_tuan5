package main;
import java.util.Scanner;
public class bai_11 {
		public static void sort(int [] a) {
			for(int i = 0; i < a.length - 1; i++) {
				for(int j = i + 1; j < a.length; j++) {
					if(a[i] > a[j]) {
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
		}
		public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("nhap vao n:");
		int n = in.nextInt();
		int a[] = new int[n];
		System.out.println("nhap vao tung phan tu:");
		for(int i = 0; i <= n ; i++) {
			a[i]=in.nextInt();
		}
		sort(a);
		System.out.println("mang sau khi sap xep : ");
		for(int i = 0; i <= n; i++) {
			System.out.print(a[i] + " ");
		}
		}
}
