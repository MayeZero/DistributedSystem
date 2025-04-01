import java.util.*;

public class Dictionary {
	private Map<String, List<String>> dictionaryTable = new HashMap<>();
	
	public Dictionary() {
		dictionaryTable.put("word1", new ArrayList<>());
		dictionaryTable.get("word1").add("meaning1");
		dictionaryTable.get("word1").add("meaning2");
	}
	
	public List<String> getMeaningsForWord(String word){
		List<String> meaningsForWord = dictionaryTable.get(word);
		return meaningsForWord;
	}
}
