package sg.edu.rp.c346.id21044912.democheckboxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    CheckBox cbEnabled;
    Button btnCheck;
    TextView tvshow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbEnabled = findViewById(R.id.checkBoxDiscount);
        btnCheck = findViewById(R.id.buttonCheck);
        tvshow = findViewById(R.id.textResult);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String there = "";
                if (cbEnabled.isChecked()){
                    there = "given";
                } else {
                    there = "not given";
                }

                Toast.makeText(MainActivity.this, "Button Click", Toast.LENGTH_LONG).show();
                String display = "The discount is "+there;
                tvshow.setText(display);
            }
        });
    }
}