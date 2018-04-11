package com.studio2bigdiv.android.prezquiz;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    String[] presidentsArray = {
        "George Washington",
        "John Adams",
        "Thomas Jefferson",
        "James Madison",
        "James Monroe",
        "John Quincy Adams",
        "Andrew Jackson",
        "Martin Van Buren",
        "William Henry Harrison",
        "John Tyler",
        "James K. Polk",
        "Zachary Taylor",
        "Millard Fillmore",
        "Franklin Pierce",
        "James Buchanan",
        "Abraham Lincoln",
        "Andrew Johnson",
        "Ulysses S. Grant",
        "Rutherford B. Hayes",
        "James A. Garfield",
        "Chester Arthur",
        "Grover Cleveland",
        "Benjamin Harrison",
        "Grover Cleveland",
        "William McKinley",
        "Theodore Roosevelt",
        "William Howard Taft",
        "Woodrow Wilson",
        "Warren G. Harding",
        "Calvin Coolidge",
        "Herbert Hoover",
        "Franklin D. Roosevelt",
        "Harry S. Truman",
        "Dwight D. Eisenhower",
        "John F. Kennedy",
        "Lyndon B. Johnson",
        "Richard Nixon",
        "Gerald Ford",
        "Jimmy Carter",
        "Ronald Reagan",
        "George Bush",
        "Bill Clinton",
        "George W. Bush",
        "Barack Obama",
        "Donald Trump"
    };

    Random rand = new Random();
    int presidentNumber = rand.nextInt(presidentsArray.length);
    String presidentName = presidentsArray[presidentNumber];
    String question = "Who was president #" + (presidentNumber + 1) + "?";

    int correctAnswers;


    private int[] generateAnswers(String amountOfAnswers) {
        //Generate answers and know which one is the correct answer
        int[] stubbedNumbers = {1,2,3};
        return stubbedNumbers; //stubbed out
    }

    private void setupScreen() {

        TextView q1answer = (TextView) findViewById(R.id.q1_answer);
        TextView q2answer = (TextView) findViewById(R.id.q2_answer);
        TextView q3answer = (TextView) findViewById(R.id.q3_answer);
        TextView q4answer = (TextView) findViewById(R.id.q4_answer);

        TextView questionDisplayView = (TextView) findViewById(R.id.question_display);
        questionDisplayView.setText(question);
        generateOptions();

        /* hide answer boxes
        To hide textview, use findViewById(R.id.textviewId).setVisibility(View.GONE);
        (use View.VISIBLE to set it visible again). There is an option in the xml
        for visibility. Click the TextView and then change that to Invisible or Gone.
         */

        q1answer.setVisibility(View.GONE);
        q2answer.setVisibility(View.GONE);
        q3answer.setVisibility(View.GONE);
        q4answer.setVisibility(View.GONE);
    }

    private void generateOptions() {
        // Create a list of indexes, adding the presidentName id into it
        // Generate two random numbers
        // Mix them up and output onto the screen
        ArrayList<Integer> optionIds = new ArrayList<>();
        optionIds.add(presidentNumber);
        optionIds.add(22);
        optionIds.add(34);
        TextView questionOption1 = (TextView) findViewById(R.id.option_1);
        TextView questionOption2 = (TextView) findViewById(R.id.option_2);
        TextView questionOption3 = (TextView) findViewById(R.id.option_3);
        questionOption1.setText(presidentsArray[optionIds.get(0)]);
        questionOption2.setText(presidentsArray[optionIds.get(1)]);
        questionOption3.setText(presidentsArray[optionIds.get(2)]);
    }


    protected String printSummary() {
        String resultsMessage = "You got " + correctAnswers + "/4 right.";
        Log.i("*** Results: ", resultsMessage);
        return resultsMessage;
    }

    private void displayCorrect(TextView whichView) {
        whichView.setVisibility(View.VISIBLE);
        whichView.setBackgroundColor(Color.GREEN);
        whichView.setText("Correct!");
    }

    private void displayIncorrect(TextView whichView) {
        whichView.setVisibility(View.VISIBLE);
        whichView.setBackgroundColor(0xFFFF0000);
        whichView.setText("Wrong");
    }

    public String checkAnswers(View view) {

        TextView q1answer = (TextView) findViewById(R.id.q1_answer);
        TextView q2answer = (TextView) findViewById(R.id.q2_answer);
        TextView q3answer = (TextView) findViewById(R.id.q3_answer);
        TextView q4answer = (TextView) findViewById(R.id.q4_answer);

        correctAnswers = 0;
        RadioButton option1 = (RadioButton) findViewById(R.id.option_1);
        String results = "";

        // Question #1
        if (option1.isChecked()) {
            Log.i("*** Question #1: ", "You were RIGHT!!! ");
            correctAnswers++;
            results += "Question #1: You were right";
            displayCorrect(q1answer);
        } else {
            Log.i("*** Answer: ", "You were wrong. :( ");
            results += "Question #1: You were wrong";
            displayIncorrect(q1answer);
        }

        // Question #2
        CheckBox q2_option1 = findViewById(R.id.q2_option1);
        CheckBox q2_option2 = findViewById(R.id.q2_option2);
        CheckBox q2_option4 = findViewById(R.id.q2_option4);

        if (q2_option1.isChecked() && q2_option2.isChecked() && q2_option4.isChecked()) {
            Log.i("*** Question #2: ", "You were RIGHT!!! ");
            correctAnswers++;
            results += "Question #2: You were right";
            displayCorrect(q2answer);
        } else {
            Log.i("*** Question #2: ", "You were wrong. :( ");
            results += "Question #2: You were wrong";
            displayIncorrect(q2answer);
        }

        // Question #3
        RadioButton q3_option4 = findViewById(R.id.option_3_4);

        if (q3_option4.isChecked()) {
            Log.i("*** Question #3: ", "You were RIGHT!!! ");
            correctAnswers++;
            results += "Question #3: You were right";
            displayCorrect(q3answer);
        } else {
            Log.i("*** Question #3: ", "You were wrong. :( ");
            results += "Question #3: You were wrong";
            displayIncorrect(q3answer);
        }

        // Question #4

        EditText presidentLookalikeField = findViewById(R.id.lookalike_president);

        if (!presidentLookalikeField.getText().toString().matches("")) {
            Log.i("*** Question #4: ", "You're right, spitting image!");
            correctAnswers++;
            results += "Question #4: You were right, spitting image!";
            displayCorrect(q4answer);
        } else {
            Log.i("*** Question #4: ", "You didn't enter anything!");
            results += "Question #4: You didn't enter anything!";
            displayIncorrect(q4answer);
        }

        printSummary();
        return results;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupScreen();
    }
}
