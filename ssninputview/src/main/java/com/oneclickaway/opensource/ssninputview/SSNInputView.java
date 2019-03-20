package com.oneclickaway.opensource.ssninputview;

import android.content.Context;
import android.support.v7.widget.AppCompatEditText;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;


public class SSNInputView extends AppCompatEditText {

    int MAX_LENGTH = 11;

    private static final String TAG = "SSNInputView";
    public SSNInputView(Context context) {
        super(context);
        setSSNPattern();
    }

    public SSNInputView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setSSNPattern();
    }

    public SSNInputView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setSSNPattern();
    }


    void setSSNPattern(){

        setFilters(new InputFilter[]{new InputFilter.LengthFilter(MAX_LENGTH)});

        setKeyListener(new DigitsKeyListener());
        setOnClickListener();

        this.addTextChangedListener(new TextWatcher() {
            Integer previousTextLength = getText().toString().length();

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                previousTextLength = charSequence.length();

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                int length = getText().toString().length();
                String ediTextString =  getText().toString();
                Log.d(TAG, "afterTextChanged : " + length);
                if (length == 3 &&  length > previousTextLength){
                    String middleWare = ediTextString + "-";
                    setTextAndSelection(middleWare);
                }else if (length == 6 && length > previousTextLength){
                    String middleWare = ediTextString + "-";
                    setTextAndSelection(middleWare);
                }


                if (!ediTextString.contains("-") && length > 6 ){
                    setDashesForSSN(ediTextString);
                    return;
                }else if (!ediTextString.contains("-") && length > 3){
                    setDashForThree(ediTextString);
                    return;
                }


                if (length > 3  && ediTextString.charAt(3) != '-'){
                    Log.d(TAG, "Caught inner" + length);
                    swapAndReturnString(ediTextString, 3);
                }

                if (length > 6 && ediTextString.charAt(6) != '-'){
                    Log.d(TAG, "Caught outer" + length);
                    swapAndReturnString(ediTextString, 6);
                }

            }

            void swapAndReturnString(String ediTextString,   int position){
                StringBuilder userString = new StringBuilder(ediTextString);
                Character c =  userString.charAt(position);
                userString.setCharAt(position, '-');
                String finalString  = userString + c.toString();
                setTextAndSelection(finalString);

            }
            void setTextAndSelection(String middleWare){
                setText(middleWare);
                setSelection(middleWare.length());
            }


            private void setDashForThree(String ediTextString) {
                String firstHalf    =  ediTextString.substring(0,  3);
                String secondHalf   = ediTextString.substring(3,  ediTextString.length());
                String finalString  = firstHalf + "-" + secondHalf;
                Log.d("SSNNOThree", firstHalf + "-" + secondHalf);
                setTextAndSelection(finalString);

            }


            private void setDashesForSSN(String ediTextString) {

                String firstHalf    =  ediTextString.substring(0,  3);
                String secondHalf   = ediTextString.substring(3,  5);
                String thirdHalf    = ediTextString.substring(5, ediTextString.length());
                String ssnNumber = firstHalf + "-" + secondHalf + "-" + thirdHalf;
                Log.d("SSNNO", firstHalf + "-" + secondHalf + "-" + thirdHalf);
                setTextAndSelection(ssnNumber);

            }

        });


    }

    void setOnClickListener(){
        setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                setSelection(getText().length());
            }
        });
    }

    public void setMaximumLength(int maxLength) {
        this.MAX_LENGTH = MAX_LENGTH;
    }
}
