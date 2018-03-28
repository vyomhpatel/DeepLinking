package b12app.vyom.com.deeplinking;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Redirect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_redirect);
        TextView tvRedirect = findViewById(R.id.tvRedirect);

        Intent intent = getIntent();
        Uri uri = intent.getData();
    }
}
