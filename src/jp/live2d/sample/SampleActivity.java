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
  import  jp.live2d.sample.*;
public class SampleActivity extends Activity
{
  public static Context ctx;
  public WindowManager.LayoutParams p;
  //public LinearLayout root;
  public static SampleGLSurfaceView my_live_view;
  @Override
  public void onCreate(Bundle savedInstanceState)
  { 
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ctx=getApplicationContext();
    LinearLayout root=(LinearLayout)findViewById(R.id.a);
     Live2D.init();
    
    
    //View live=View.inflate(this,R.layout.live,null);
   SampleGLSurfaceView v=new SampleGLSurfaceView(this);
   add_btns(root,v);
  //ViewGroup.LayoutParams liveViewLayout=  v.getLayoutParams();

    v.setOnTouchListener(new Touch());
    my_live_view=v;
    root.addView(v);
  //v.setVisibility(View.GONE);
    
    
   }
 public void size_add(View v)
 {
  int width= my_live_view.getMeasuredWidth();
  tw.tip(width);
   my_live_view.onMeasure(width+100,width+100);
   }
 public void size_jian(View v)
 {
   
  int width= my_live_view.getMeasuredWidth();
  tw.tip(width+"减去");
  int result_width=width-500;
  tw.tip(my_live_view);
   my_live_view.onMeasure(result_width,result_width);
 my_live_view.invalidate();
   }
public void add_btns(LinearLayout root,SampleGLSurfaceView v)
{
 
     Switch s=new Switch(this);
     s.setText("是否可移动");
     s.setOnCheckedChangeListener(new check());
     Switch sa=new Switch(this);
     sa.setText("打开/关闭挂件模式");
    sa.setOnCheckedChangeListener(new check(v));
    
     root.addView(s);
     root.addView(sa);
  }
}