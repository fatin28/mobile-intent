package id.ac.polinema.intent;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ExplicitIntentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent);
    }

    private EditText nameInput;
    private TextView outputText;


    public void submit(View view) {
        EditText nameInput = (EditText) findViewById(R.id.input_name);
        TextView outputText= (TextView) findViewById(R.id.text_output);
        outputText.setText("Hallo "+ nameInput.getText());
    }
}
