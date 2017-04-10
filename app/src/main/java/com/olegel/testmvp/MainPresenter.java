package com.olegel.testmvp;

import com.olegel.testmvp.interfaces.IMainPresenter;
import com.olegel.testmvp.interfaces.IModel;
import com.olegel.testmvp.interfaces.IView;

public class MainPresenter implements IMainPresenter {
    private IView view;
    private IModel model;

    public MainPresenter(IView view) {
        this.view = view;
        model = new Model();
    }

    @Override
    public void onButtonClick() {
        view.showData();
        view.showError();
    }
}
