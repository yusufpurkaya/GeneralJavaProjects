package random;

public class ZarAtmaOyunu {

	public static void main(String[] args) {
		
      int zar=(int) (Math.random()*6+1);
	
	
	
	System.out.println(zar);
	
	switch (zar) {
	case 1: {
		System.out.println("*");}
	break;
	case 2: {
		System.out.println("* *");}
	break;
	case 3: {
		System.out.println("  *  \n * *");}
	break;
	case 4: {
		System.out.println("* *\n* *");}
	break;
	case 5: {
		System.out.println(" * *\n* * *");}
	break;
	case 6: {
		System.out.println("* * *\n* * *");}
	break;
	default:
		
	}
	
	
	
	
	
	}

}
