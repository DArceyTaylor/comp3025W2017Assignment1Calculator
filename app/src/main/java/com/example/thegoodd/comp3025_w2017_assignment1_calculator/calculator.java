package com.example.thegoodd.comp3025_w2017_assignment1_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class calculator extends AppCompatActivity implements View.OnClickListener {

    Button one,two,three,four,five,six,seven,eight,nine,zero,addition,subtraction,division,multiplication,clear_everything,clear,equals,decimal,backspace,sign,left_bracket,right_bracket,pi,squared,squared_root;
    TextView result;
    int value1, value2;
    String answer, operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        //Buttons
        zero = (Button) findViewById(R.id.zero);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        addition = (Button) findViewById(R.id.addition);
        subtraction = (Button) findViewById(R.id.subtraction);
        division = (Button) findViewById(R.id.division);
        multiplication = (Button) findViewById(R.id.multiplication);
        clear_everything = (Button) findViewById(R.id.clear_everything);
        clear = (Button) findViewById(R.id.clear);
        equals = (Button) findViewById(R.id.equals);
        decimal = (Button) findViewById(R.id.decimal);
        backspace = (Button) findViewById(R.id.backspace);
        sign = (Button) findViewById(R.id.sign);
        /*
        left_bracket = (Button) findViewById(R.id.left_bracket);
        right_bracket = (Button) findViewById(R.id.right_bracket);
        pi = (Button) findViewById(R.id.pi);
        squared = (Button) findViewById(R.id.squared);
        squared_root = (Button) findViewById(R.id.squared_root);
*/
        //Text Views
        result = (TextView) findViewById(R.id.result);

        //On Click Listeners
        zero.setOnClickListener(this);
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        addition.setOnClickListener(this);
        subtraction.setOnClickListener(this);
        division.setOnClickListener(this);
        multiplication.setOnClickListener(this);
        clear_everything.setOnClickListener(this);
        clear.setOnClickListener(this);
        equals.setOnClickListener(this);
        decimal.setOnClickListener(this);
        backspace.setOnClickListener(this);
        sign.setOnClickListener(this);
        /*
        left_bracket.setOnClickListener(this);
        right_bracket.setOnClickListener(this);
        pi.setOnClickListener(this);
        squared.setOnClickListener(this);
        squared_root.setOnClickListener(this);
*/

        result.setText("0");
    }
    public void math(){
        if(operation.equals("+")){
            value2 = Integer.parseInt(result.getText().toString());
            result.setText("");
            value1 = value1 + value2;
            result.setText(Integer.toString(value1));
        }
        else if(operation.equals("-")){
            value2 = Integer.parseInt(result.getText().toString());
            result.setText("");
            value1 = value1 - value2;
            result.setText(Integer.toString(value1));
        }
        else if(operation.equals("x")){
            value2 = Integer.parseInt(result.getText().toString());
            result.setText("");
            value1 = value1 * value2;
            result.setText(Integer.toString(value1));
        }
        else if(operation.equals("/")){
            value2 = Integer.parseInt(result.getText().toString());
            result.setText("");
            value1 = value1 / value2;
            result.setText(Integer.toString(value1));
        }
    }
    public void onClick(View v){

        String string = result.getText().toString();

        switch (v.getId()){
            case R.id.one:
                if(value2 !=0){
                    value2 = 0;
                    result.setText("");
                }
                if (string == "0")
                    result.setText(one.getText());
                else
                    result.setText(string + one.getText());
                break;
            case R.id.two:
                if(value2 !=0){
                    value2 = 0;
                    result.setText("");
                }
                if (string == "0")
                    result.setText(two.getText());
                else
                    result.setText(string + two.getText());
                break;
            case R.id.three:
                if(value2 !=0){
                    value2 = 0;
                    result.setText("");
                }
                if (string == "0")
                    result.setText(three.getText());
                else
                    result.setText(string + three.getText());
                break;
            case R.id.four:
                if(value2 !=0){
                    value2 = 0;
                    result.setText("");
                }
                if (string == "0")
                    result.setText(four.getText());
                else
                    result.setText(string + four.getText());
                break;
            case R.id.five:
                if(value2 !=0){
                    value2 = 0;
                    result.setText("");
                }
                if (string == "0")
                    result.setText(five.getText());
                else
                    result.setText(string + five.getText());
                break;
            case R.id.six:
                if(value2 !=0){
                    value2 = 0;
                    result.setText("");
                }
                if (string == "0")
                    result.setText(six.getText());
                else
                    result.setText(string + six.getText());
                break;
            case R.id.seven:
                if(value2 !=0){
                    value2 = 0;
                    result.setText("");
                }
                if (string == "0")
                    result.setText(seven.getText());
                else
                    result.setText(string + seven.getText());
                break;
            case R.id.eight:
                if(value2 !=0){
                    value2 = 0;
                    result.setText("");
                }
                if (string == "0")
                    result.setText(eight.getText());
                else
                    result.setText(string + eight.getText());
                break;
            case R.id.nine:
                if(value2 !=0){
                    value2 = 0;
                    result.setText("");
                }
                if (string == "0")
                    result.setText(nine.getText());
                else
                    result.setText(string + nine.getText());
                break;
            case R.id.zero:
                if(value2 !=0){
                    value2 = 0;
                    result.setText("");
                }
                if (string == "0")
                    result.setText(zero.getText());
                else
                    result.setText(string + zero.getText());
                break;
            case R.id.clear:
                value1 = 0;
                value2 = 0;
                result.setText("");
            case R.id.clear_everything:
                result.setText("");
                break;
            case R.id.addition:
                operation = "+";

                if(value1 == 0){
                    value1 = Integer.parseInt(result.getText().toString());
                    result.setText("");
                }
                else if(value2 != 0){
                    value2 = 0;
                    result.setText("");
                }
                else{
                    value2 = Integer.parseInt(result.getText().toString());
                    result.setText("");
                    value1 = value1 + value2;
                    result.setText(value1);
                }
                break;
            case R.id.subtraction:
                operation = "-";

                if(value1 == 0){
                    value1 = Integer.parseInt(result.getText().toString());
                    result.setText("");
                }
                else if(value2 != 0){
                    value2 = 0;
                    result.setText("");
                }
                else{
                    value2 = Integer.parseInt(result.getText().toString());
                    result.setText("");
                    value1 = value1 - value2;
                    result.setText(value1);
                }
                break;
            case R.id.multiplication:
                operation = "x";

                if(value1 == 0){
                    value1 = Integer.parseInt(result.getText().toString());
                    result.setText("");
                }
                else if(value2 != 0){
                    value2 = 0;
                    result.setText("");
                }
                else{
                    value2 = Integer.parseInt(result.getText().toString());
                    result.setText("");
                    value1 = value1 * value2;
                    result.setText(value1);
                }
                break;
            case R.id.division:
                operation = "/";

                if(value1 == 0){
                    value1 = Integer.parseInt(result.getText().toString());
                    result.setText("");
                }
                else if(value2 != 0){
                    value2 = 0;
                    result.setText("");
                }
                else{
                    value2 = Integer.parseInt(result.getText().toString());
                    result.setText("");
                    value1 = value1 / value2;
                    result.setText(value1);
                }
                break;
            case R.id.equals:
                if(!operation.equals(null)){
                    if(value2 != 0) {
                        if (operation.equals("+")) {
                            result.setText("");
                            result.setText(value1);
                        }
                        if (operation.equals("-")) {
                            result.setText("");
                            result.setText(value1);
                        }
                        if (operation.equals("x")) {
                            result.setText("");
                            result.setText(value1);
                        }
                        if (operation.equals("/")) {
                            result.setText("");
                            result.setText(value1);
                        }
                    }
                    else
                        math();
                }
                break;
            case R.id.backspace:
                String deletion = result.getText().toString();
                if (deletion.length() > 0){
                    result.setText(deletion.substring(0, deletion.length() - 1));
                }
                break;

            default:
                break;
        }

        if(result.getText() == "")
            result.setText("0");

    }

}
