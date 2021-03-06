package com.crypticcoder.cleanarchitecture.di.modules;

import com.crypticcoder.cleanarchitecture.di.ActivityScope;
import com.crypticcoder.cleanarchitecture.domain.interactors.AddBookInteractor;
import com.crypticcoder.cleanarchitecture.domain.interactors.GetBookListInteractor;
import com.crypticcoder.cleanarchitecture.domain.interactors.RemoveBookInteractor;
import com.crypticcoder.cleanarchitecture.domain.interactors.ViewBookInteractor;
import com.crypticcoder.cleanarchitecture.domain.interactors.impl.AddBookInteractorImpl;
import com.crypticcoder.cleanarchitecture.domain.interactors.impl.GetBookListInteractorImpl;
import com.crypticcoder.cleanarchitecture.domain.interactors.impl.RemoveBookInteractorImpl;
import com.crypticcoder.cleanarchitecture.domain.interactors.impl.ViewBookInteractorImpl;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Cryptic Coder on 30,October,2017
 */

@Module
public class InteractorModule {

    @Provides
    @ActivityScope
    AddBookInteractor provideAddBookInteractor(AddBookInteractorImpl interactor) {
        return interactor;
    }

    @Provides
    @ActivityScope
    GetBookListInteractor provideGetBookListInteractor(GetBookListInteractorImpl interactor) {
        return interactor;
    }

    @Provides
    @ActivityScope
    RemoveBookInteractor provideRemoveBookInteractor(RemoveBookInteractorImpl interactor) {
        return interactor;
    }

    @Provides
    @ActivityScope
    ViewBookInteractor provideViewBookInteractor(ViewBookInteractorImpl interactor) {
        return interactor;
    }

}
