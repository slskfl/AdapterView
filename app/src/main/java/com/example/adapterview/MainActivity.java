package com.example.adapterview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView autoEdt;
    MultiAutoCompleteTextView multiAutoEdt;
    String words[]={"able", "apple", "application", "bear", "bit", "byte", "car", "cable", "compact"};
    ArrayAdapter<String> adapter; // 문자를 담을 배열
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autoEdt=findViewById(R.id.autoEdt);
        adapter=new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, words); //(장소, 모양, 자료)
        autoEdt.setAdapter(adapter);

        multiAutoEdt=findViewById(R.id.multiAutoEdt);
        MultiAutoCompleteTextView.CommaTokenizer tokenizer=new MultiAutoCompleteTextView.CommaTokenizer();
        multiAutoEdt.setTokenizer(tokenizer);
        multiAutoEdt.setAdapter(adapter);
    }
}