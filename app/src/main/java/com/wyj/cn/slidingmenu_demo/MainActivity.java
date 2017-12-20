package com.wyj.cn.slidingmenu_demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
/**
 * 用的是SlidingMenu开源框架写的侧拉菜单
 *
 */

public class MainActivity extends AppCompatActivity {

    private SlidingMenu slidingMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        slidingMenu = new SlidingMenu(this);
        //左滑菜单
        slidingMenu.setMode(SlidingMenu.LEFT);
        //触摸屏幕(禁止触摸 )
        slidingMenu.setTouchModeAbove(SlidingMenu.TOUCHMODE_NONE);
        //设置阴影宽度
//        slidingMenu.setShadowWidthRes(R.dimen.shadow_width);
        //设置阴影效果
//        slidingMenu.setShadowDrawable(R.mipmap.ic_launcher_round);
        //设置滑动菜单的宽度
        slidingMenu.setBehindWidth(560);
        //菜单距离主页面的距离
//        slidingMenu.setBehindOffsetRes(R.dimen.slidingmenu_offset);

        //设置渐入渐出效果
        slidingMenu.setFadeDegree(0.35f);
        slidingMenu.attachToActivity(this,SlidingMenu.SLIDING_CONTENT);
        //为侧滑菜单设置布局
        slidingMenu.setMenu(R.layout.left_menu);


    }

    public void click(View view){
        slidingMenu.showMenu();

    }
}
