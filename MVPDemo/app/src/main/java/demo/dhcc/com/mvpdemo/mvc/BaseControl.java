package demo.dhcc.com.mvpdemo.mvc;

import demo.dhcc.com.mvpdemo.Callback;

/**
 * ${title}
 *
 * @author zongsw
 * @created 2018/7/4 下午4:37.
 */
public interface BaseControl {

   void getDate(Callback callback);

   void postDate(Callback callback);
}
