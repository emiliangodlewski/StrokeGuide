package gcode.strokeguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Responding extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_responding);
    }

    public void goToStart(View view) {
        Intent myIntent = new Intent(Responding.this, MainActivity.class);
        Responding.this.startActivity(myIntent);
    }
}
