package View;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lim_physicscalculator.R;

public class RectangleActivity extends AppCompatActivity implements View.OnClickListener {

    EditText txtinput, txtinput2;
    double var1, var2, ans;
    TextView txtanswer;
    Button btncalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rhombus);//nabaliktad nako ang rectangle and rhombus
        enableFullscreen();
        btncalc = findViewById(R.id.btncalc);
        txtinput = findViewById(R.id.var1);
        txtinput2 = findViewById(R.id.var2);
        txtanswer = findViewById(R.id.ans);
        btncalc.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        var1 = Double.parseDouble(txtinput.getText().toString());
        var2 = Double.parseDouble(txtinput2.getText().toString());
        ans = var1 * var2;
        txtanswer.setText("The area of the rectangle is " + ans);
    }
    private void enableFullscreen() {
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE |
                        View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION |
                        View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN |
                        View.SYSTEM_UI_FLAG_FULLSCREEN |
                        View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY |
                        View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
        );
    }
}
