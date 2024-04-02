package org.example;

import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("input.txt")){
            WordsCounter wordsCounter = new WordsCounter();
            LongestWord longestWord = new LongestWord();
            WordsFrequencyCounter wordsFrequencyCounter = new WordsFrequencyCounter();
            Scanner sc = new Scanner(fr);
            while(sc.hasNext()) {
                String word = sc.next();
                wordsCounter.countWord(word);
                longestWord.compareWords(word);
                wordsFrequencyCounter.addWord(word);
            }
            System.out.println("File contains " + wordsCounter.getTotalWords() + " word");
            System.out.println("The longest word is " + longestWord.getLongestWord());
            wordsFrequencyCounter.printWordsFrequency();
        } catch (Exception e){
            throw new RuntimeException();
        }
    }
}