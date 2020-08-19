package com.qianniao.dialog;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public abstract class ModalBaseDialog extends BaseDialog {
    protected static List<BaseDialog> modalDialogList = new ArrayList<>();         //对话框模态化队列

    protected static void showNextModalDialog(){
        Log.i("###", "showNextModalDialog: "+modalDialogList.size());
        modalDialogList.get(0).showDialog();
    }
}
