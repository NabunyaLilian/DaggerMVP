package com.example.lovecard.presenter;

import com.example.lovecard.MainContract;
import com.example.lovecard.model.Model;

public class Presenter implements MainContract.PresenterCallBack {
    Model model;
    MainContract.ViewCallBack view;

    public Presenter(MainContract.ViewCallBack view) {
        this.model = new Model();
        this.view = view;
    }

    @Override
    public void buttonClicked() {
        if(view != null){
            String word = model.getWord();
            System.out.println("word is "+word);
            view.showProgress();
            view.hideProgress();
            view.setWord(word);
        }
        }
}
