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
    	//lib_hello_.so ����ʱϵͳ�Զ����libǰ׺��
    	System.loadLibrary("hello"); //���ر�����libhello.so �ļ�
    	String result = helloFromC();
    	Toast.makeText(getApplicationContext(), result, 0).show();
    }
     
    //�������ط��� native
    public native String helloFromC();

}
