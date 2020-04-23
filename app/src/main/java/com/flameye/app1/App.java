package com.flameye.app1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class App extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.flameye.app1.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app);

        Button okButton  = (Button) findViewById(R.id.button);
//        okButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });





    }
    public void sendMessage(View view) {

        Intent intent = new Intent(this,CircularSeekbarActivity.class);
        TextView editText = (TextView) findViewById(R.id.textView2);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

    }

}
