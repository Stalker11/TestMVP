package com.olegel.testmvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.olegel.testmvp.interfaces.IMainPresenter;
import com.olegel.testmvp.interfaces.IView;

public class MainActivity extends AppCompatActivity implements IView {
    private IMainPresenter presenter;
    private static final String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(presenter == null){
            presenter = new MainPresenter(this);
        }
        presenter.onButtonClick();
    }

    @Override
    public String getUrl() {
        return null;
    }

    @Override
    public void onButtonClick() {

    }

    @Override
    public void showData() {
        Log.d(TAG, "showData: ");
    }

    @Override
    public void showError() {
        Log.d(TAG, "showError: ");
    }
}
