package prova.project3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReadStream {
	public static void main(String[] args){
		List<String> unique = new ArrayList<String>();
		
		StreamImpl stream = new StreamImpl(args[0]);

		stream.goToFirstConsonant();
		
		if(!stream.hasNext()){
			System.out.println("The stream doesn´t have a consonant");
			return;
		}

		String chr;
		boolean keepReading = true;
		
		while(stream.hasNext()){
			chr = stream.getNext();
			System.out.println(chr);
			if(!stream.getVowels().contains(chr)){
				if(stream.getVowels().contains(stream.getBefore())){
					keepReading = true;
				}else{
					keepReading = false;
				}
			}else{
				if(keepReading&&Collections.frequency(stream.getVowels(),chr)==1){
					unique.add(chr);
				}
			}
		}
		
		System.out.println("Unique words: ");
		for(String res:unique){
			System.out.print(res);
		}
	}
}
