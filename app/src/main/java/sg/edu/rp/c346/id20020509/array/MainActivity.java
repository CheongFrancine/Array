package sg.edu.rp.c346.id20020509.array;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    String[] fruits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.tv);

        fruits = new String[3];
        fruits[0] = "apple";
        fruits[1] = "banana";
        fruits[2] = "cherry";

        String strText = "Fruits\n";
        strText += "=====\n";

        for (int i = 0; i < fruits.length; i++) {
            strText += fruits[i] + "\n";
        }

        tv.setText(strText);
    }
}