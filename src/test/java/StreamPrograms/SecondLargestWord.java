package StreamPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SecondLargestWord {

	public static void main(String[] args) {

		  String str = "My name aura is Aruna";

		  List<String> words = Arrays.asList(str.split(" "));
		  String secondLargest = words.stream()
			        .sorted(Comparator.comparingInt(String::length).reversed()) 
			        .skip(1)
			        .findFirst()
			        .orElse("Not found");	
		  System.out.println("Second largest word: " + secondLargest);
	}

}
