package random;

import java.util.Random;

public class RandomClass {

	public static void main(String[] args) {
		//random sayi uretmenin ikiyolu

		
      Random rd=new Random();	
     int a=rd.nextInt();// bu a ifadesi  -..... dan +.... ya kadar sayi uretir           
     int a2=rd.nextInt(3);	// artik 0,1,2  bu uc rakamdan birini uretebilir

     System.out.println(a);
// eger baslangıc degerinide vermek istersek

 
 //  1)  0  ile 1 arasi random deger olusturur          yani   0<= x < 1
 
 double rdm=Math.random();
 
 System.out.println(rdm);
 
 
		int rdm1=(int) Math.random();  // bunu data casting yaptik

		 int rdm2=(int) (Math.random()*5);  // (0<= x < 1) *5 dedik bu yuzden    0<= x < 5 oldu
 System.out.println(rdm2);

	
	
	
	
	int rdm3=(int) ((Math.random()*5)+2);  //   (0<= x < 5)  +2= 2<= x < 7  
	System.out.println(rdm3);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
