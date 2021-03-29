package kakao.woo95.simplephone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7 ,btn8, btn9;
    private Button btnCall;
    public TextView numinsText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numinsText = (TextView)findViewById(R.id.numinstext);

        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);
        btn7 = (Button)findViewById(R.id.btn7);
        btn8 = (Button)findViewById(R.id.btn8);
        btn9 = (Button)findViewById(R.id.btn9);

        btn1.setOnClickListener(v -> {
            numinsText.setText(numinsText.getText().toString()+"1");
        });
        btn2.setOnClickListener(v -> {
            numinsText.setText(numinsText.getText().toString()+"2");
        });
        btn3.setOnClickListener(v -> {
            numinsText.setText(numinsText.getText().toString()+"3");
        });
        btn4.setOnClickListener(v -> {
            numinsText.setText(numinsText.getText().toString()+"4");
        });
        btn5.setOnClickListener(v -> {
            numinsText.setText(numinsText.getText().toString()+"5");
        });
        btn6.setOnClickListener(v -> {
            numinsText.setText(numinsText.getText().toString()+"6");
        });
        btn7.setOnClickListener(v -> {
            numinsText.setText(numinsText.getText().toString()+"7");
        });
        btn8.setOnClickListener(v -> {
            numinsText.setText(numinsText.getText().toString()+"8");
        });
        btn9.setOnClickListener(v -> {
            numinsText.setText(numinsText.getText().toString()+"9");
        });

        btnCall = (Button)findViewById(R.id.btncall);

        btnCall.setOnClickListener(v -> {
            String num = numinsText.getText().toString();
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:"+num));
            startActivity(intent);
        });
    }
}