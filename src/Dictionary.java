import java.util.*;

public class Dictionary {
	private Map<String, List<String>> dictionaryTable = new HashMap<>();
	
	public Dictionary() {
		dictionaryTable.put("word1", new ArrayList<>());
		dictionaryTable.get("word1").add("meaning11");
		dictionaryTable.get("word1").add("meaning12");
		
		dictionaryTable.put("word2", new ArrayList<>());
		dictionaryTable.get("word2").add("meaning21");
		dictionaryTable.get("word2").add("meaning22");
		dictionaryTable.get("word2").add("meaning23");
	}
	
	public List<String> getMeaningsForWord(String word){
		List<String> meaningsForWord = dictionaryTable.get(word);
		return meaningsForWord;
	}
}
