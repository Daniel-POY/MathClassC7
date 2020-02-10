package jugar.mcm.edu.ph.mathclassc7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    String choice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText callDoubleOne = findViewById(R.id.inDoubleOne);
        final EditText callDoubleTwo = findViewById(R.id.inDoubleTwo);
        final EditText callIntOne = findViewById(R.id.inIntOne);
        final EditText callIntTwo = findViewById(R.id.inIntTwo);
        final EditText callName = findViewById(R.id.inName);

        Button callButtonNext = findViewById(R.id.buttonNext);
        final Spinner callSpinner = findViewById(R.id.choiceSpinner);

        callSpinner.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        choice = callSpinner.getSelectedItem().toString();


                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                }
        );

        callButtonNext.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        final String doubleOneString =String.valueOf(callDoubleOne.getText());
                        final String doubleTwoString = String.valueOf(callDoubleTwo.getText());
                        final String intOneString = String.valueOf(callIntOne.getText());
                        final String intTwoString = String.valueOf(callIntTwo.getText());
                        final String nameString = String.valueOf(callName.getText());

                        Intent i = new Intent(MainActivity.this, SecondActivity.class);
                        i.putExtra("callDoubleOne", doubleOneString);
                        i.putExtra("callDoubleTwo", doubleTwoString);
                        i.putExtra("callIntOne", intOneString);
                        i.putExtra("callIntTwo", intTwoString);
                        i.putExtra("callName", nameString);
                        i.putExtra("callChoice", choice);


                        startActivity(i);
                    }
                }
        );
    }
}

