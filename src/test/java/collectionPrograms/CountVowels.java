package collectionPrograms;

import java.util.LinkedHashMap;

public class CountVowels {

	public static void main(String[] args) {

		String a="my name is swati";
	    LinkedHashMap<Character,Integer> map=new LinkedHashMap<Character,Integer>();
	    
	    for(char ch:a.toCharArray()){
	        if("aeiou".indexOf(ch)!=-1){
	        map.compute(ch,(k,v)->(v==null)?1:++v);    
	        }
	    }
	        
	        
	        System.out.println(map);
	    }
	
	}


