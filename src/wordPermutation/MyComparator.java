package wordPermutation;

import java.util.Comparator;

public class MyComparator implements Comparator<Word> {
	@Override
	public int compare(Word a, Word b) {
		return a.word.compareTo(b.word);
	}
}
