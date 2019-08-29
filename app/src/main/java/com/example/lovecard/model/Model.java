package com.example.lovecard.model;

import com.example.lovecard.MainContract;

import java.util.Random;

public class Model implements MainContract.ModelCallBack {
    public Model() {
    }

    String[] words = {"Bae", "Bubu", "Hani", "Love", "Bunny", "Lovely", "Darling"};

    String getRandomWords(){
        Random random = new Random();
        int rdm = random.nextInt(words.length);
        return words[rdm];
    }

    @Override
    public String getWord() {
        return getRandomWords();
    }
}
