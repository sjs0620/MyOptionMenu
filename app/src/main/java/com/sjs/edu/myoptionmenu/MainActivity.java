package com.sjs.edu.myoptionmenu;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout baseLayout;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        baseLayout = (LinearLayout)findViewById(R.id.baseLayout);
        button = (Button)findViewById(R.id.button);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater menuInflater  = getMenuInflater(); //메뉴띄우는 변수
        menuInflater.inflate(R.menu.menu, menu);
       return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case  R.id.itemRed:
                baseLayout.setBackgroundColor(Color.RED);
                return true;
            case  R.id.itemGreen:
                baseLayout.setBackgroundColor(Color.GREEN);
                return true;
            case  R.id.itemBlue:
                baseLayout.setBackgroundColor(Color.BLUE);
                return true;
            case  R.id.subRotate:
                button.setRotation(45);
                return true;
            case  R.id.subSize:
                button.setScaleX(2);
                return true;
        }
        return false;
    }
}
