package A_Practice_04;

import java.util.Scanner;

public class S_Bankamatik {

	public static void main(String[] args) {
		// Bir bankamatik uygulamasi yapiniz. Swich Case kullanarak
		
		System.out.println("*********ATM ye hos geldiniz*************");
		Scanner scan=new Scanner(System.in);
		
		String islemler = "1.islem : Bakiye ogrenme\n2.islem : Para Yatirma\n"
                + "3.islem : Para cekme\n"
                + "4.islem : cikis";
System.out.println(islemler);
		String secim=scan.next();
		int bakiye=5000;


switch (secim) {

case "1": 
	
	System.out.println("hesap bakiyeniz : "+bakiye);	
	break;
case "2": 
	System.out.println("hesabiniza yatirmak istediginiz para miktarini giriniz");
	int paraYatirma=scan.nextInt();
	bakiye+=paraYatirma;
	System.out.println("son bakiyeniz :"+bakiye);
	break;
case "3": 
	System.out.println("hesabinizdan cekmek istediginiz tutari giriniz");
	int tutar=scan.nextInt();
	bakiye-=tutar;
	if (tutar<=bakiye) {System.out.println("hesabinizda kalan tutar: "+bakiye);
		
	} else {
System.out.println("hesabinizda o kadar para yok");
	}
	
	break;
case "4": 
	System.out.println("iyi gunler bi daha bekleriz");
	break;
default:
	System.out.println("hatali giris yaptiniz");
}










	}

}
