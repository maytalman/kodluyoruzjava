package Giris3;

import java.util.*;
public class pratik5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int taban,us,sonuc=1;
		Scanner input = new Scanner(System.in);
		System.out.println("taban say�y� giriniz: ");
		taban = input.nextInt();
		System.out.println("�s say�y� giriniz: ");
		us =input.nextInt();
		
		int i=0;
		while(i<us) {
			sonuc*=taban;
			i++;
		}
		System.out.println(sonuc);
	}

}
