package View;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lim_physicscalculator.R;

public class SphereActivity extends AppCompatActivity implements View.OnClickListener {

    EditText txtradius;
    double var1, ans;
    TextView txtanswer;
    Button btncalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        enableFullscreen();
        setContentView(R.layout.activity_sphere);
        btncalc = findViewById(R.id.btncalc);
        txtradius = findViewById(R.id.var1);
        txtanswer = findViewById(R.id.ans);
        btncalc.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        var1 = Double.parseDouble(txtradius.getText().toString());
        ans = 1.33 * var1 * var1 * var1 * Math.PI;
        txtanswer.setText("The volume of the sphere is " + ans);
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
