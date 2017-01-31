package com.example.thegoodd.comp3025_w2017_assignment1_calculator;
/*
Project: COMP3025 Assignment 1 Calculator app
Author: D'Arcey Taylor - 200302660
Date: Jan 25 2017
Description: To create a mobile app that will perform simple calculations and display them to a user
 */
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class calculator extends Activity implements View.OnClickListener {

    //variables
    Button one,two,three,four,five,six,seven,eight,nine,zero,addition,subtraction,division,multiplication,clear_everything,clear,equals,decimal,sign,backspace,left_bracket,right_bracket,divisionDouble,squared,squared_root;
    TextView result;
    int value1, value2;
    double value3, value4;
    String operation, answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
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

    //This  is a method where all the calculations will take place
    public void math(){
        //addition
        if(operation.equals("+")){
            value4 = Double.parseDouble(result.getText().toString());
            result.setText("");
            value3 = value3 + value4;
            result.setText(Double.toString(value3));
        }
        //subtraction
        else if(operation.equals("-")){
            value4 = Double.parseDouble(result.getText().toString());
            result.setText("");
            value3 = value3 - value4;
            result.setText(Double.toString(value3));
        }
        //multiplication
        else if(operation.equals("x")){
            value4 = Double.parseDouble(result.getText().toString());
            result.setText("");
            value3 = value3 * value4;
            result.setText(Double.toString(value3));
        }
        //division
        else if(operation.equals("/")){
            value4 = Double.parseDouble(result.getText().toString());
            if(value4 == 0.0) {
                result.setTextSize(36);
                result.setText("Cannot Divide by zero");
                value3 = 0;
                value4 = 0;
            }
            else
                result.setText("");
                value3 = value3 / value4;
                result.setText(Double.toString(value3));
        }
    }

    public void onClick(View v){
        //variables
        String string = result.getText().toString();

        //Switch case to determine which button was pressed and stores that value into variables value1 & value2
        //also outputs the value of the button to the screen
        switch (v.getId()){
            case R.id.one:
                if(value4 !=0){
                    value4 = 0;
                    result.setText("");
                }
                else if (string == "0")
                    result.setText(one.getText());
                else
                    result.setText(string + one.getText());
                break;
            case R.id.two:


                if(value4 !=0){
                    value4 = 0;
                    result.setText("");
                }
                else if (string == "0")
                    result.setText(two.getText());
                else
                    result.setText(string + two.getText());
                break;
            case R.id.three:

                 if(value4 !=0){
                    value4 = 0;
                    result.setText("");
                }
                else if (string == "0")
                    result.setText(three.getText());
                else
                    result.setText(string + three.getText());
                break;
            case R.id.four:

                 if(value4 !=0){
                    value4 = 0;
                    result.setText("");
                }
                else if (string == "0")
                    result.setText(four.getText());
                else
                    result.setText(string + four.getText());
                break;
            case R.id.five:

                 if(value4 !=0){
                    value4 = 0;
                    result.setText("");
                }
                else if (string == "0")
                    result.setText(five.getText());
                else
                    result.setText(string + five.getText());
                break;
            case R.id.six:

                 if(value4 !=0){
                    value4 = 0;
                    result.setText("");
                }
                else if (string == "0")
                    result.setText(six.getText());
                else
                    result.setText(string + six.getText());
                break;
            case R.id.seven:

                 if(value4 !=0){
                    value4 = 0;
                    result.setText("");
                }
                else if (string == "0")
                    result.setText(seven.getText());
                else
                    result.setText(string + seven.getText());
                break;
            case R.id.eight:

                 if(value4 !=0){
                    value4 = 0;
                    result.setText("");
                }
                else if (string == "0")
                    result.setText(eight.getText());
                else
                    result.setText(string + eight.getText());
                break;
            case R.id.nine:

                 if(value4 !=0){
                    value4 = 0;
                    result.setText("");
                }
                else if (string == "0")
                    result.setText(nine.getText());
                else
                    result.setText(string + nine.getText());
                break;
            case R.id.zero:

                 if(value4 !=0){
                    value4 = 0;
                    result.setText("");
                }
                else if (string == "0")
                    result.setText(zero.getText());
                else
                    result.setText(string + zero.getText());
                break;

            //clears the most recently input number and sets back to zero
            case R.id.clear:
                if(result.getText().toString() != ""){
                    value3 = Double.parseDouble(result.getText().toString());
                    value4 = 0;
                    result.setText("");
                }
                value4 = 0;
                result.setText("");
                break;
            //clears the entire memory of input numbers
            case R.id.clear_everything:
                //value1 = 0;
                //value2 = 0;
                value3 = 0;
                value4 = 0;
                result.setText("");
                break;

            case R.id.addition:
                operation = "+";

                if(value3 == 0){
                    value3 = Double.parseDouble(result.getText().toString());
                    result.setText("");
                }
                else if(value4 != 0){
                    value4 = 0;
                    result.setText("");
                }
                else{
                    value4 = Double.parseDouble(result.getText().toString());
                    result.setText("");
                    value3 = value3 + value4;
                    if(value3 < 0)
                        result.setText("-" + value3);
                    else
                    result.setText(Double.toString(value3));
                }
                break;

            case R.id.subtraction:
                operation = "-";

                if(value3 == 0){
                    value3 = Double.parseDouble(result.getText().toString());
                    result.setText("");
                }
                else if(value4 != 0){
                    value4 = 0;
                    result.setText("");
                }
                else{
                    value4 = Double.parseDouble(result.getText().toString());
                    result.setText("");
                    value3 = value3 - value4;
                    if(value3 < 0)
                        result.setText("-" + Double.toString(value3));
                    else
                    result.setText(Double.toString(value3));
                }
                break;

            case R.id.multiplication:
                operation = "x";

                if(value3 == 0){
                    value3 = Double.parseDouble(result.getText().toString());
                    result.setText("");
                }
                else if(value4 != 0){
                    value4 = 0;
                    result.setText("");
                }
                else{
                    value4 = Double.parseDouble(result.getText().toString());
                    result.setText("");
                    value3 = value3 * value4;
                    if(value3 < 0)
                        result.setText("-" + Double.toString(value3));
                    else
                    result.setText(Double.toString(value3));
                }
                break;

            case R.id.division:
                operation = "/";

                if(value3 == 0){
                    value3 = Double.parseDouble(result.getText().toString());
                    result.setText("");
                }
                else if(value4 != 0){
                    value4 = 0;
                    result.setText("");
                }
                else{
                    value4 = Double.parseDouble(result.getText().toString());
                    result.setText("");
                    value3 = value3 - value4;
                    if(value3 < 0)
                        result.setText("-" + Double.toString(value3));
                    else
                        result.setText(Double.toString(value3));
                }
                break;

            //displays the solution that was computed
            case R.id.equals:
                if(!operation.equals(null)){
                    if(value4 != 0) {
                        if (operation.equals("+")) {
                            result.setText("");
                            result.setText(Double.toString(value3));
                            value3 = Double.parseDouble(result.getText().toString());
                            value4 = 0;
                        }
                        if (operation.equals("-")) {
                            result.setText("");
                            result.setText(Double.toString(value3));
                            answer = result.getText().toString();
                            value3 = 0;
                            value4 = 0;
                        }
                        if (operation.equals("x")) {
                            result.setText("");
                            result.setText(Double.toString(value3));
                            value3 = Double.parseDouble(result.getText().toString());
                            value4 = 0;
                        }
                        if (operation.equals("/")) {
                            result.setText("");
                            result.setText(Double.toString(value3));
                            value3 = Double.parseDouble(result.getText().toString());
                            value4 = 0;
                        }
                    }
                    else
                        math();
                }
                break;
            //deletes characters on the screen one by one until there is only one digit displaying, after that the screen will be reset to "0"
            case R.id.backspace:
                String deletion = result.getText().toString();
                if (deletion.length() > 1){
                    result.setText(deletion.substring(0, deletion.length() - 1));
                }
                else
                    result.setText("0");
                break;
            //adds a decimal to the number
            case R.id.decimal:
                if(result.getText().toString().contains("."))
                    result.setText(result.getText());
                else {
                    if (value4 != 0) {
                        value4 = 0;
                        result.setText("");
                    }
                    else if (result.getText() == "")
                        result.setText("0" + decimal.getText());
                    else
                        result.setText(string + decimal.getText());
                }
                break;
            //adds a negative to the value
            case R.id.sign:
                if (value4 != 0) {
                    value4 = 0;
                    result.setText("");
                }
                else if(Double.parseDouble(result.getText().toString()) > 0){
                    result.setText("-" + string);
                }
                else
                result.getText();
            break;
            default:
                break;
        }

        if(result.getText() == "")
            result.setText("0");

    }

}
