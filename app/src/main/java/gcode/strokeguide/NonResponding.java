package gcode.strokeguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class NonResponding extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_non_responding);
    }

    public void goToRKO(View view) {
        Intent myIntent = new Intent(NonResponding.this, RKO.class);
        NonResponding.this.startActivity(myIntent);
    }

    public void goToBreathing(View view) {
        Intent myIntent = new Intent(NonResponding.this, Responding.class);
        NonResponding.this.startActivity(myIntent);
    }
}
