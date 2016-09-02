package cn.edu.bistu.cs.se.zuoye3;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText show;
    Button bn;
    @Override
    public void onCreate(Bundle savedInstanceState)	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        show = (EditText) findViewById(R.id.textView);
        bn = (Button) findViewById(R.id.button);
        // 直接使用Activity作为事件监听器
        bn.setOnClickListener(new View.OnClickListener()
        {
            // 实现事件处理方法
            public void onClick(View v)			{
                show.setText("bn按钮被单击了！");
            }
        });
    }

}
