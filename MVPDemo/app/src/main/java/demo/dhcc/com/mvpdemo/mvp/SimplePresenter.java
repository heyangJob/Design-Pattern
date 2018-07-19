package demo.dhcc.com.mvpdemo.mvp;

import demo.dhcc.com.mvpdemo.Callback;

/**
 * ${title}
 *
 * @author zongsw
 * @created 2018/7/4 下午3:55.
 */
public class SimplePresenter<T extends IBaseView> implements IBasePresenter {

    private T mIBaseView;

    private SimpleModel mSimpleModel;

    public SimplePresenter(T view) {
        mIBaseView = view;
        mSimpleModel = new SimpleModel();
    }

    public void getDate(String s) {

        mSimpleModel.getGetHttp(new Callback() {
            @Override
            public void onCallBack(Object o) {
                mIBaseView.update(o);
            }
        });

    }


    public void postDate(String s) {

        mSimpleModel.getPostHttp(new Callback() {
            @Override
            public void onCallBack(Object o) {
                mIBaseView.update(o);
            }
        });

    }
}
