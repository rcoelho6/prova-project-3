package prova.project3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamImpl implements Stream {
	
	private List<String> stream;
	private List<String> vowels;
	private int i;
	private String now;
	private String before;
	
	private static String VOWELS = "^a|e|i|o|u$"; 
	
	public StreamImpl(String stream){
		this.stream = Arrays.asList(stream.split("")).stream().map(String::toLowerCase).collect(Collectors.toList());
		this.vowels = this.stream.stream().filter(s -> s.matches(VOWELS)).collect(Collectors.toList());
		this.i = 0;
	}
	
	public List<String> getVowels(){
		return vowels;
	}
	
	@Override
	public String getNext() {
		if (hasNext()) {
			before = now;
			now = stream.get(i);
			i++;
			return now;
		}else{
			return null;
		}
	}
	
	@Override
	public boolean hasNext() {
		return (i<(stream.size()));
	}
		
	public void goToFirstConsonant(){
		boolean firstV = false;
		while(this.hasNext()){
			String next = this.getNext();
			if (firstV) {
				if(!vowels.contains(next)){
					return;
				}
			}else{
				if(vowels.contains(next)){
					firstV = true;
				}	
			}
		}
	}
	
	public String getNow(){
		return now;
	}
	public String getBefore(){
		return before;
	}
}
