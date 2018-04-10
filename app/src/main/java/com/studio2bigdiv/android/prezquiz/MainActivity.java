package com.studio2bigdiv.android.prezquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
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

    int correctAnswer;


    private int[] generateAnswers(String amountOfAnswers) {
        //Generate answers and know which one is the correct answer
        int[] stubbedNumbers = {1,2,3};
        return stubbedNumbers; //stubbed out
    }

    private void setupScreen() {
        TextView questionDisplayView = (TextView) findViewById(R.id.question_display);
        questionDisplayView.setText(question);
        generateOptions();
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

    //private boolean checkAnswer()

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupScreen();
        Log.i("*** Activity question: ", question);
        Log.i("*** Activity answer: ", presidentName);
    }
}
