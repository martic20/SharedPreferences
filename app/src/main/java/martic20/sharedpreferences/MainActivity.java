package martic20.sharedpreferences;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private SharedPreferences pref ;
    private EditText name;
    private EditText mail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pref=getSharedPreferences("Dades",MODE_PRIVATE);

        Button submit = (Button) findViewById(R.id.submit);
         name = (EditText) findViewById(R.id.namw);
         mail = (EditText) findViewById(R.id.mail);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("name",name.getText().toString());
                editor.putString("mail",mail.getText().toString());
                editor.commit();
                startActivity(new Intent(MainActivity.this,Personal.class));
            }
        });


    }
    @Override
    protected void onStop() {
        super.onStop();

    }


}
