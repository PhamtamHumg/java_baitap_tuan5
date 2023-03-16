package main;
import java.util.Scanner;
public class Bai_12 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("nhap vao so dong :");
		int m = in.nextInt();
		System.out.println("nhap vao so cot :");
		int n = in.nextInt();
		int a[][] = new int[m][n];
		System.out.println("nhap vao tung phan tu trong mang:");
		for(int i=0 ; i < m ; i++) {
			for(int j = 0; j < n; j++) {
				a[i][j]=in.nextInt();
			}
		}
		
		int max = a[0][0];
		for(int i = 0; i < m ; i++) {
			for(int j=0; j< n ; j++) {
				if(a[i][j] > a[0][0]) {
					max = a[i][j];
				}
			}
		}
		System.out.println("gia tri lon nhat la:" + max);
	}
}
	
	