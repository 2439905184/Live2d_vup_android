package jp.live2d.sample;
import android.view.*;
import android.widget.*;
import jp.live2d.sample.*;
public class check implements CompoundButton.OnCheckedChangeListener
{
  @Override
  public void onCheckedChanged(CompoundButton p1, boolean p2)
  {
    String p1_txt= p1.getText().toString();
    if(p1_txt.equals("是否可移动"))
    {
      if(p2)
      {
       View root= View.inflate(SampleActivity.ctx,R.layout.activity_main,null);
      // Toast.makeText(SampleActivity.ctx,root.toString(),1000).show();
 //手动寻找自己设置的view Id导致崩溃
//   Object y=  root.findViewById(6666);
   
 //  Toast.makeText(SampleActivity.ctx,y.toString(),1000).show();
        Global.can_float_live2d_window_move=true;
      }
    else
      {
        Global.can_float_live2d_window_move=false;
      }
    }
  
  }
  //打开关闭挂件模式
 }