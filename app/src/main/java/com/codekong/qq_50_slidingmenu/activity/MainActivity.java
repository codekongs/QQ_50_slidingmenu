package com.codekong.qq_50_slidingmenu.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.codekong.qq_50_slidingmenu.R;
import com.codekong.qq_50_slidingmenu.view.SlidingMenu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SlidingMenu slidingMenu = (SlidingMenu) findViewById(R.id.sliding_menu);
        slidingMenu.toggleMenu();
    }
}
