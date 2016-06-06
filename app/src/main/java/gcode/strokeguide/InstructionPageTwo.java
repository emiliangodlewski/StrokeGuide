package gcode.strokeguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class InstructionPageTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instruction_page_two);
    }

    public void goToResponding(View view) {
        Intent myIntent = new Intent(InstructionPageTwo.this, Responding.class);
        InstructionPageTwo.this.startActivity(myIntent);
    }

    public void goToNonResponding(View view) {
        Intent myIntent = new Intent(InstructionPageTwo.this, NonResponding.class);
        InstructionPageTwo.this.startActivity(myIntent);
    }
}
