package com.example.lovecard.di;

import com.example.lovecard.MainContract;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ViewModule {

    MainContract.ViewCallBack viewCallBack;

    public ViewModule(MainContract.ViewCallBack viewCallBack) {
        this.viewCallBack = viewCallBack;
    }

    @Singleton
    @Provides
    MainContract.ViewCallBack provideView(){
        return viewCallBack;
    }

}
