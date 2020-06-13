/**
*
* You can modify and use this source freely
* only for the development of application related Live2D.
*
* (c) Live2D Inc. All rights reserved.
*/
package jp.live2d.sample;

import jp.live2d.Live2D;
import android.app.Activity;
import android.os.Bundle;

import android.view.*;
import android.app.*;
import android.content.*;
import android.widget.*;
import android.app.*;
import android.os.*;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.view.ViewGroup.*;
import android.provider.Settings;
import  jp.live2d.sample.check;
public class SampleActivity extends Activity
{
  public static Context ctx;
  public WindowManager.LayoutParams p;
  //public LinearLayout root;
  @Override 
  public void onPostCreate(android.os.Bundle savedInstanceState) 
  {
    super.onPostCreate(savedInstanceState);

  }

  @Override
  public void onCreate(Bundle savedInstanceState)
  { 
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ctx=getApplicationContext();
    LinearLayout root=(LinearLayout)findViewById(R.id.a);
     Live2D.init();
    add_btns(root);
    
    //View live=View.inflate(this,R.layout.live,null);
   SampleGLSurfaceView v=new SampleGLSurfaceView(this);
    v.setOnTouchListener(new Touch());
    root.addView(v);
    
    
   }
public void add_btns(LinearLayout root)
{
  Button button=new Button(this);
    button.setText("打开挂件模式");
    button.setOnClickListener(new click());
     root.addView(button);
     
     Switch s=new Switch(this);
     s.setText("是否可移动");
     s.setOnCheckedChangeListener(new check());
     
     root.addView(s);
  }
}