package com.thundersoda.samplemvp.dagger;

import android.app.Application;

import com.thundersoda.samplemvp.MainActivityModule;

public class App extends Application {

    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .mainActivityModule(new MainActivityModule())
                .build();
    }

    public ApplicationComponent getComponent() {
        return component;
    }
}
