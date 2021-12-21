package GeneralQuestions;


import java.util.Scanner;

public class Q03_S {
    public static void main(String[] args) {


// Saati saniyeye, mil'i kilometreye, kilogrami gram'a
        // ceviren bir method yaziniz.
        // Bu methodu main methodun disinda olusturup main methodun
        // icinden cagiriniz. //1 mil=1.6 km

        Scanner scan = new Scanner(System.in);
        System.out.println("Birimi giriniz");
        String birim = scan.nextLine().toLowerCase();
        System.out.println("Miktari giriniz");
        double miktar = scan.nextDouble();

    

        scan.close();
    
donusturucu(birim,miktar);
   
    

	
		
	}

	private static void donusturucu(String birim, double miktar) {
		switch (birim) {
		case "mil","miles":
			System.out.println(miktar*1.6+"kilometredir");
			break;
		case "kg":
		case "kilo":
			System.out.println(miktar*1000+" Gram dir");
			break;
		case "saat":
			System.out.println(miktar*60*60+"  saniyedir dir");
			break;
		default:System.out.println("gecerli bir olcu birimi giriniz");
			break;
		}
		
	}
}

