package com.example.lovecard.di;

import com.example.lovecard.MainContract;
import com.example.lovecard.model.Model;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ModelModule {
    Model model;

    public ModelModule(Model model) {
        this.model = model;
    }

    @Provides
    @Singleton
    MainContract.ModelCallBack getModel(){
        return model;
    }
}
