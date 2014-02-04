package ca.polymtl.log3430.projet;

import java.util.ArrayList;

public class Sentence {
	Sentence(String sentence, int minLength) {
		this.sentence = sentence;
		this.splitSentence(minLength);
	}
	
	private void splitSentence(int minLength) {
		// Inspiré de http://stackoverflow.com/a/4674909.
		String[] words = sentence.replace(".", "").replace(",", "").replace("?", "").replace("!", "").split(" ");
		
		for (String word : words) {
			if (word.length() >= minLength) {
				this.words.add(new Word(word));
			}
		}
	}
	
	public boolean equals(Sentence s) {
		return this.sentence.equals(s.sentence);
	}
	
	public int length() {
		return this.words.size();
	}
	
	public boolean compareTo(Sentence s, float treshold) {
		Sentence s1, s2;
		
		if (this.length() > s.length()) {
			s1 = this;
			s2 = s;
		} else {
			s1 = s;
			s2 = this;
		}
		
		int matches = 0;
		for (Word word1 : s1.words) {
			for (Word word2 : s2.words) {
				if(word1.equals(word2)) {
					matches++;
					break;
				}
			}
		}
		
		return ((float)matches/s1.words.size() >= treshold);
	}
	
	String sentence;
	ArrayList<Word> words;
}
