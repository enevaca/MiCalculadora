package com.platzi.enevaca.micalculadora.interactor;

import com.platzi.enevaca.micalculadora.presenter.MainActivityPresenter;

/**
 * Created by enevaca on 22/12/2017.
 */

public class MainActivityInteractorImpl implements MainActivityInteractor {

    private MainActivityPresenter presenter;

    public MainActivityInteractorImpl(MainActivityPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void sumar(String number1, String number2) {
        Double resultado = Double.valueOf(number1) + Double.valueOf(number2);
        presenter.showResult(String.valueOf(resultado));
        //presenter.showError(e);
    }
}
