package com.gzeinnumer.mylibdialog.dialog.datePickerDialog.single;

import androidx.fragment.app.FragmentManager;

import com.gzeinnumer.mylibdialog.constant.DateScreenStyle;

public class SingleDatePickerDialog extends SingleDatePickerDialogSetting {

    public static final String TAG = "CustomDialog";
    FragmentManager context;

    public SingleDatePickerDialog(FragmentManager context) {
        this.context = context;
        builder = buildBuilder();
    }

    //TITLE
    public SingleDatePickerDialog setTitle(String title) {
        this.tvTitleValue = title;
        return this;
    }

    //TIME ZONE
    public SingleDatePickerDialog setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    //ACTION CALLBACK
    public SingleDatePickerDialog onCancelPressedCallBack(OnCancelPressed callBack) {
        this.onCancelPressed = callBack;
        return this;
    }
    public SingleDatePickerDialog onOkPressedCallBack(OnOkPressed callBack) {
        this.onOkPressed = callBack;
        return this;
    }

    public SingleDatePickerDialog build() {
        buildDialog();
        return this;
    }

    public void show() {
        showDialog(context);
    }

    public SingleDatePickerDialog setSelectedToday(boolean isSelectToday) {
        this.isSelectToday = isSelectToday;
        return this;
    }

    public SingleDatePickerDialog setTimeFormat(String timeFormat) {
        this.timeFormat = timeFormat;
        return this;
    }

    public SingleDatePickerDialog setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    public SingleDatePickerDialog setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    public SingleDatePickerDialog setDialogScreen(DateScreenStyle dateScreenStyle) {
        this.dateScreenStyle = dateScreenStyle;
        return this;
    }

    public SingleDatePickerDialog setTheme(int dialogTheme) {
        this.dialogTheme = dialogTheme;
        return this;
    }

    //callback
    public interface OnCancelPressed {
        void onCancelPressed();
    }

    public interface OnOkPressed {
        void onOkPressed(String value);
    }
}