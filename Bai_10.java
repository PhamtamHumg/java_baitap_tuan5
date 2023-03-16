package main;
import java.util.Scanner;
public class Bai_10 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("nhap vao chuoi :");
		String chuoi = in.nextLine();
		System.out.println("ky tu cua chuoi:");
		System.out.println("so ky tu co trong chuoi la:" + chuoi.length());
		for(int i=0 ; i < 80 ; i++) {
			char kytu = chuoi.charAt(i);
			System.out.println(kytu);
		}

	}

}
