package day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class C01 {
//  sorted  methodu,
	public static void main(String[] args) {
	
		List<Integer>liste=new ArrayList<>(Arrays.asList(12,-3,65,7,34,22,-60,42,12));
	
		 onbesdenKucukTek(liste);
		 ciftKareleriniListele(liste);
		 System.out.println("********");
		 tekKareleriniListele(liste);
	}

	//List'teki 15'ten buyuk en kucvuk tek sayiyi yazdiriniz
	
	public static void onbesdenKucukTek(List<Integer>liste) {
	//Optional<Integer> a=liste.stream().filter(t->t%2==1).filter(t->t>15).reduce(Math::min);
	//liste.stream().filter(t->t%2==1 & t>15).reduce(Math::min);
	
	//System.out.println(a);
	System.out.println(liste.stream().filter(t->t%2==1 & t>15).reduce(Math::min));
	}
	
	//List'teki cift elemanlarini karelerini kucukten buyuge sirala , yazdir


	public static void ciftKareleriniListele(List<Integer>liste) {
	liste.stream().filter(t->t%2==0).map(t->t*t).sorted().forEach(t->System.out.print(t+","));

//liste.stream().distinct().sorted().filter(t->t%2!=0 && t>15)reduce(Integer.MAX_VALUE, (t,u)->t<u?t:u  );

//int el=list.stream().filter(t->t>15 & t%2==1).reduce(Integer.MAX_VALUE, Math::min);
//	System.out.println(el);

	}
	//List'teki tek elemanlarini karelerini buyukten kucuge  sirala , yazdir

	public static void tekKareleriniListele(List<Integer>liste) {
liste.stream().filter(t->t%2!=0).map(t->t*t).sorted(Comparator.reverseOrder()).forEach(t->System.out.print(t+","));
	}



	
}
