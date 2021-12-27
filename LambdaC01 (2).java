package day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
// distinct methodu akistaki elemanlari
//anyMatch() --> enaz bir eleman sarti saglarsa true aksi durumda false return eder
//allMatch() --> tum  elemanlar sarti saglarsa true en az bir eleman sarti saglamazsa false return eder.
//noneMatch() --> hic bir sarti SAGLAMAZSA true en az bir eleman sarti SAGLARSA false return eder.

public class C02 {

	public static void main(String[] args) {
	List<String> liste=new ArrayList<>(Arrays.asList("mehmet","emre","nilgun","yıldız","kader","emine","islam","islam","emre"));
	bykHrfTekrarsizSira(liste);
	System.out.println("\n***********");
	krkterSayisiTekrarsizSira( liste);
	System.out.println("\n***********");
	krkterSayisiTekrarsizDogrusira(liste);
	System.out.println("\n***********");
	sonHarfeGoreTersSirali( liste);
	System.out.println("\n***********");
	cifKareTekrarsizBuyuktenKucuge(liste);
	System.out.println("\n***********");
	yedidenazCok(liste);
	System.out.println("\n***********");
	wIleBaslama(liste);
	System.out.println("\n***********");
	enUzunEleman(liste);
	}
	
	public static void yazdir(List<Integer> liste) {
		liste.stream().forEach(t->System.out.print(t+" ")); // lambda expression
	}
	
	// list elemanlarini alfabetik buyuk harf sirasi ile ve tekrarsiz yazdiriniz
	public static void bykHrfTekrarsizSira(List<String> liste) {
	liste.stream().map(t->t.toUpperCase()).     // buyukharfe donustu
	sorted().         // kucukten buyuge siralandi
	distinct().            // tekrarsiz hale geldi
	forEach(t->System.out.print(t+" "));
	}
	
	// list elemanlarinin charakter sayisini ters sirali(buyukten kucuge) olarak tekrarsiz yazdirin
	
	public static void krkterSayisiTekrarsizSira(List<String> liste) {
	liste.stream().map(t->t.length()).sorted(Comparator.reverseOrder()).distinct().forEach(t->System.out.print(t+" "));
	}	
	
	//list elemanlarini character sayisina gore kucukten buyuge siralanarak yazilsin
	public static void krkterSayisiTekrarsizDogrusira(List<String> liste) {
		liste.stream().sorted(Comparator.comparing(t->t.toString().length())).forEach(t->System.out.print(t+" "));
		//liste.stream().map(t-> t.length()).sorted().forEach(t->System.out.print(t+" "));  // bu character sayisinca siralar
	}


// list elemanlarini son harfine gore ters sirali yazdiralim
	public static void sonHarfeGoreTersSirali(List<String> liste) {
	liste.stream().
	sorted(Comparator.comparing(t->t.toString().charAt(t.toString().length()-1)).reversed()).
	forEach(t->System.out.print(t+" "));

	}

	//list in eleman karakter sayisi Cift  sayili olan elemanlarini eleman sayilarinin 
//	karelerini hesaplayan, tekrarli olanlari sadece bir kere ve buyukten kucuge dogru
	//yazdiran bir program yaziniz.


	public static void cifKareTekrarsizBuyuktenKucuge(List<String> liste) {
		liste.stream().filter(t->t.toString().length()%2==0).map(t->t.toString().length()*t.toString().length()).distinct().
		sorted(Comparator.reverseOrder()).forEach(t->System.out.print(t+" "));

/*	liste.stream().map(t->t.length()*t.length())  // string ler eleman sayilarina cevrildi
	.filter(t->t%2==0)
	.distinct()
	.sorted(Comparator.reverseOrder()).
	forEach(t->System.out.print(t+" "));
	
	*/
	}
		
// list elemanlarini character sayisini 7 ve 7 den az olma durumunu kontrol ediniz		
		
		public static void yedidenazCok(List<String> liste) {
	
			boolean kontrol=	liste.stream().allMatch(t->t.length()<7); 
		System.out.println(kontrol);  // true cunku 7 den buyuk eleman yok 
// if ekleyebilirsin***************	
		if (kontrol) {
			System.out.println("evet 7 den uzun eleman yok");
		} else {
			System.out.println("evet 7 den uzun eleman var");
		}
// yada tek satirda boyle yazabiliridk		
		System.out.println((liste.stream().allMatch(t->t.length()<7) ?"hepsi 7 den kucuk":"7 den buyuk eleman da var"));// boyle de yapabiliridk
		
		
		
//		boolean result1=    list.stream().allMatch(t->t.length()<7);
//        System.out.println("elemanlarin uzunluklari 7 den kucuk mu? : " +result1); // elemanlarin uzunluklari 7 den kucukmu? true
      
}
		
// list elemanlarinin "w" ile baslamasini kontrol ediniz		
		
		public static void wIleBaslama(List<String> liste) {
		liste.stream().allMatch(t->t.startsWith("w"));
		System.out.println(liste.stream().allMatch(t->t.startsWith("w"))?"evet w ile baslayan var":"hayir w ile baslayan yok");
		
//		liste.stream().noneMatch(t->t.startsWith("w"))
		System.out.println((liste.stream().noneMatch(t->t.startsWith("w")))?"uyan yok":"w ile baslayan var"      );
// w ile baslayan yok ise noneMatch true doner		
		
/*contains olur
		start wiht olur
		charAt0==w olur
		sub(0,1).equals(w) olur
		*/
		
		
		}
// x ile biten var mi hic uyan var mi
		public static void xileBitme(List<String> liste) {
			liste.stream().anyMatch(t->t.endsWith("x"));
			System.out.println(	liste.stream().anyMatch(t->t.endsWith("x")));
		
		
		}


// karakter sayisi en buyuk elemani yazdiriniz
// karakter sirasina gore tersden sirala sonrada ilkinial		
		public static void enUzunEleman(List<String> liste) {
			liste.stream().sorted(Comparator.comparing(t->t.toString().length()).
					reversed()). // terse sirala
			findFirst(); // ilkini al
		
		System.out.println(liste.stream().sorted(Comparator.comparing(t->t.toString().length()).reversed()).findFirst());}


}
