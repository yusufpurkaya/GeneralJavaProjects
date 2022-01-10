package replitCalisma;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class R5_ListAsal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		/*
		 * 
		 * 5-------------Write a program that accepts an integer as input and prints first 10 prime numbers greater than input Check numbers 
		 * if they are even or not in a return method.
		
		Bir tamsayıyı girdi olarak kabul eden ve girdiden büyük ilk 10 asal sayıyı ekrana yazdıran bir program yazınız. 
		Sayıların çift olup olmadığını bir dönüş yönteminde kontrol ediniz.
		Input : 5

		Output : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]
		 * 
		 */
int sayi=5;		
List<Integer>	kova=new ArrayList<>();
for (int i = 2; i < 100; i++) {
	int kontrol=0;
	for (int j = 2; j < i; j++) {
		if (i%j==0) {
			kontrol++;
		}
	}
if (kontrol==0 && i>sayi) {
	kova.add(i);
	if (kova.size()==10) {
		System.out.println(kova);// 7
	}

}

}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

/*	
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen kendisinden buyuk 10 asal sayiyi yazacamiz RAKAM i gir ");
	int a=scan.nextInt();
	List <Integer> str=new ArrayList<>();	
	
	for (int i = 2; i < 100; i++) {
			int kontrol=0;
			for (int j = 2; j <i; j++) {
				if (i%j==0) {
					kontrol++;
					
				}
			}
	if (kontrol==0&&i>a) {
		str.add(i);
	if (str.size()==10) {
		System.out.println(str);
	}
	}	
		
	}
		
		
		
*/		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*		int num=5;
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
	/*	int sayac = 0;
	        
	        for(int sayi=2;sayi<=100;sayi++)
	        {
	            int kontrol = 0;
	            for (int i = 2; i < sayi; i++)
	            {
	               if (sayi % i == 0)
	                {
	                    kontrol = 1;
	                    break;
	                } 
	            }
	                
	            if(kontrol==0)
	            {
	                System.out.print(sayi+" ");
	                sayac++; 
	            }
	        }
	//  2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 
	
	
	*/
	}

}
