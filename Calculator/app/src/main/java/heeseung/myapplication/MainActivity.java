package heeseung.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String text = "";
    Boolean isNum = true;
    TextView text1;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initButton();
        initTextView();
    }
    private void initTextView(){
        text1 = findViewById(R.id.TextViewItem1);
        result = findViewById(R.id.TextViewItem2);
    }
    private View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.Button1:
                    isNum = true;
                    text = text + "1";
                    break;
                case R.id.Button2:
                    isNum = true;
                    text = text + "2";
                    break;
                case R.id.Button3:
                    isNum = true;
                    text = text + "3";
                    break;
                case R.id.Button4:
                    isNum = true;
                    text = text + "4";
                    break;
                case R.id.Button5:
                    isNum = true;
                    text = text + "5";
                    break;
                case R.id.Button6:
                    isNum = true;
                    text = text + "6";
                    break;
                case R.id.Button7:
                    isNum = true;
                    text = text + "7";
                    break;
                case R.id.Button8:
                    isNum = true;
                    text = text + "8";
                    break;
                case R.id.Button9:
                    isNum = true;
                    text = text + "9";
                    break;
                case R.id.Button0:
                    isNum = true;
                    text = text + "0";
                    break;
                case R.id.ButtonAdd:
                    isNum = false;
                    text = text + "+";
                    break;
                case R.id.ButtonMul:
                    isNum = false;
                    text = text + "*";
                    break;
                case R.id.ButtonDiv:
                    isNum = false;
                    text = text + "/";
                    break;
                case R.id.ButtonMi:
                    isNum = false;
                    text = text + "-";
                    break;
                case R.id.ButtonEnt:
                    break;
            }
            text1.setText(text);
            if(isNum){

            }
        }
    };
    private void initButton(){
        Button button1 = findViewById(R.id.Button1);
        button1.setOnClickListener(mOnClickListener);

        Button button2 = findViewById(R.id.Button2);
        button2.setOnClickListener(mOnClickListener);

        Button button3 = findViewById(R.id.Button3);
        button3.setOnClickListener(mOnClickListener);

        Button button4 = findViewById(R.id.Button4);
        button4.setOnClickListener(mOnClickListener);

        Button button5 = findViewById(R.id.Button5);
        button5.setOnClickListener(mOnClickListener);

        Button button6 = findViewById(R.id.Button6);
        button6.setOnClickListener(mOnClickListener);

        Button button7 = findViewById(R.id.Button7);
        button7.setOnClickListener(mOnClickListener);

        Button button8 = findViewById(R.id.Button8);
        button8.setOnClickListener(mOnClickListener);

        Button button9 = findViewById(R.id.Button9);
        button9.setOnClickListener(mOnClickListener);

        Button button0 = findViewById(R.id.Button0);
        button0.setOnClickListener(mOnClickListener);

        Button buttonAdd = findViewById(R.id.ButtonAdd);
        buttonAdd.setOnClickListener(mOnClickListener);

        Button buttonMul = findViewById(R.id.ButtonMul);
        buttonMul.setOnClickListener(mOnClickListener);

        Button buttonDiv = findViewById(R.id.ButtonDiv);
        buttonDiv.setOnClickListener(mOnClickListener);

        Button buttonMi = findViewById(R.id.ButtonMi);
        buttonMi.setOnClickListener(mOnClickListener);

        Button buttonEnt = findViewById(R.id.ButtonEnt);
        buttonEnt.setOnClickListener(mOnClickListener);
    }
}
