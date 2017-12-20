package com.wyj.cn.slidingmenu_demo;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;

/**
 * Created by acer-pc on 2017/12/20.
 *
 * 使用原生DrawerLayout写的抽屉菜单
 */

public class DrawerLayout_Activity extends Activity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawerlayout_activity);


        initview();

    }

    private void initview() {
        final DrawerLayout drawerLayout=(DrawerLayout)findViewById(R.id.drawer_layout);
        NavigationView navigationView=(NavigationView)findViewById(R.id.nv_menu_left);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                item.setCheckable(true);//设置选中效果
//                drawerLayout.closeDrawers();//关闭抽屉

                switch ( item.getItemId()){

                    case R.id.nav_home:
                        Log.e("tag","home**************************");
                        Toast.makeText(DrawerLayout_Activity.this,"home",Toast.LENGTH_LONG).show();
                        break;

                }

                return true;
            }
        });

    }


}
