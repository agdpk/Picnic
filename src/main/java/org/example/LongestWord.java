package org.example;

public class LongestWord {
    private int longestLength;
    private String longestWord;

    public LongestWord() {
        this.longestLength = 0;
        this.longestWord = null;
    }

    public void compareWords(String word){
        if(word.length() > longestLength){
            longestWord = word;
            longestLength = word.length();
        }
    }

    public int getLongestLength() {
        return longestLength;
    }

    public String getLongestWord() {
        return longestWord;
    }

    @Override
    public String toString() {
        return "LongestWord{" +
                "longestLength=" + longestLength +
                ", longestWord='" + longestWord + '\'' +
                '}';
    }
}
