package org.example;


public class WordsCounter{
    private int totalWords;

    public WordsCounter() {
        this.totalWords = 0;
    }

    public void countWord(String word) {
        totalWords++;
    }

    public int getTotalWords() {
        return totalWords;
    }

}
