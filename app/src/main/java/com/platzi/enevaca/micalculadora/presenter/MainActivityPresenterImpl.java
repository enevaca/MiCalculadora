package com.platzi.enevaca.micalculadora.presenter;

import com.platzi.enevaca.micalculadora.interactor.MainActivityInteractor;
import com.platzi.enevaca.micalculadora.interactor.MainActivityInteractorImpl;
import com.platzi.enevaca.micalculadora.view.MainActivityView;

/**
 * Created by enevaca on 22/12/2017.
 */

public class MainActivityPresenterImpl implements MainActivityPresenter {

    private MainActivityView mainActivityView;
    private MainActivityInteractor interactor;

    public MainActivityPresenterImpl(MainActivityView mainActivityView) {
        this.mainActivityView = mainActivityView;
        interactor = new MainActivityInteractorImpl(this);
    }

    @Override
    public void sumar(String number1, String number2) {
        interactor.sumar(number1, number2);
    }

    @Override
    public void showError(String error) {
        mainActivityView.showError(error);
    }

    @Override
    public void showResult(String result) {
        mainActivityView.showResult(result);
    }
}
