package demo.dhcc.com.bridging.simple2;

/**
 * 形状
 *
 * @author 512573717@qq.com
 
 * @created 2018/7/27  下午3:27.
 * 
 */
public  abstract  class Shape {

   protected  IColor mIColor;

    public void setIColor(IColor IColor) {
        mIColor = IColor;
    }

    public abstract void draw();
}
