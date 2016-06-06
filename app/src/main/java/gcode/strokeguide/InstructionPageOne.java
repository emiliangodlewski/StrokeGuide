package gcode.strokeguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class InstructionPageOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instruction_page_one);
    }

    public void goToInstructionPageTwo(View view) {
        Intent myIntent = new Intent(InstructionPageOne.this, InstructionPageTwo.class);
        InstructionPageOne.this.startActivity(myIntent);
    }
}
