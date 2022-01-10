package replitCalisma;

import java.util.ArrayList;
import java.util.List;

public class R7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 *7-------------write a Java program to removes a specific element from an array and put the remaining elements in a new array 
 * and prints the new array
bir diziden belirli bir elemanı çıkarmak ve kalan elemanları yeni bir diziye koymak ve yeni diziyi basmak
 için bir Java programı yaz
Input :{1,2,3,4,5,6}

element:6

Output : [1,2,3,4,5]
 * 
 *  
		 * 
		 */
		
		
	int sayi[]={1,2,3,4,5,6};
		List <Integer> sayilist=new ArrayList<>();
		for (int each :sayi) {
			sayilist.add(each);
		}
		
		sayilist.remove(5);
		
		List <Integer> sayilist2=new ArrayList<>(sayilist);
		
		System.out.println(sayilist2);
		
		
		
		
		
		
		
		
		
		
/*		
		
		List <Integer> liste=new ArrayList<Integer>();
		liste.add(1);
		liste.add(2);
		liste.add(3);
		liste.add(4);
		
		
		System.out.println(liste);
		
		List <Integer> liste2=new ArrayList<Integer>();
		
		liste.remove(0);
		liste2.addAll(liste);
		
		System.out.println(liste2);
		
		
	*/	
		
		/*
		 *   Scanner klavye=new Scanner(System.in);
        
        System.out.println("Alışveriş Listesi Kaç Elemandan Oluşacak ?");
        int n=klavye.nextInt();
        
        ArrayList <String> alinacaklar=new ArrayList<String>();
        System.out.println("Alışveriş Listesini Oluşturunuz : ");
       
        for(int i=0;i<n;i++){
            alinacaklar.add(klavye.next());
        } System.out.println("Market Listesi : ");
        for(int j=0;j<n;j++){
            System.out.println(alinacaklar.get(j));
        }
        
        System.out.println("Hangi Elemanı Değiştirmek İstiyorsunuz ?");
        int ara=klavye.nextInt();
        System.out.println("Listeye Hangi Malzemeyi Eklemek İstiyorsunuz ?");
        String eleman=klavye.next();
        
        alinacaklar.add(ara-1,eleman);
        
        System.out.println("Listenin Son Hali :");
        for(int k=0;k<alinacaklar.size();k++){
            System.out.println(alinacaklar.get(k));
        }
    
        
		 * 
		 * 
		 */
		
		
		
		
		
		
		
	}

}
