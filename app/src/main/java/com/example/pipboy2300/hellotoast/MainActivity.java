package com.example.pipboy2300.hellotoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mCountView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(savedInstanceState != null){
            mCount = Integer.parseInt( savedInstanceState.getString("mCount") );
        }

        setContentView(R.layout.activity_main);
        mCountView = (TextView) findViewById(R.id.count_text);
        mCountView.setText( Integer.toString(mCount) );
    }

    @Override
    protected void onSaveInstanceState (Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("mCount", mCountView.getText().toString() );
    }

    public void countUp(View view) {
        mCount++;
        if( mCountView != null )
            mCountView.setText( Integer.toString(mCount) );
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_mesage, Toast.LENGTH_LONG);

        toast.show();
    }
}
