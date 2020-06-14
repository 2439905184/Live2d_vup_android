package jp.live2d.sample;
import android.view.*;
import android.widget.*;
import android.view.MotionEvent;
import android.view.ViewGroup.*;
public class Touch implements View.OnTouchListener
{
  float pressx;
  float pressy;
  
  @Override 
  public boolean onTouch(View p1,MotionEvent e)
  {
    // Toast.makeText(SampleActivity.ctx,"按下吗吗吗",1000).show();
    if(e.getAction()==MotionEvent.ACTION_DOWN)
    {
      pressx=e.getX();
      pressy=e.getY();
    }
    if(e.getAction()==MotionEvent.ACTION_MOVE)
    {
      if(Global.can_float_live2d_window_move)
      {
        // Toast.makeText(SampleActivity.ctx,"移动",Toast.LENGTH_SHORT).show();
        float x=e.getRawX();
        float y=e.getRawY();
        p1.setX(x-pressx);
        p1.setY(y-pressy);
        int w= p1.getWidth();
        int h=p1.getHeight();
        // Toast.makeText(SampleActivity.ctx,"w h"+w+""+h,Toast.LENGTH_SHORT).show();
        // p1.setX(30f);
        //p1.setLayoutParams(new LayoutParams(200,200));
      }
    }
    return true;
  }
}