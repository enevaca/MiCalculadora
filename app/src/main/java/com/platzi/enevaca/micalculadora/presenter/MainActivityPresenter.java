package com.platzi.enevaca.micalculadora.presenter;

/**
 * Created by enevaca on 22/12/2017.
 */

public interface MainActivityPresenter {

    void sumar(String number1, String number2); //interactor
    void showError(String error); //view
    void showResult(String result); //view
}
