package jp.live2d.sample;
import android.view.*;
import android.widget.*;
public class check implements CompoundButton.OnCheckedChangeListener
{
  @Override
  public void onCheckedChanged(CompoundButton p1, boolean p2)
  {
    
    if(p2)
    {
     Global.can_float_live2d_window_move=true;
    }
  else
    {
      Global.can_float_live2d_window_move=false;
    }
  }
}