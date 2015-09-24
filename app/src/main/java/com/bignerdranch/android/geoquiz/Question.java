package com.bignerdranch.android.geoquiz;

/**
 * Created by wmanzoul on 9/23/15. This is where business logic goes. What's a Question? What's a car class, for example?
 */
public class Question {
    private int mTextResID;
    private boolean mAnswerTrue;

    public Question(int textResID, boolean answerTrue){
        mTextResID = textResID; //holds question text
        mAnswerTrue = answerTrue; //holds answer to question
    }

    public int getTextResID() {
        return mTextResID;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setTextResID(int textResID) {
        mTextResID = textResID;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}
