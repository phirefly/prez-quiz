package com.studio2bigdiv.android.prezquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

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
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
