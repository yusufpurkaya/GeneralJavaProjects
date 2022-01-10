package replitCalisma;

import java.util.Scanner;

public class R8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 *  8----------Write a java program which accept a sentence as parameter, than reverses sentence by using StringBuilder 
  and checks if sentence is palindrome or not (without case sensitivity).Use StringBuilder.
Cümleyi parametre olarak kabul eden, StringBuilder kullanarak cümleyi tersine çeviren 
ve cümlenin palindrom olup olmadığını
 kontrol eden (büyük/küçük harf duyarlılığı olmadan) bir Java programı yazınız. StringBuilder kullanın.
Input :

I love Java.

Output:

Reversed sentence : avaJ evol I. It is not a palindrome"

 */
	
		Scanner scan=new Scanner(System.in);
		System.out.println("polindrom kontrolu için bir metin giriniz");
		String str=scan.nextLine();	
		StringBuilder sb=new StringBuilder(str);
		sb.reverse();
	String ters=sb.toString();
		if (str.equalsIgnoreCase(ters)) {
			System.out.println("polindrom bir metin dir");
		} else {
System.out.println("polindrom degildir");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*
	Scanner scan=new Scanner(System.in);
	System.out.println("polindrom kontrolu için bir metin giriniz");
	String str=scan.nextLine();
	StringBuilder sb=new StringBuilder(str);
	String terse=sb.reverse().toString();
	
		if (str.equalsIgnoreCase(terse)) {
			System.out.println("metin polindrom dur");
		} else {System.out.println("metin polindrom degildir");

		}	
			
			
			
			
*/		
			
			
			
			
	}

}
