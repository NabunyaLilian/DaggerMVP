package com.example.lovecard.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.lovecard.MainContract;
import com.example.lovecard.R;
import com.example.lovecard.presenter.Presenter;

public class MainActivity extends AppCompatActivity implements MainContract.ViewCallBack {
    ProgressBar progressBar;
    TextView textView1;
    TextView textView2;
    Button button;
    Presenter presenter;
    ConstraintLayout constraintLayout;

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar = findViewById(R.id.progressBar);
        button = findViewById(R.id.button);
        textView1 = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        constraintLayout = findViewById(R.id.layout);
        presenter = new Presenter(this);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.buttonClicked();
                constraintLayout.setBackgroundResource(R.drawable.rose2);
                Log.d(TAG, "onClick: ");
            }
        });
    }

    @Override
    public void showProgress() {
        Log.d(TAG, "showProgress: ");
        progressBar.setVisibility(View.VISIBLE);
        button.setVisibility(View.INVISIBLE);
    }

    @Override
    public void hideProgress() {
        Log.d(TAG, "hideProgress: ");
        progressBar.setVisibility(View.INVISIBLE);
        textView1.setVisibility(View.VISIBLE);
    }

    @Override
    public void setWord(String word) {
        Log.d(TAG, "setWord: ");
        textView2.setText(word);
        textView2.setVisibility(View.VISIBLE);

    }
}
