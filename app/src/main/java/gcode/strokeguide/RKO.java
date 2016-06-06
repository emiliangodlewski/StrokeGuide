package gcode.strokeguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RKO extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rko);
    }

    public void goToStartFromRKO(View view) {
        Intent myIntent = new Intent(RKO.this, MainActivity.class);
        RKO.this.startActivity(myIntent);
    }
}
