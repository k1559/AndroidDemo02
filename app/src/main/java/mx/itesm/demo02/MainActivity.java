package mx.itesm.demo02;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private Button button1;
    private Button buttonTwo;
    private Button buttonThree;
    private TextView edittext2;
    private EditText editTextMgr;
    private String myString;
    private boolean isErase = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button);
        buttonTwo = (Button) findViewById(R.id.buttonTwo);
        buttonThree = (Button) findViewById(R.id.buttonThree);
        edittext2 = findViewById(R.id.textView2);
        editTextMgr = findViewById(R.id.editText);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent1 = new Intent(MainActivity.this, ActivityTwo.class);
                startActivity(intent1);
            }
        });

        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent2 = new Intent(MainActivity.this, ActivityThree.class);
                startActivity(intent2);
            }
        });

        buttonThree.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                edittext2.setText(editTextMgr.getText().toString());


            }



        });
    }
}