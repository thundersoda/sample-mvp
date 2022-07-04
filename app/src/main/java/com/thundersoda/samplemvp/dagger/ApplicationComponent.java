package com.thundersoda.samplemvp.dagger;

import com.thundersoda.samplemvp.MainActivityModule;
import com.thundersoda.samplemvp.stories.list.view.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {MainActivityModule.class})
public interface ApplicationComponent {

    void inject(MainActivity target);
}
