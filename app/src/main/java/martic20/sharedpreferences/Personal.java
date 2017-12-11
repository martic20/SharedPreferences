package martic20.sharedpreferences;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Personal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal);

        SharedPreferences pref = getSharedPreferences("Dades",MODE_PRIVATE);
        String str_name = pref.getString("name","undefined");
        String str_mail = pref.getString("mail","undefined");

        TextView name = (TextView) findViewById(R.id.name);
        TextView mail = (TextView) findViewById(R.id.mail);

        name.setText(str_name);
        mail.setText(str_mail);
    }
}
