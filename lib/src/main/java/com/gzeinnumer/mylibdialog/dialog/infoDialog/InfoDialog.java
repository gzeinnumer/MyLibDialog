package com.gzeinnumer.mylibdialog.dialog.infoDialog;

import android.graphics.drawable.Drawable;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.gzeinnumer.mylibdialog.constant.ButtonStyle;
import com.gzeinnumer.mylibdialog.constant.DialogType;

public class InfoDialog extends InfoDialogSetting {

    public static final String TAG = "CustomDialog";

    private final FragmentManager _context;
    private final FragmentTransaction _transaction;

    public InfoDialog(FragmentManager context) {
        this._context = context;

        _transaction = _context.beginTransaction();
        Fragment previous = _context.findFragmentByTag(InfoDialog.TAG);
        if (previous != null) {
            _transaction.remove(previous);
        }
    }

    public InfoDialog setAnimationStyle(int animationStyle) {
        this.animationStyle = animationStyle;
        return this;
    }

    //CANVAS
    public InfoDialog setDialogCanvas(Drawable resource) {
        this.shapeCanvas = resource;
        return this;
    }

    //TITLE
    public InfoDialog setTitle(String title) {
        this.tvTitleValue = title;
        return this;
    }
    public InfoDialog setTitleSize(int size) {
        this.tvTitleSize = size;
        return this;
    }
    public InfoDialog setTitleColor(int color) {
        this.tvTitleColor = color;
        return this;
    }
    public InfoDialog setTitleAlignment(int alignment) {
        this.tvTitleAlignment = alignment;
        return this;
    }

    //CONTENT
    public InfoDialog setContent(String title) {
        this.tvContentValue = title;
        return this;
    }
    public InfoDialog setContentSize(int size) {
        this.tvContentSize = size;
        return this;
    }
    public InfoDialog setContentColor(int color) {
        this.tvContentColor = color;
        return this;
    }
    public InfoDialog setContentAlignment(int alignment) {
        this.tvContentAlignment = alignment;
        return this;
    }

    //OK
    public InfoDialog setBtnOkTitle(String title) {
        this.dBtnOkValue = title;
        return this;
    }
    public InfoDialog setBtnOkTitleColor(int color) {
        this.btnTextColorOk = color;
        return this;
    }

    //OK ICON
    public InfoDialog setOkIconLeft(int icon) {
        this.okIconL = icon;
        return this;
    }
    public InfoDialog setOkIconTop(int icon) {
        this.okIconT = icon;
        return this;
    }
    public InfoDialog setOkIconRight(int icon) {
        this.okIconR = icon;
        return this;
    }
    public InfoDialog setOkIconBottom(int icon) {
        this.okIconB = icon;
        return this;
    }

    //BUTTON STYLE
    public InfoDialog setButtonStyle(ButtonStyle style) {
        this.btnStyle = style;
        return this;
    }
    public InfoDialog setButtonTextSize(int size) {
        this.dBtnTextSize = size;
        return this;
    }
    public InfoDialog setButtonGravity(int gravity) {
        this.buttonGravity = gravity;
        return this;
    }
    public InfoDialog setDialogType(DialogType dialogType) {
        this.dialogType = dialogType;
        return this;
    }
    public InfoDialog setButtonColor(int color) {
        this.buttonColor = color;
        return this;
    }
    public InfoDialog setButtonAllCaps(boolean buttonAllCaps) {
        this.buttonAllCaps = buttonAllCaps;
        return this;
    }

    //ACTION CALLBACK
    public InfoDialog onCancelPressedCallBack(OnCancelPressed callBack) {
        this.onCancelPressed = callBack;
        return this;
    }

    public InfoDialog onOkPressedCallBack(OnOkPressed callBack) {
        this.onOkPressed = callBack;
        return this;
    }

    //cancleable
    public InfoDialog setCanceledOnTouchOutside(boolean enableOnTouch) {
        this.canceledOnTouchOutside = enableOnTouch;
        return this;
    }

    public InfoDialog autoDismisOnSecond(int second) {
        this.dismissIn = second;
        return this;
    }

    public void show() {
        this.show(_transaction, InfoDialog.TAG);
    }

    //callback
    public interface OnCancelPressed {
        void onCancelPressed();
    }

    public interface OnOkPressed {
        void onOkPressed();
    }
}