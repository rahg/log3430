package ca.polymtl.log3430.projet;

public class Word {
	Word(String word) {
		this.word = word;
	}
	
	public boolean equals(Word w) {
		return this.word.equals(w.word);
	}
	
	String word;
}
