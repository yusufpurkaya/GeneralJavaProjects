package kutuphane;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		KitapIslemleri kitapislemleri = new KitapIslemleri();
		
		while(true) {
			System.out.println("Hangi islemi gerceklestirmek isterisiniz? \n1)Kitap ekle"
					+"\n2)Kitap sil \n3)Kitap guncelle\n4)Tum kitaplari goster \n5)Programi sonlandir");
			int cevap=input.nextInt();
			input.nextLine();
	
			if(cevap==1) {
				System.out.println("Kitap ismini giriniz");
				String kitapAdi=input.nextLine();
				System.out.println("Kitap ISBN no giriniz");
				String kitapIsbn = input.nextLine();
				System.out.println("Kitap aciklamasini giriniz");
				String kitapAciklama =input.nextLine();
				System.out.println("Yazar ismini giriniz");
				String yazarAdi=input.nextLine();
				System.out.println("Yazar yasini giriniz");
				int yas =input.nextInt();
				System.out.println("Yazar memleketini giriniz");
				String yazarMemleketi = input.nextLine();
				input.nextLine();
				System.out.println("Yayinevi ismini giriniz");
				String yayineviAdi=input.nextLine();
				System.out.println("Yayinevi adresini giriniz");
				String yayineviAdresi=input.nextLine();
				Yazar yazar=new Yazar(yazarAdi,yas,yazarMemleketi);
				YayinEvi yayinevi= new YayinEvi(yayineviAdi, yayineviAdresi);				
				Kitap kitap=new Kitap(kitapAdi, kitapIsbn, yazar, yayinevi, kitapAciklama);
				kitapislemleri.kitapEkle(kitap);
			}else if(cevap==2) {
				System.out.println("Silmek istediginiz kitabin numarasini giriniz.");
				int index=input.nextInt();
				kitapislemleri.kitapSil(index);
			}else if(cevap==3) {
				System.out.println("Hangi kitabi guncellemek istersiniz?");
				int index=input.nextInt();
				input.nextLine();
				System.out.println("Kitap ismini giriniz");
				String kitapAdi=input.nextLine();
				input.nextLine();
				System.out.println("Kitap ISBN no giriniz");
				String kitapIsbn = input.nextLine();
				System.out.println("Kitap aciklamasini giriniz");
				String kitapAciklama =input.nextLine();
				System.out.println("Yazar ismini giriniz");
				String yazarAdi=input.nextLine();
				System.out.println("Yazar yasini giriniz");
				int yas =input.nextInt();
				input.nextLine();
				System.out.println("Yazar memleketini giriniz");
				String yazarMemleketi = input.nextLine();
				input.nextLine();
				System.out.println("Yayinevi ismini giriniz");
				String yayineviAdi=input.nextLine();
				System.out.println("Yayinevi adresini giriniz");
				String yayineviAdresi=input.nextLine();
				Yazar yazar=new Yazar(yazarAdi,yas,yazarMemleketi);
				YayinEvi yayinevi= new YayinEvi(yayineviAdi, yayineviAdresi);				
				Kitap kitap=new Kitap(kitapAdi, kitapIsbn, yazar, yayinevi, kitapAciklama);
				
				kitapislemleri.kitapGuncelle(index, kitap);
				
			}else if(cevap==4) {
				kitapislemleri.tumKitaplar();
			}else if(cevap==5) {
				System.out.println("program sonlandiriliyor");
				break;
			}
		}
	input.close();
		
	}

}
