package main;
import java.util.Scanner;
public class Bai_9 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("nhap vao chuoi bat ky:");
		String chuoi = in.nextLine();
		System.out.println("phan tu trong chuoi:");
		for(int i=0 ; i < chuoi.length() ; i++) {
			char kytu = chuoi.charAt(i);
			System.out.println(kytu);
		}
	}
}