package com.mycompany.myapp;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;

public class MainActivity extends Activity 
{
	EditText edit;
	TextView text;
	String result ="";
	int number = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		edit = findViewById(R.id.mainEditText1);
		text = findViewById(R.id.mainTextView1);
		text.setText("");
    }
	
	public void onBtnClick(View view){
		try{
			number=(Integer.parseInt(edit.getText().toString())/3)+4;
			result="The approximate temperature outside is "+number+" degrees Celcius.";
			text.setText(result);
		}catch(Exception e){
			
		}
		
	}
	
}
