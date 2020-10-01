package com.gzeinnumer.mylibdialog.dialog.timePickerDialog;

import androidx.fragment.app.FragmentManager;

public class TimePickerDialog extends TimePickerDialogSetting {

    public static final String TAG = "CustomDialog";
    FragmentManager context;

    public TimePickerDialog(FragmentManager context) {
        this.context = context;
        builder = buildBuilder();

    }

    public void show() {
        showDialog(context);
    }

    public TimePickerDialog setTimeFormat(int clockFormat) {
        this.clockFormat = clockFormat;
        return this;
    }

    public TimePickerDialog build() {
        buildDialog();
        return this;
    }

    public void setListener(OnOkPressed callback) {
        this.onOkPressed = callback;
        initOnClick();
    }

    public interface OnOkPressed {
        void onOkPressed(TimeValueResult result, String formated);
    }
}
