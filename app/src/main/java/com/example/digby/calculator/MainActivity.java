package com.example.digby.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    // ===============================================
    // variables
    // ===============================================

    //===Views===
    TextView displayTop;
    TextView displayBottom;

    //===Math Objects===
    static double firstNum;
    static double secondNum;
    static Double finalAnswer;
    final int MULTI = 1;
    final int DIV = 2;
    final int SUB = 3;
    final int ADD = 4;
    static int opChecker = 0;

    //===Math Symbols===
    final String TIMES_OP = "\u00D7";
    final String DIVIDE_OP = "\u00f7";
    final String SQUARE_OP = "\u00B2";
    final String SQUAREROOT_OP = "\u221a";
    final String PI = "3.14159265";

    //===Error Messages===
    final String TOO_MANY = "too many characters";
    final String NUM_FIRST = "enter number first";
    final String SEC_NUM_FIRST = "enter next num first";
    final String LOG = "MainActivity.CheckThis";

    //===Format===
    DecimalFormat format;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(LOG, "onCreate Completed");
        format = new DecimalFormat("###,###,###,###.########");
        displayTop = (TextView)findViewById(R.id.display_TextView);// active calc area
        displayBottom = (TextView)findViewById(R.id.display_CalcTextView);// past values
    }

    // ===============================================
    // functions to handel the number buttons
    // ===============================================
    public void clickedNumBtn(View view)
    {
        int numBtnClicked = view.getId();
        switch (numBtnClicked)
        {
//=============Button Zero===
            case R.id.btn_Num_0: if (displayTop.getText().toString().equals("+")
                    || displayTop.getText().toString().equals("-")
                    || displayTop.getText().toString().equals(TIMES_OP)
                    || displayTop.getText().toString().equals(DIVIDE_OP))
            {
                displayBottom.append(displayTop.getText().toString());
                displayTop.setText("0");
            }else
            displayTop.append("0");

                if (displayTop.getText().toString().length() > 10)
                {
                    displayBottom.setText(TOO_MANY);
                }
                Log.d(LOG, "Button Zero Pressed");
                break;

//=============Button One===
            case R.id.btn_Num_1: if (displayTop.getText().toString().equals("+")
                    || displayTop.getText().toString().equals("-")
                    || displayTop.getText().toString().equals(TIMES_OP)
                    || displayTop.getText().toString().equals(DIVIDE_OP))
            {
                displayBottom.append(displayTop.getText().toString());
                displayTop.setText("1");
            }else
                displayTop.append("1");

                if (displayTop.getText().toString().length() > 10)
                {
                    displayBottom.setText(TOO_MANY);
                }
                Log.d(LOG, "Button One Pressed");
                break;

//=============Button Two===
            case R.id.btn_Num_2: if (displayTop.getText().toString().equals("+")
                    || displayTop.getText().toString().equals("-")
                    || displayTop.getText().toString().equals(TIMES_OP)
                    || displayTop.getText().toString().equals(DIVIDE_OP))
            {
                displayBottom.append(displayTop.getText().toString());
                displayTop.setText("2");
            }else
                displayTop.append("2");

                if (displayTop.getText().toString().length() > 10)
                {
                    displayBottom.setText(TOO_MANY);
                }
                Log.d(LOG, "Button Two Pressed");
                break;

//=============Button Three===
            case R.id.btn_Num_3: if (displayTop.getText().toString().equals("+")
                    || displayTop.getText().toString().equals("-")
                    || displayTop.getText().toString().equals(TIMES_OP)
                    || displayTop.getText().toString().equals(DIVIDE_OP))
            {
                displayBottom.append(displayTop.getText().toString());
                displayTop.setText("3");
            }else
                displayTop.append("3");

                if (displayTop.getText().toString().length() > 10)
                {
                    displayBottom.setText(TOO_MANY);
                }
                Log.d(LOG, "Button Three Pressed");
                break;

//=============Button Four===
            case R.id.btn_Num_4: if (displayTop.getText().toString().equals("+")
                    || displayTop.getText().toString().equals("-")
                    || displayTop.getText().toString().equals(TIMES_OP)
                    || displayTop.getText().toString().equals(DIVIDE_OP))
            {
                displayBottom.append(displayTop.getText().toString());
                displayTop.setText("4");
            }else
                displayTop.append("4");

                if (displayTop.getText().toString().length() > 10)
                {
                    displayBottom.setText(TOO_MANY);
                }
                Log.d(LOG, "Button Four Pressed");
                break;

//=============Button Five===
            case R.id.btn_Num_5: if (displayTop.getText().toString().equals("+")
                    || displayTop.getText().toString().equals("-")
                    || displayTop.getText().toString().equals(TIMES_OP)
                    || displayTop.getText().toString().equals(DIVIDE_OP))
            {
                displayBottom.append(displayTop.getText().toString());
                displayTop.setText("5");
            }else
                displayTop.append("5");

                if (displayTop.getText().toString().length() > 10)
                {
                    displayBottom.setText(TOO_MANY);
                }
                Log.d(LOG, "Button Five Pressed");
                break;

//=============Button Six===
            case R.id.btn_Num_6: if (displayTop.getText().toString().equals("+")
                    || displayTop.getText().toString().equals("-")
                    || displayTop.getText().toString().equals(TIMES_OP)
                    || displayTop.getText().toString().equals(DIVIDE_OP))
            {
                displayBottom.append(displayTop.getText().toString());
                displayTop.setText("6");
            }else
                displayTop.append("6");

                if (displayTop.getText().toString().length() > 10)
                {
                    displayBottom.setText(TOO_MANY);
                }
                Log.d(LOG, "Button Six Pressed");
                break;

//=============Button Seven===
            case R.id.btn_Num_7:  if (displayTop.getText().toString().equals("+")
                    || displayTop.getText().toString().equals("-")
                    || displayTop.getText().toString().equals(TIMES_OP)
                    || displayTop.getText().toString().equals(DIVIDE_OP))
            {
                displayBottom.append(displayTop.getText().toString());
                displayTop.setText("7");
            }else
                displayTop.append("7");

                if (displayTop.getText().toString().length() > 10)
                {
                    displayBottom.setText(TOO_MANY);
                }
                Log.d(LOG, "Button Seven Pressed");
                break;

//=============Button Eight===
            case R.id.btn_Num_8:  if (displayTop.getText().toString().equals("+")
                    || displayTop.getText().toString().equals("-")
                    || displayTop.getText().toString().equals(TIMES_OP)
                    || displayTop.getText().toString().equals(DIVIDE_OP))
            {
                displayBottom.append(displayTop.getText().toString());
                displayTop.setText("8");
            }else
                displayTop.append("8");

                if (displayTop.getText().toString().length() > 10)
                {
                    displayBottom.setText(TOO_MANY);
                }
                Log.d(LOG, "Button Eight Pressed");
                break;

//=============Button Nine===
            case R.id.btn_Num_9:  if (displayTop.getText().toString().equals("+")
                    || displayTop.getText().toString().equals("-")
                    || displayTop.getText().toString().equals(TIMES_OP)
                    || displayTop.getText().toString().equals(DIVIDE_OP))
            {
                displayBottom.append(displayTop.getText().toString());
                displayTop.setText("9");
            }else
                displayTop.append("9");

                if (displayTop.getText().toString().length() > 10)
                {
                    displayBottom.setText(TOO_MANY);
                }
                Log.d(LOG, "Button Nine Pressed");
                break;

//=============Button Pi===
            case R.id.btn_Op_Pi:
                if (displayTop.getText().toString().equals("+")
                    || displayTop.getText().toString().equals("-")
                    || displayTop.getText().toString().equals(TIMES_OP)
                    || displayTop.getText().toString().equals(DIVIDE_OP))
            {
                displayBottom.append(displayTop.getText().toString());
                displayTop.setText(PI);
            }else
                displayTop.append(PI);

                if (displayTop.getText().toString().length() > 10)
                {
                    displayBottom.setText(TOO_MANY);
                }
                Log.d(LOG, "Button Pi Pressed");
                break;
        }
    }

    // ===============================================
    // functions to handel the operator buttons
    // ===============================================
    public void clickedOpBtn(View view)
    {
        int opBtnClicked = view.getId();
        switch (opBtnClicked)
        {
//=============Button Addition===
            case R.id.btn_Op_Add:
                try {
                    firstNum = Integer.parseInt(displayTop.getText().toString());
                    displayBottom.setText(displayTop.getText().toString());
                    displayTop.setText("+");
                    opChecker = ADD;
                } catch (java.lang.NumberFormatException e ){
                    displayBottom.setText(NUM_FIRST);
                }
                Log.d(LOG, "Button Add Pressed");
                break;

//=============Button Subtract===
            case R.id.btn_Op_Sub:
                try {
                    firstNum = Integer.parseInt(displayTop.getText().toString());
                    displayBottom.setText(displayTop.getText().toString());
                    displayTop.setText("-");
                    opChecker = ADD;
                } catch (java.lang.NumberFormatException e ){
                    displayBottom.setText(NUM_FIRST);
                }
                opChecker = SUB;
                Log.d(LOG, "Button Subtract Pressed");
                break;

//=============Button Multiply===
            case R.id.btn_Op_Mul:
                try {
                    firstNum = Integer.parseInt(displayTop.getText().toString());
                    displayBottom.setText(displayTop.getText().toString());
                    displayTop.setText(TIMES_OP);
                    opChecker = ADD;
                } catch (java.lang.NumberFormatException e ){
                    displayBottom.setText(NUM_FIRST);
                }
                opChecker = MULTI;
                Log.d(LOG, "Button Multiply Pressed");
                break;

//=============Button Divide===
            case R.id.btn_Op_Div:
                try {
                    firstNum = Integer.parseInt(displayTop.getText().toString());
                    displayBottom.setText(displayTop.getText().toString());
                    displayTop.setText(DIVIDE_OP);
                    opChecker = ADD;
                } catch (java.lang.NumberFormatException e ){
                    displayBottom.setText(NUM_FIRST);
                }
                opChecker = DIV;
                Log.d(LOG, "Button Divide Pressed");
                break;

//=============Button Clear===
            case R.id.btn_Op_Cle: displayTop.setText("");
                displayBottom.setText("");
                firstNum = 0;
                secondNum = 0;
                Log.d(LOG, "Button Clear Pressed");
                break;

//=============Button Dot===
            case R.id.btn_Op_Dot:if (displayTop.getText().toString().equals("+")
                    || displayTop.getText().toString().equals("-")
                    || displayTop.getText().toString().equals(TIMES_OP)
                    || displayTop.getText().toString().equals(DIVIDE_OP))
            {
                displayBottom.append(displayTop.getText().toString());
                displayTop.setText(".");
            }else
                displayTop.append(".");

                if (displayTop.getText().toString().length() > 10)
                {
                    displayBottom.setText(TOO_MANY);
                }
                Log.d(LOG, "Button Dot Pressed");
                break;

//=============Button Square===
            case R.id.btn_Op_Sqr:

                    firstNum = Integer.parseInt(displayTop.getText().toString());
                    displayBottom.setText(displayTop.getText().toString());
                displayBottom.append(SQUARE_OP);
                displayTop.setText(mathCustomSquare());

                Log.d(LOG, "Button Square Pressed");
                break;

//=============Button Square Root===
            case R.id.btn_Op_Sqr_Root:

                firstNum = Integer.parseInt(displayTop.getText().toString());
                String temp = displayTop.getText().toString();
                displayBottom.setText(SQUAREROOT_OP);
                displayBottom.append(temp);
                displayTop.setText(mathCustomSquareRoot());

                Log.d(LOG, "Button Square Root Pressed");
                break;


//=============Button Equals===
            case R.id.btn_Op_Equ: switch (opChecker)
            {
                case ADD: try {
                    secondNum = Integer.parseInt(displayTop.getText().toString());
                    displayTop.setText(mathCustomAdd());
                    displayBottom.setText("");
                } catch (java.lang.NumberFormatException e ){
                    displayBottom.setText(SEC_NUM_FIRST);
                }
                    Log.d(LOG, "Addition sum completed");
                    break;

                case SUB: try {
                    secondNum = Integer.parseInt(displayTop.getText().toString());
                    displayTop.setText(mathCustomSub());
                    displayBottom.setText("");
                } catch (java.lang.NumberFormatException e ){
                    displayBottom.setText(SEC_NUM_FIRST);
                }
                    Log.d(LOG, "Subtraction sum completed");
                    break;

                case DIV: try {
                    secondNum = Integer.parseInt(displayTop.getText().toString());
                    displayTop.setText(mathCustomDiv());
                    displayBottom.setText("");
                } catch (java.lang.NumberFormatException e ){
                    displayBottom.setText(SEC_NUM_FIRST);
                }
                    Log.d(LOG, "Division sum completed");
                    break;

                case MULTI: try {
                    secondNum = Integer.parseInt(displayTop.getText().toString());
                    displayTop.setText(mathCustomMulti());
                    displayBottom.setText("");
                } catch (java.lang.NumberFormatException e ){
                    displayBottom.setText(SEC_NUM_FIRST);
                }
                    Log.d(LOG, "Addition sum completed");
                    break;
            }
                Log.d(LOG, "Button Equals Pressed");
        }
    }

    // ===============================================
    // functions to handel the math
    // ===============================================
    public String mathCustomAdd()//Adds two numbers together
    {

        finalAnswer = firstNum + secondNum;
        return format.format(finalAnswer);
    }
    public String mathCustomSub()//Subtracts one number from another
    {
        finalAnswer = firstNum - secondNum;
        return format.format(finalAnswer);
    }
    public String mathCustomMulti()//Multiplies two numbers
    {
        finalAnswer = firstNum * secondNum;
        return format.format(finalAnswer);
    }
    public String mathCustomDiv()//Divides one number with another
    {
        finalAnswer = firstNum / secondNum;
        return format.format(finalAnswer);
    }
    public String mathCustomSquare()//Squares a single number
    {
        finalAnswer = firstNum * firstNum;
        return format.format(finalAnswer);
    }
    public String mathCustomSquareRoot()//Gets the square root of a single number
    {
        finalAnswer = Math.sqrt(firstNum);
        return format.format(finalAnswer);
    }
}



