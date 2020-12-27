package com.example.assignmentone;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class SecondActivity extends AppCompatActivity {
TextView tx;
TextView secondtext;
String y;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        tx=findViewById(R.id.textView4);
        secondtext=(TextView)findViewById(R.id.textView3);
         Intent ints = getIntent();
       y=ints.getStringExtra("indicators");
       tx.setText(y);
       secondtext.setText("Hello!");

    }


}
