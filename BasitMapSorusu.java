package day48_Maps;

import java.util.HashMap;
import java.util.Map;

public class C01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Verilen bir String’deki harfleri ve harflerin kacar kez kullanildigini return eden bir method yaziniz
   Ornek : Input : Hellooo  output : H=1, e=1, l=2, o=3
 */
	
	
	String input="Hellooo";
	
	
	Map<String,Integer>mainMap=harfsay(input);
	System.out.println(mainMap);
	
	}

	private static Map<String,Integer> harfsay(String input) {
		Map<String,Integer> harfSayilari=new HashMap<>();
		String inputArr[]=input.split("");
		
		for (String each : inputArr) {
			if (!harfSayilari.containsKey(each)) {
				harfSayilari.put(each, 1);
			} else {


harfSayilari.put(each, harfSayilari.get(each)+1);
			}
		}
		
		
		
		
		return harfSayilari;
	}

}
