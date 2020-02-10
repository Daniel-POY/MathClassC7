package jugar.mcm.edu.ph.mathclassc7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button callButtonBack = findViewById(R.id.buttonBack);

        String callDoubleOneString = getIntent().getStringExtra("callDoubleOne");
        String callDoubleTwoString = getIntent().getStringExtra("callDoubleTwo");
        String callIntOneString = getIntent().getStringExtra("callIntOne");
        String callIntTwoString = getIntent().getStringExtra("callIntTwo");
        String callNameString = getIntent().getStringExtra("callName");
        String callChoice = getIntent().getStringExtra("callChoice");

        double doubleOneFinal = Double.parseDouble(callDoubleOneString);
        double doubleTwoFinal = Double.parseDouble(callDoubleTwoString);
        int intOneFinal = Integer.parseInt(callIntOneString);
        int intTwoFinal = Integer.parseInt(callIntTwoString);

        TextView callOutputOne = findViewById(R.id.outputOne);
        TextView callOutputTwo = findViewById(R.id.outputTwo);
        TextView callOutputThree = findViewById(R.id.outputThree);
        TextView callOutputFour = findViewById(R.id.outputFour);


        Math newMath = new Math(callChoice, doubleOneFinal, doubleTwoFinal);
        Math newMath2 = new Math(intOneFinal, intTwoFinal);
        Math newMath3 = new Math(callNameString);

        if (callChoice.equals("a")) {
            callOutputOne.setText("Division");
            callOutputTwo.setText(String.valueOf(newMath.firstDouble/newMath.secondDouble));
        } else if (callChoice.equals("b")) {
            callOutputOne.setText("Multiplication");
            callOutputTwo.setText(String.valueOf(newMath.firstDouble*newMath.secondDouble));
        }

        callOutputThree.setText(String.valueOf(newMath2.firstInt+newMath2.secondInt));
        callOutputFour.setText(newMath3.firstString);

        callButtonBack.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i2 = new Intent(SecondActivity.this, MainActivity.class);
                        startActivity(i2);
                    }
                }
        );
    }
}
