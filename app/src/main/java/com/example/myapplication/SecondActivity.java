package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String data = intent.getStringExtra("extra_data");//接收来自mainActivity Intent的数据
        Button button2 = (Button) findViewById(R.id.button_2);
        TextView tx =findViewById(R.id.name_first);
         tx.append(","+data);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.baidu.com"));
                startActivity(intent);
                //Toast.makeText(MainActivity.this, "You clicked Button 1",
                // Toast.LENGTH_SHORT).show();
                // finish();//结束活动→关闭这个画面
            }
        });
    }
}
