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

public class ShowJavaCode extends Activity {
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
                String formattedText = getString(R.string.javaBasicSyntax);
                Spanned result = Html.fromHtml(formattedText);
                view.setText(result);
                break;

            case 1:
                String formattedText1 = getString(R.string.javaLoops);
                Spanned result1 = Html.fromHtml(formattedText1);
                view.setText(result1);
                break;

            case 2:
                String formattedText2 = getString(R.string.javaArrays);
                Spanned result2 = Html.fromHtml(formattedText2);
                view.setText(result2);
                break;
            case 3:
                String formattedText3 = getString(R.string.javaAppletPieChart);
                Spanned result3 = Html.fromHtml(formattedText3);
                view.setText(result3);
                break;
            case 4:
                String formattedText4 = getString(R.string.javaAppletClock);
                Spanned result4 = Html.fromHtml(formattedText4);
                view.setText(result4);
                break;
            case 5:
                String formattedText5 = getString(R.string.javaAppletColorChooser);
                Spanned result5 = Html.fromHtml(formattedText5);
                view.setText(result5);
                break;
            case 6:
                String formattedText6 = getString(R.string.javaProjectAballMovingRoundTheWindow);
                Spanned result6 = Html.fromHtml(formattedText6);
                view.setText(result6);
                break;
            case 7:
                String formattedText7 = getString(R.string.javaProjectSchoolManagementSystem);
                Spanned result7 = Html.fromHtml(formattedText7);
                view.setText(result7);
                break;
            case 8:
                String formattedText8 = getString(R.string.javaProjectCalculator);
                Spanned result8 = Html.fromHtml(formattedText8);
                view.setText(result8);
                break;
            case 9:
                String formattedText9 = getString(R.string.javaProjectScientificCalculator);
                Spanned result9 = Html.fromHtml(formattedText9);
                view.setText(result9);
                break;
            case 10:
                String formattedText10 = getString(R.string.javaProjectCreateGUIForbankAccountSimulation);
                Spanned result10 = Html.fromHtml(formattedText10);
                view.setText(result10);
                break;
        }
    }
}
