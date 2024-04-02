package org.example;

import java.util.HashMap;
import java.util.Map;

public class WordsFrequencyCounter {
    private Map<String, Integer> wordsFrequency;

    public WordsFrequencyCounter() {
        this.wordsFrequency = new HashMap<>();
    }

    public void addWord(String word){
        wordsFrequency.put(word, wordsFrequency.getOrDefault(word, 0) + 1);
    }

    public void printWordsFrequency() {
        for (Map.Entry<String, Integer> entry : wordsFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
