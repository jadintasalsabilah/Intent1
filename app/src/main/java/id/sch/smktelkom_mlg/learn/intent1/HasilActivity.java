package id.sch.smktelkom_mlg.learn.intent1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class HasilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        findViewById(R.id.buttonHitung).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
