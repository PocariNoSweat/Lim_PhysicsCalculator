package View;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lim_physicscalculator.R;

public class VolumeActivity extends AppCompatActivity implements View.OnClickListener {

    Button cube, sphere, prism, cone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        enableFullscreen();
        setContentView(R.layout.activity_volume);

        cube = findViewById(R.id.cube);
        cube.setOnClickListener(this);

        sphere = findViewById(R.id.sphere);
        sphere.setOnClickListener(this);

        prism = findViewById(R.id.prism);
        prism.setOnClickListener(this);

        cone = findViewById(R.id.cone);
        cone.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.cube:
                startActivity(new Intent(VolumeActivity.this, CubeActivity.class));
                break;
            case R.id.sphere:
                startActivity(new Intent(VolumeActivity.this, SphereActivity.class));
                break;
            case R.id.prism:
                startActivity(new Intent(VolumeActivity.this, PrismActivity.class));
                break;
            case R.id.cone:
                startActivity(new Intent(VolumeActivity.this, ConeActivity.class));
                break;
        }
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
