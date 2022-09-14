package com.example.conversor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.PrintStream;

public class MainActivity extends AppCompatActivity {


    TextView valorInput;
    TextView resultText;
    String workings = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initTextViews();


    }

    private void initTextViews(){


        resultText = (TextView)findViewById(R.id.resultText);
        valorInput = (TextView)findViewById(R.id.valorInput);
    }


    private void setValorInput(String valorRecebido){

        workings = workings + valorRecebido;
        valorInput.setText(workings);

    }


    public void resetOnclick(View view) {
        valorInput.setText("");
        resultText.setText("");
        workings = "";

    }



    public void handleConvert(View view) {

        double valorDolar = Double.parseDouble(valorInput.getText().toString());
        double valorReais = valorDolar * 5.14;
        resultText.setText(String.format("R$ %.2f", valorReais));
        valorInput.setText("");
        workings = "";
    }

    public void severnOnclick(View view) {
        setValorInput("7");
    }

    public void eightOnclick(View view) {
        setValorInput("9");
    }

    public void nineOnclick(View view) {
        setValorInput("9");
    }

    public void sixOnclik(View view) {
        setValorInput("6");
    }

    public void fiveOnclick(View view) {
        setValorInput("5");
    }

    public void fourOnclick(View view) {
        setValorInput("4");
    }

    public void threeOnclick(View view) {
        setValorInput("3");
    }

    public void twoOnclick(View view) {
        setValorInput("2");
    }

    public void oneOnclick(View view) {
        setValorInput("1");
    }

    public void zeroOnclick(View view) {
        setValorInput("0");
    }

    public void pointerOnclick(View view) {
        setValorInput(".");
    }


}