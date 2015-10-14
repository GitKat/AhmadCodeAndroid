package com.example.ahmad.programming4u;

/**
 * Created by Ahmad on 7/22/2015.
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.widget.TextView;

public class ShowCConversionCode extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.neew);
        TextView view = (TextView)findViewById(R.id.samleText);
        Intent mIntent = getIntent();
        int intValue = mIntent.getIntExtra("position", 0);
        switch(intValue){
            case 0:
                String formattedText = getString(R.string.binary2deci);
                Spanned result = Html.fromHtml(formattedText);
                view.setText(result);
                break;

            case 1:
                String formattedText1 = getString(R.string.binary2octal);
                Spanned result1 = Html.fromHtml(formattedText1);
                view.setText(result1);
                break;

            case 2:
                String formattedText2 = getString(R.string.binary2hexa);
                Spanned result2 = Html.fromHtml(formattedText2);
                view.setText(result2);
                break;

            case 3:
                String formattedText3 = getString(R.string.deci2binary);
                Spanned result3 = Html.fromHtml(formattedText3);
                view.setText(result3);
                break;
            case 4:
                String formattedText4 = getString(R.string.deci2octal);
                Spanned result4 = Html.fromHtml(formattedText4);
                view.setText(result4);
                break;
            case 5:
                String formattedText5 = getString(R.string.deci2hexa);
                Spanned result5 = Html.fromHtml(formattedText5);
                view.setText(result5);
                break;
            case 6:
                String formattedText6 = getString(R.string.octal2binary);
                Spanned result6 = Html.fromHtml(formattedText6);
                view.setText(result6);
                break;
            case 7:
                String formattedText7 = getString(R.string.octal2deci);
                Spanned result7 = Html.fromHtml(formattedText7);
                view.setText(result7);
                break;
            case 8:
                String formattedText8 = getString(R.string.hexa2binary);
                Spanned result8 = Html.fromHtml(formattedText8);
                view.setText(result8);
                break;
        }
    }
}

