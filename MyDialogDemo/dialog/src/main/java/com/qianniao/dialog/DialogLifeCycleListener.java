package com.qianniao.dialog;

import android.app.Dialog;

public interface DialogLifeCycleListener {
    void onCreate(Dialog alertDialog);

    void onShow(Dialog alertDialog);

    void onDismiss();
}
