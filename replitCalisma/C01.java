package replitCalisma;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
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
		
		
		
	
		
		
	}

}
