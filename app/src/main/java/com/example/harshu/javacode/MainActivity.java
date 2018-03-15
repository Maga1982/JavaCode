package com.example.harshu.javacode;

import android.os.Bundle;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
public void radioMethod (View view){
        String a="hihuuu";
        Log.v("hello",a);
   // RadioButton rb = (RadioButton)findViewById(R.id.r1);
    RadioGroup rg = (RadioGroup) findViewById(R.id.rg1);
    rg.clearCheck();
 //   rb.setChecked(true);

}
    public String printToLogs(View view) {
        String a="hi";
        Log.d(a, "printToLogs() returned: " + a);
        return a;
        // Find first menu item TextView and print the text to the logs

        // Find second menu item TextView and print the text to the logs

        // Find third menu item TextView and print the text to the logs

    }
}