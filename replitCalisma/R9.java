package replitCalisma;

public class R9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 
 * 9--------Write a Java program to get a String from user as input and find the maximum occurring character in that string.
(Ignore case sensitivity).

Kullanıcıdan girdi olarak bir String almak için bir Java programı yazın 
ve o karakter dizisinde oluşan 
maksimum karakteri bulun.

(Büyük/küçük harf duyarlılığını göz ardı edin).
Input : Learning java is easy

 Output: maximum occurring character is : a

 * 
 * 
 * 
 */
		
		
	 
		String metin = "Merhaba dünya bu java örnekleri";
	String str="";
	
	for (int i = 0; i < metin.length(); i++) {
		int tekrar=0;
		
		for (int j = 0; j < args.length; j++) {
			if (metin.charAt(i)==metin.charAt(j)) {
				str+=metin.charAt(i);
			
			}
		}
	}
	
	/*
	 * String metin = "Merhaba dünya bu java örnekleri";
        char karakter = 'e';
        int tane = 0;
 
        for(int i = 0; i < metin.length(); i++) {
            if(karakter == metin.charAt(i)) {
                ++tane;
            }
        }
 
        System.out.println( karakter + " yazı içinde  " + tane +" tanedir");
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	}

}
