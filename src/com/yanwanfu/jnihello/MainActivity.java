package com.yanwanfu.jnihello;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void click(View v){
    	// Android.mk/LOCAL_MODULE    := hello
    	//lib_hello_.so 编译时系统自动添加lib前缀，
    	System.loadLibrary("hello"); //加载编译后的libhello.so 文件
    	String result = helloFromC();
    	Toast.makeText(getApplicationContext(), result, 0).show();
    }
     
    //声明本地方法 native
    public native String helloFromC();

}
