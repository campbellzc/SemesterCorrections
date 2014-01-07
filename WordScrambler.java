public class WordScrambler {
	
	private static String[] wordArr = {"happy", "tree", "friends", "yolo"};
	
	public static void main(String[] args) {
		wordScrambler(wordArr);

	}
	public static void wordScrambler(String[] wordArr) {
		String[] scrambledWords = new String[wordArr.length];
		scrambledWords = mixedWords(wordArr);
	}
	private static String recombine(String word1, String word2) {
		return word1.substring(0, (word1.length()/2)) + word2.substring((word2.length()/2), word2.length());
	}
	private static String[] mixedWords(String[] words) {
		int x = 0;
		String[] newArray = new String[words.length];
		for (int i = 0; i < words.length; i+=2) {
			newArray[x] = recombine(words[i], words[i+1]);
			newArray[x+1] = recombine(words[i+1], words[i]);
			x++;
		}
		return newArray;
	}
}