package com.a1.larika.php_mysql;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText et1,et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
et1= (EditText) findViewById(R.id.editText);
        et2= (EditText) findViewById(R.id.editText2);
    }

    public void login(View view) {
   String un=et1.getText().toString();
        String pd=et2.getText().toString();
        String type="signup";
        Bw bw=new Bw(this);
        bw.execute(type,un,pd);
    }
//only for testing
    public void testUpload(){
        int i=2+1;
    }
}
