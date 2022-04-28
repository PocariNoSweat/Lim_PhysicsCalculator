package View;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lim_physicscalculator.R;

public class ConeActivity extends AppCompatActivity implements View.OnClickListener {
    EditText txtradius, txtheight;
    double var1, var2 ,ans;
    TextView txtanswer;
    Button btncalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        enableFullscreen();
        setContentView(R.layout.activity_cone);
        btncalc = findViewById(R.id.calc);
        txtradius = findViewById(R.id.var1);
        txtheight = findViewById(R.id.var2);
        txtanswer = findViewById(R.id.answer);
        btncalc.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        var1 = Double.parseDouble(txtradius.getText().toString());
        var2 = Double.parseDouble(txtheight.getText().toString());
        ans = Math.PI* var1 *var1* var2;
        txtanswer.setText("The volume of the cone is " + ans);
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
