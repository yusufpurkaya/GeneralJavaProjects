package replitCalisma;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QG {

	public static void main(String[] args) {
		
		// Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        // sadece tek elemanlarını ayrı diziye bir metodda atayarak
        // main de yazdırınız.
	
		/*Write a program that accepts an integer as input and prints first 10 prime numbers greater than input Check numbers
         *  if they are even or not in a return method.
         *  Girdi olarak bir tamsayı kabul eden ve girdiden büyük ilk 10 asal sayıyı ekrana yazdıran bir program yazınız.
                Input : 5
                Output : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]*/
	
	
	
	
	
	/*Write a program to find the common elements between two String Arrays (without case sensitivity)
    İki String Dizisi arasındaki ortak öğeleri bulan bir program yazın (büyük/küçük harf duyarlılığı olmadan)
    
Input1 : {John,Brad,Ange,Sofia,Emily}
Input2 : {sofia,brad,grace,emily,hazel}
Output : [sofia,brad,emily]*/
	
		
		
		
		
		
	String str3[]= {"John","Brad","Ange","Sofia","Emily"};
	String str4[]= {"sofia","brad","grace","emily","hazel"};
	
	
	for (String each1 : str3) {
	for (String each2 : str4) {
		if (each1.equalsIgnoreCase(each2)) {
			
			System.out.print(each1+"");
		}
		
	
	
	
	}
}
	

/*  
        String arr1[]= {"A","C","B"};
		 String arr2[]= {"A","R","O"};
		
		int flag=0;
		
		for (String each1 : arr1) {
			
			for (String each2: arr2) {
				
				if (each1.equals(each2)) {
					System.out.print(each1 + " ");
					flag++;
				}
				
			}
	
		}
		
		if (flag == 0) {
			System.out.println("Ortak eleman yok");
		


	}

	
*/	
	
	
	
	
	
	
	
	
	
	
	
	/*
			int num=5;
	        int sayac=0;
	 List<Integer> str= new ArrayList<>();
	
  for (int sayi =2; sayi < 100; sayi++) {
		int kontrol=0;
		for (int i = 2; i < sayi; i++) {
			if (sayi%i==0) {
		kontrol=1;		
			}
		}
	if (kontrol==0&&sayi>5) {
		str.add(sayi);
		if (str.size()==10) {
			System.out.println(str);
		break;
		}
	}
	}
	

	
	
	
*/	
	
	
	
	
	
	
	
	
	}

}
