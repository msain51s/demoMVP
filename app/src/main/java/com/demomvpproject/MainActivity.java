package com.demomvpproject;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatEditText;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MainView,View.OnClickListener {
  private AppCompatEditText userName,password;
  private ProgressDialog progressBar;
  private Presenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName= (AppCompatEditText) findViewById(R.id.username);
        password= (AppCompatEditText) findViewById(R.id.password);
        findViewById(R.id.login_btn).setOnClickListener(this);

        progressBar=new ProgressDialog(this);
        presenter=new PresenterImpl(this,new ModelImpl());
    }

    @Override
    public void showProgress() {
      progressBar.show();
    }

    @Override
    public void hideProgress() {
       progressBar.dismiss();
    }

    @Override
    public void showToastMessage(String message) {
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View view) {
       presenter.performLoginBusinessLogic(userName.getText().toString(),password.getText().toString());
    }
}
