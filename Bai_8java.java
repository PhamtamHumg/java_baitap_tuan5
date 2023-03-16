package main;
import java.util.Scanner;
public class Bai_8java {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("nhap vao so nguyen n");
		int n = in.nextInt();
		int a[] = new int[n];
		for(int i=0 ; i <= n ; i++) {
			System.out.println("nhap vao phan tu thu: " + i);
			a[i]= in.nextInt();
		}
		int sum = 0;
		for(int i = 0 ; i <= n ; i++) {
			sum += a[i];
			
		}
		System.out.println("trung binh cong la:" + (sum/n));
	}

}
