package gcode.strokeguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToSymptomsList(View view) {
        Intent myIntent = new Intent(MainActivity.this, SymptomList.class);
        MainActivity.this.startActivity(myIntent);
    }
}
