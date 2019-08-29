package com.example.lovecard;

public interface MainContract {

    interface PresenterCallBack{
       void buttonClicked();
    }

    interface ModelCallBack{
        String getWord();
    }

    interface ViewCallBack{
        void showProgress();
        void hideProgress();
        void setWord(String word);
    }
}
