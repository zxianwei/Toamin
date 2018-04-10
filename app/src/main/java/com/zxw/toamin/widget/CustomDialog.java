package com.zxw.toamin.widget;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.zxw.toamin.R;

/**
 * Created by renjibo on 2018/4/10.
 * 自定义圆角dialog
 */

public class CustomDialog extends Dialog {

  public CustomDialog(Context context, View view,int style){

      super(context,style);

      setContentView(view);

      Window window=getWindow();

      WindowManager.LayoutParams attributes = window.getAttributes();

      attributes.gravity= Gravity.CENTER;

      window.setAttributes(attributes);

  }
    /**
     * 宽高由这个方法控制
     */
    public CustomDialog(Context context, int width, int height, View layout,
                        int style) {
        super(context, style);
        // 设置内容
        setContentView(layout);
        // 设置窗口属性
        Window window = getWindow();
        WindowManager.LayoutParams params = window.getAttributes();
        // 设置宽度、高度、密度、对齐方式
        float density = getDensity(context);
        params.width = (int) (width * density);
        params.height = (int) (height * density);
        params.gravity = Gravity.CENTER;
        window.setAttributes(params);

    }

    private float getDensity(Context context) {
        Resources res = context.getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        return dm.density;
    }
}
