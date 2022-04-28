package View;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lim_physicscalculator.R;

public class AreaActivity extends AppCompatActivity implements View.OnClickListener{

    Button square, rectangle, triangle, rhombus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        enableFullscreen();
        setContentView(R.layout.activity_area);

        square = findViewById(R.id.square);//done
        square.setOnClickListener(this);

        rectangle = findViewById(R.id.rectangle);//done
        rectangle.setOnClickListener(this);

        triangle = findViewById(R.id.triangle);//done
        triangle.setOnClickListener(this);

        rhombus = findViewById(R.id.rhombus);//done
        rhombus.setOnClickListener(this);
    }
    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.square:
                startActivity(new Intent(AreaActivity.this, SquareActivity.class));
                break;
            case R.id.triangle:
                startActivity(new Intent(AreaActivity.this, TriangleActivity.class));
                break;
            case R.id.rectangle:
                startActivity(new Intent(AreaActivity.this, RectangleActivity.class));
                break;
            case R.id.rhombus:
                startActivity(new Intent(AreaActivity.this, RhombusActivity.class));
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
