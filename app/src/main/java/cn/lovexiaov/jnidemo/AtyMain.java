package cn.lovexiaov.jnidemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AtyMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_main);
        ((TextView) findViewById(R.id.tv_hello)).setText(getMsgFromJni());
    }
    static {
        System.loadLibrary("hello-jni");
    }

    public native String getMsgFromJni();

}
