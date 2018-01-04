package plus.demo.com.pickzy_interview.startup;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.ProgressBar;

import plus.demo.com.pickzy_interview.datadisplay.MainActivity;


public class Splash extends AppCompatActivity {
    private final int SPLASH_DISPLAY_LENGTH = 1000;

    private ImageView mLogo;
    private ProgressBar mProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        initView();
    }

    private void initView() {
        mLogo = (ImageView) findViewById(R.id.logo);
        mProgressBar = (ProgressBar) findViewById(R.id.progressBar);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent = new Intent(Splash.this, MainActivity.class);
                Splash.this.startActivity(mainIntent);
                Splash.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}
