package com.gzeinnumer.mylibdialog.dialog.confirmDialog;

import android.graphics.drawable.Drawable;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.gzeinnumer.mylibdialog.constant.ButtonStyle;

public class ConfirmDialog extends ConfirmDialogSetting {

    public static final String TAG = "CustomDialog";

    private final FragmentManager _context;
    private final FragmentTransaction _transaction;

    public ConfirmDialog(FragmentManager context) {
        this._context = context;

        _transaction = _context.beginTransaction();
        Fragment previous = _context.findFragmentByTag(ConfirmDialog.TAG);
        if (previous != null) {
            _transaction.remove(previous);
        }
    }

    public ConfirmDialog setAnimationStyle(int animationStyle) {
        this.animationStyle = animationStyle;
        return this;
    }

    //CANVAS
    public ConfirmDialog setDialogCanvas(Drawable resource) {
        this.shapeCanvas = resource;
        return this;
    }

    //TITLE
    public ConfirmDialog setTitle(String title) {
        this.tvTitleValue = title;
        return this;
    }
    public ConfirmDialog setTitleSize(int size) {
        this.tvTitleSize = size;
        return this;
    }
    public ConfirmDialog setTitleColor(int color) {
        this.tvTitleColor = color;
        return this;
    }
    public ConfirmDialog setTitleAlignment(int alignment) {
        this.tvTitleAlignment = alignment;
        return this;
    }

    //CONTENT
    public ConfirmDialog setContent(String title) {
        this.tvContentValue = title;
        return this;
    }
    public ConfirmDialog setContentSize(int size) {
        this.tvContentSize = size;
        return this;
    }
    public ConfirmDialog setContentColor(int color) {
        this.tvContentColor = color;
        return this;
    }
    public ConfirmDialog setContentAlignment(int alignment) {
        this.tvContentAlignment = alignment;
        return this;
    }

    //CANCEL
    public ConfirmDialog setBtnCancelTitle(String title) {
        this.dBtnCancelValue = title;
        return this;
    }
    public ConfirmDialog setBtnCancelTitleColor(int color) {
        this.btnTextColorCancel = color;
        return this;
    }

    //CANCEL ICON
    public ConfirmDialog setCancelIconLeft(int icon) {
        this.cancelIconL = icon;
        return this;
    }
    public ConfirmDialog setCancelIconTop(int icon) {
        this.cancelIconT = icon;
        return this;
    }
    public ConfirmDialog setCancelIconRight(int icon) {
        this.cancelIconR = icon;
        return this;
    }
    public ConfirmDialog setCancelIconBottom(int icon) {
        this.cancelIconB = icon;
        return this;
    }

    //OK
    public ConfirmDialog setBtnOkTitle(String title) {
        this.dBtnOkValue = title;
        return this;
    }
    public ConfirmDialog setBtnOkTitleColor(int color) {
        this.btnTextColorOk = color;
        return this;
    }

    //OK ICON
    public ConfirmDialog setOkIconLeft(int icon) {
        this.okIconL = icon;
        return this;
    }
    public ConfirmDialog setOkIconTop(int icon) {
        this.okIconT = icon;
        return this;
    }
    public ConfirmDialog setOkIconRight(int icon) {
        this.okIconR = icon;
        return this;
    }
    public ConfirmDialog setOkIconBottom(int icon) {
        this.okIconB = icon;
        return this;
    }

    //BUTTON STYLE
    public ConfirmDialog setButtonStyle(ButtonStyle style) {
        this.btnStyle = style;
        return this;
    }
    public ConfirmDialog setButtonTextSize(int size) {
        this.dBtnTextSize = size;
        return this;
    }
    public ConfirmDialog setButtonGravity(int gravity) {
        this.buttonGravity = gravity;
        return this;
    }

    public ConfirmDialog setButtonColor(int color) {
        this.buttonColor = color;
        return this;
    }

    public ConfirmDialog setButtonAllCaps(boolean buttonAllCaps) {
        this.buttonAllCaps = buttonAllCaps;
        return this;
    }

    //cancleable
    public ConfirmDialog setCanceledOnTouchOutside(boolean enableOnTouch) {
        this.canceledOnTouchOutside = enableOnTouch;
        return this;
    }

    //ACTION CALLBACK
    public ConfirmDialog onCancelPressedCallBack(OnCancelPressed callBack) {
        this.onCancelPressed = callBack;
        return this;
    }

    public ConfirmDialog onOkPressedCallBack(OnOkPressed callBack) {
        this.onOkPressed = callBack;
        return this;
    }

    public void show() {
        this.show(_transaction, ConfirmDialog.TAG);
    }

    //callback
    public interface OnCancelPressed {
        void onCancelPressed();
    }

    public interface OnOkPressed {
        void onOkPressed();
    }
}