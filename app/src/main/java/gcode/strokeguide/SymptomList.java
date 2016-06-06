package gcode.strokeguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SymptomList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptom_list);
    }

    public void goToMainActivity(View view) {
        Intent myIntent = new Intent(SymptomList.this, MainActivity.class);
        SymptomList.this.startActivity(myIntent);
    }

    public void goToInstructionPageOne(View view) {
        Intent myIntent = new Intent(SymptomList.this, InstructionPageOne.class);
        SymptomList.this.startActivity(myIntent);
    }
}
