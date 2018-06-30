package com.mentorajk.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public int questionOne(boolean isAnswerPartAChecked, boolean isAnswerPartBChecked, boolean isAnswerPartCChecked, boolean isAnswerPartDChecked) {
        //add one point to the score if it is checked
        int score = 0;
        if (isAnswerPartAChecked) {
            score += 1;
        }
        //add nothing to the score if it is checked
        if (isAnswerPartBChecked) {
            score += 0;
        }
        //add nothing to the score if it is checked
        if (isAnswerPartCChecked) {
            score += 0;
        }
        //add one point to the score if it is checked
        if (isAnswerPartDChecked) {
            score += 1;
        }
        return score;
    }

    // Question_Two status
    /*
    * check whether the two string are equal if so give
    * the player a point
    */
    public int questionTwo(String answerForQueTwo) {
        int score = 0;
        if (answerForQueTwo.equals("asia")) {
            score += 1;
        } else {
            score += 0;
        }
        return score;
    }

    //Question_Three method
    /*check if the radio button was  checked.
     * if so give the player zero or one point
     * according to the answer.
     */
    public int questionThree(boolean isAnswerPartA_Checked, boolean isAnswerPartB_Checked, boolean isAnswerPartC_Checked, boolean isAnswerPartD_Checked) {
        int score = 0;
        if (isAnswerPartA_Checked) {
            score += 0;
        }
        if (isAnswerPartB_Checked) {
            score += 0;
        }
        if (isAnswerPartC_Checked) {
            score += 1;
        }
        if (isAnswerPartD_Checked) {
            score += 0;
        }
        return score;
    }

    //Question Four Method
    /*verify if the two String are equal
     * if they are give the player a point
     */
    public int questionFour(String answerForQueFour) {
        int score = 0;
        if (answerForQueFour.equals("africa")) {
            score += 1;
        }
        return score;
    }

    //Question Five Method
    public int questionFive(boolean isAnswerForQueFivePartA_Checked, boolean isAnswerForQueFivePartB_Checked, boolean isAnswerForQueFivePartC_Checked, boolean isAnswerForQueFivePartD_Checked) {
        int score = 0;

        /*check if the check box was  checked.
         * if so give the player zero point.
         */
        if (isAnswerForQueFivePartA_Checked) {
            score += 0;
        }

        /*check if the check box was  checked.
         * if so give the player one point.
         */
        if (isAnswerForQueFivePartB_Checked) {
            score += 1;
        }

        /*check if the check box was  checked.
         * if so give the player one point.
         */
        if (isAnswerForQueFivePartC_Checked) {
            score += 1;
        }

        /*check if the check box was  checked.
         * if so give the player zero point.
         */
        if (isAnswerForQueFivePartD_Checked) {
            score += 0;
        }
        return score;
    }

    //Question Six
    public int questionSix(boolean isAnswerForQueSixPartA_Checked, boolean isAnswerForQueSixPartB_Checked, boolean isAnswerForQueSixPartC_Checked, boolean isAnswerForQueSixPartD_Checked) {
        int score = 0;

        /*check if the radio button was  checked.
         * if so give the player one point.
         */
        if (isAnswerForQueSixPartA_Checked) {
            score += 1;
        }

        /*check if the radio button was  checked.
         * if so give the player zero point.
         */
        if (isAnswerForQueSixPartB_Checked) {
            score += 0;
        }

        /*check if the radio button was  checked.
         * if so give the player zero point.
         */
        if (isAnswerForQueSixPartC_Checked) {
            score += 0;
        }

        /*check if the radio button was  checked.
        * if so give the player zero point.
        */
        if (isAnswerForQueSixPartD_Checked) {
            score += 0;
        }
        return score;
    }

    //question seven
    /*verify if the two String are equal
     * if they are give the player a point
     */
    public int questionSeven(String answerForQuestionSeven) {
        int score = 0;
        if (answerForQuestionSeven.equals("south america")) {
            score += 1;
        }
        return score;
    }

    //this method is called when the submit button is clicked
    public void submitScore(View view) {
        //tracking the status of question_One_Part_A
        CheckBox answerForQuestionOnePartA = (CheckBox) findViewById(R.id.answerFor_QuestionOne_partA);
        boolean isAnswerPartAChecked = answerForQuestionOnePartA.isChecked();

        //tracking the status of question_One_Part_B
        CheckBox answerForQuestionOnePartB = (CheckBox) findViewById(R.id.answerFor_QuestionOne_partB);
        boolean isQuestionOnePartBChecked = answerForQuestionOnePartB.isChecked();

        //tracking the status of question_One_Part_C
        CheckBox answerForQuestionOnePartC = (CheckBox) findViewById(R.id.answerFor_QuestionOne_partC);
        boolean isQuestionOnePartCChecked = answerForQuestionOnePartC.isChecked();

        //tracking the status of question_One_Part_D
        CheckBox answerForQuestionOnePartD = (CheckBox) findViewById(R.id.answerFor_QuestionOne_partD);
        boolean isQuestionOnePartDChecked = answerForQuestionOnePartD.isChecked();

        //checking the status of question two answer
        EditText answerForQuestionTwo = (EditText) findViewById(R.id.answerFor_QuestionTwo);
        String answerForQueTwo = answerForQuestionTwo.getText().toString().toLowerCase();

        //tracking the status of question_Three_answer_part_A
        RadioButton answerForQuestionThreePartA = (RadioButton) findViewById(R.id.answerFor_QuestionThree_partA);
        boolean isAnswerForQueThreePartA_Checked = answerForQuestionThreePartA.isChecked();

        //tracking the status of question_Three_answer_part_B
        RadioButton answerForQuestionThreePartB = (RadioButton) findViewById(R.id.answerFor_QuestionThree_partB);
        boolean isAnswerForQueThreePartB_checked = answerForQuestionThreePartB.isChecked();

        //tracking the status of question_Three_answer_part_C
        RadioButton answerForQuestionThreePartC = (RadioButton) findViewById(R.id.answerFor_QuestionThree_partC);
        boolean isAnswerForQueThreePartC_Checked = answerForQuestionThreePartC.isChecked();

        //tracking the status of question_Three_answer_part_D
        RadioButton answerForQuestionThreePartD = (RadioButton) findViewById(R.id.answerFor_QuestionThree_partD);
        boolean isAnswerForQueThreePartD_Checked = answerForQuestionThreePartD.isChecked();

        //checking the status of Question four and storing it to a variable
        EditText answerForQuestionFour = (EditText) findViewById(R.id.answerFor_QuestionFour);
        String answerForQueFour = answerForQuestionFour.getText().toString().toLowerCase();

        //checking the status of answer for question_Five_Part A
        CheckBox answerForQuestionFivePartA = (CheckBox) findViewById(R.id.answerFor_QuestionFive_partA);
        boolean isAnswerForQueFivePartAChecked = answerForQuestionFivePartA.isChecked();

        //tracking the status of answer for question_Five_Part_B
        CheckBox answerForQuestionFivePartB = (CheckBox) findViewById(R.id.answerFor_QuestionFive_partB);
        boolean isAnswerForQueFivePartBChecked = answerForQuestionFivePartB.isChecked();

        //tracking the status of answer for question_Five_Part_C
        CheckBox answerForQuestionFivePartC = (CheckBox) findViewById(R.id.answerFor_QuestionFive_partC);
        boolean isAnswerForQueFivePartCChecked = answerForQuestionFivePartC.isChecked();

        //tracking the status of answer for question_Five_Part_D
        CheckBox answerForQuestionFivePartD = (CheckBox) findViewById(R.id.answerFor_QuestionFive_partD);
        boolean isAnswerForQueFivePartDChecked = answerForQuestionFivePartD.isChecked();

        //tracking the status of question_Six_answer_part_A
        RadioButton answerForQuestionSixPartA = (RadioButton) findViewById(R.id.answerFor_QuestionSix_partA);
        boolean isAnswerForQueSixPartA_Checked = answerForQuestionSixPartA.isChecked();

        //tracking the status of question_Six_answer_part_B
        RadioButton answerForQuestionSixPartB = (RadioButton) findViewById(R.id.answerFor_QuestionSix_partB);
        boolean isAnswerForQueSixPartB_checked = answerForQuestionSixPartB.isChecked();

        //tracking the status of question_Six_answer_part_C
        RadioButton answerForQuestionSixPartC = (RadioButton) findViewById(R.id.answerFor_QuestionSix_partC);
        boolean isAnswerForQueSixPartC_Checked = answerForQuestionSixPartC.isChecked();

        //tracking the status of question_Six_answer_part_D
        RadioButton answerForQuestionSixPartD = (RadioButton) findViewById(R.id.answerFor_QuestionSix_partD);
        boolean isAnswerForQueSixPartD_Checked = answerForQuestionSixPartD.isChecked();

        //checking the status of Question Seven and storing it to a variable
        EditText answerForQuestionSeven = (EditText) findViewById(R.id.answerFor_QuestionSeven);
        String answerForQueSeven = answerForQuestionSeven.getText().toString().toLowerCase();

        //storing the result from question methods && and updating the score according to there status
        int scoreMessage=questionOne(isAnswerPartAChecked,isQuestionOnePartBChecked,isQuestionOnePartCChecked,isQuestionOnePartDChecked);
        scoreMessage += questionTwo(answerForQueTwo);
        scoreMessage +=  questionThree(isAnswerForQueThreePartA_Checked, isAnswerForQueThreePartB_checked, isAnswerForQueThreePartC_Checked, isAnswerForQueThreePartD_Checked);
        scoreMessage +=  questionFour(answerForQueFour);
        scoreMessage +=  questionFive(isAnswerForQueFivePartAChecked, isAnswerForQueFivePartBChecked, isAnswerForQueFivePartCChecked, isAnswerForQueFivePartDChecked);
        scoreMessage +=  questionSix(isAnswerForQueSixPartA_Checked, isAnswerForQueSixPartB_checked, isAnswerForQueSixPartC_Checked, isAnswerForQueSixPartD_Checked);
        scoreMessage += questionSeven(answerForQueSeven);


        String message = "You scored " + scoreMessage + " out of 9";

        //display in short period of time
        Toast.makeText(MainActivity.this, message,
                Toast.LENGTH_SHORT).show();
    }

    //this method is called when the reset button is clicked
    public void resetScore(View view) {
            //resetting checkBox A
        CheckBox answerForQuestionOnePartA = (CheckBox) findViewById(R.id.answerFor_QuestionOne_partA);
        if (answerForQuestionOnePartA.isChecked()) {
            answerForQuestionOnePartA.setChecked(false);
        }
        //Resetting the status of question_One_Part_B
        CheckBox answerForQuestionOnePartB = (CheckBox) findViewById(R.id.answerFor_QuestionOne_partB);
        if(answerForQuestionOnePartB.isChecked()) {
            answerForQuestionOnePartB.setChecked(false);
        }

        //Resetting the status of question_One_Part_C
        CheckBox answerForQuestionOnePartC = (CheckBox) findViewById(R.id.answerFor_QuestionOne_partC);
        if(answerForQuestionOnePartC.isChecked()){
            answerForQuestionOnePartC.setChecked(false);
        }

        //Resetting the status of question_One_Part_D
        CheckBox answerForQuestionOnePartD = (CheckBox) findViewById(R.id.answerFor_QuestionOne_partD);
        if(answerForQuestionOnePartD.isChecked()){
            answerForQuestionOnePartD.setChecked(false);
        }
        //Resetting  the status of question two answer
        EditText answerForQuestionTwo = (EditText) findViewById(R.id.answerFor_QuestionTwo);
        answerForQuestionTwo.setText(null);

        //Resetting the status of question_Three_answer_part_A
        RadioButton answerForQuestionThreePartA = (RadioButton) findViewById(R.id.answerFor_QuestionThree_partA);
        if(answerForQuestionThreePartA.isChecked()) {
            answerForQuestionThreePartA.setChecked(false);
        }

        //Resetting the status of question_Three_answer_part_B
        RadioButton answerForQuestionThreePartB = (RadioButton) findViewById(R.id.answerFor_QuestionThree_partB);
        if(answerForQuestionThreePartB.isChecked()){
            answerForQuestionThreePartB.setChecked(false);
        }

        //Resetting the status of question_Three_answer_part_C
        RadioButton answerForQuestionThreePartC = (RadioButton) findViewById(R.id.answerFor_QuestionThree_partC);
        if(answerForQuestionThreePartC.isChecked()){
            answerForQuestionThreePartC.setChecked(false);
        }

        //Resetting the status of question_Three_answer_part_D
        RadioButton answerForQuestionThreePartD = (RadioButton) findViewById(R.id.answerFor_QuestionThree_partD);
        if(answerForQuestionThreePartD.isChecked()){
            answerForQuestionThreePartD.setChecked(false);
        }
        //Resetting the status of Question four and storing it to a variable
        EditText answerForQuestionFour = (EditText) findViewById(R.id.answerFor_QuestionFour);
        answerForQuestionFour.setText(null);

        //Resetting the status of answer for question_Five_Part A
        CheckBox answerForQuestionFivePartA = (CheckBox) findViewById(R.id.answerFor_QuestionFive_partA);
        answerForQuestionFivePartA.setChecked(false);

        //Resetting or unchecking the status of answer for question_Five_Part_B
        CheckBox answerForQuestionFivePartB = (CheckBox) findViewById(R.id.answerFor_QuestionFive_partB);
        answerForQuestionFivePartB.setChecked(false);

        //Resetting the status of answer for question_Five_Part_C
        CheckBox answerForQuestionFivePartC = (CheckBox) findViewById(R.id.answerFor_QuestionFive_partC);
        answerForQuestionFivePartC.setChecked(false);

        //Reseting the status of answer for question_Five_Part_D
        CheckBox answerForQuestionFivePartD = (CheckBox) findViewById(R.id.answerFor_QuestionFive_partD);
        answerForQuestionFivePartD.setChecked(false);

        //Resetting the status of question_Six_answer_part_A
        RadioButton answerForQuestionSixPartA = (RadioButton) findViewById(R.id.answerFor_QuestionSix_partA);
        answerForQuestionSixPartA.setChecked(false);

        //Resetting the status of question_Six_answer_part_B
        RadioButton answerForQuestionSixPartB = (RadioButton) findViewById(R.id.answerFor_QuestionSix_partB);
        answerForQuestionSixPartB.setChecked(false);

        //Resetting the status of question_Six_answer_part_C
        RadioButton answerForQuestionSixPartC = (RadioButton) findViewById(R.id.answerFor_QuestionSix_partC);
        answerForQuestionSixPartC.setChecked(false);

        //Resetting the status of question_Six_answer_part_D
        RadioButton answerForQuestionSixPartD = (RadioButton) findViewById(R.id.answerFor_QuestionSix_partD);
        answerForQuestionSixPartD.setChecked(false);

        //checking the status of Question Seven and storing it to a variable
        EditText answerForQuestionSeven = (EditText) findViewById(R.id.answerFor_QuestionSeven);
        answerForQuestionSeven.setText(null);

    }

}