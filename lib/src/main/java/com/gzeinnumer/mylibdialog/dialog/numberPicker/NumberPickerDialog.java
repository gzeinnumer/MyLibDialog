package com.gzeinnumer.mylibdialog.dialog.numberPicker;

import android.graphics.drawable.Drawable;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.gzeinnumer.mylibdialog.constant.ButtonStyle;

public class NumberPickerDialog extends NumberPickerDialogSetting {

    public static final String TAG = "CustomDialog";

    private final FragmentManager _context;
    private final FragmentTransaction _transaction;

    public NumberPickerDialog(FragmentManager context) {
        this._context = context;

        _transaction = _context.beginTransaction();
        Fragment previous = _context.findFragmentByTag(NumberPickerDialog.TAG);
        if (previous != null) {
            _transaction.remove(previous);
        }
    }

    public NumberPickerDialog setAnimationStyle(int animationStyle) {
        this.animationStyle = animationStyle;
        return this;
    }

    //CANVAS
    public NumberPickerDialog setDialogCanvas(Drawable resource) {
        this.shapeCanvas = resource;
        return this;
    }

    //TITLE
    public NumberPickerDialog setTitle(String title) {
        this.tvTitleValue = title;
        return this;
    }
    public NumberPickerDialog setTitleSize(int size) {
        this.tvTitleSize = size;
        return this;
    }
    public NumberPickerDialog setTitleColor(int color) {
        this.tvTitleColor = color;
        return this;
    }
    public NumberPickerDialog setTitleAlignment(int alignment) {
        this.tvTitleAlignment = alignment;
        return this;
    }

    //CONTENT
    public NumberPickerDialog setContent(String title) {
        this.tvContentValue = title;
        return this;
    }
    public NumberPickerDialog setContentSize(int size) {
        this.tvContentSize = size;
        return this;
    }
    public NumberPickerDialog setContentColor(int color) {
        this.tvContentColor = color;
        return this;
    }
    public NumberPickerDialog setContentAlignment(int alignment) {
        this.tvContentAlignment = alignment;
        return this;
    }

    //OK
    public NumberPickerDialog setBtnOkTitle(String title) {
        this.dBtnOkValue = title;
        return this;
    }
    public NumberPickerDialog setBtnOkTitleColor(int color) {
        this.btnTextColorOk = color;
        return this;
    }

    //OK ICON
    public NumberPickerDialog setOkIconLeft(int icon) {
        this.okIconL = icon;
        return this;
    }
    public NumberPickerDialog setOkIconTop(int icon) {
        this.okIconT = icon;
        return this;
    }
    public NumberPickerDialog setOkIconRight(int icon) {
        this.okIconR = icon;
        return this;
    }
    public NumberPickerDialog setOkIconBottom(int icon) {
        this.okIconB = icon;
        return this;
    }

    //CANCEL
    public NumberPickerDialog setBtnCancelTitle(String title) {
        this.dBtnCancelValue = title;
        return this;
    }
    public NumberPickerDialog setBtnCancelTitleColor(int color) {
        this.btnTextColorCancel = color;
        return this;
    }

    //CANCEL ICON
    public NumberPickerDialog setCancelIconLeft(int icon) {
        this.cancelIconL = icon;
        return this;
    }
    public NumberPickerDialog setCancelIconTop(int icon) {
        this.cancelIconT = icon;
        return this;
    }
    public NumberPickerDialog setCancelIconRight(int icon) {
        this.cancelIconR = icon;
        return this;
    }
    public NumberPickerDialog setCancelIconBottom(int icon) {
        this.cancelIconB = icon;
        return this;
    }

    //BUTTON STYLE
    public NumberPickerDialog setButtonStyle(ButtonStyle style) {
        this.btnStyle = style;
        return this;
    }
    public NumberPickerDialog setButtonTextSize(int size) {
        this.dBtnTextSize = size;
        return this;
    }
    public NumberPickerDialog setButtonGravity(int gravity) {
        this.buttonGravity = gravity;
        return this;
    }
    public NumberPickerDialog setButtonColor(int color) {
        this.buttonColor = color;
        return this;
    }
    public NumberPickerDialog setButtonAllCaps(boolean buttonAllCaps) {
        this.buttonAllCaps = buttonAllCaps;
        return this;
    }

    //ACTION CALLBACK
    public NumberPickerDialog onCancelPressedCallBack(OnCancelPressed callBack) {
        this.onCancelPressed = callBack;
        return this;
    }

    public NumberPickerDialog onOkPressedCallBack(OnOkPressed callBack) {
        this.onOkPressed = callBack;
        return this;
    }

    //cancleable
    public NumberPickerDialog setCanceledOnTouchOutside(boolean enableOnTouch) {
        this.canceledOnTouchOutside = enableOnTouch;
        return this;
    }

    public void show() {
        this.show(_transaction, NumberPickerDialog.TAG);
    }

    public NumberPickerDialog setLastValue(int number) {
        this.lastValue = number;
        return this;
    }

    //callback
    public interface OnCancelPressed {
        void onCancelPressed();
    }

    public interface OnOkPressed {
        void onOkPressed(int value);
    }
}