package kr.ac.kau.sw.a2016125063.practice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView listView = (ListView) findViewById(R.id.listView);

        String[] items = {"연필","지우개","컴퍼스","각도기","볼펜"};
        int[] prices = {500, 500, 3000, 1500, 5000};
        List<BeanItem> beans = new ArrayList<BeanItem>();

        for(int i = 0; i < items.length; i++){
            BeanItem bean = new BeanItem();
            bean.item = items[i];
            bean.price = prices[i];
            beans.add(bean);
        }

        AdapterListItem adapter = new AdapterListItem(this, 0, beans);
        listView.setAdapter(adapter);




    }

}
/*
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("App511", "onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d("App511", "onRestoreInstanceState");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("App511", "onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("App511", "onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("App511", "onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("App511", "onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("App511", "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("App511", "onStop");
    }
}*/

