package com.example.lovecard.di;

import com.example.lovecard.view.MainActivity;

import javax.inject.Singleton;

@Singleton
@dagger.Component(modules = {ModelModule.class, ViewModule.class})
public interface Component {
    void inject(MainActivity mainActivity);

}
