package com.gzeinnumer.mylibdialog.dialog.loadingDialog;

import android.graphics.drawable.Drawable;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.gzeinnumer.mylibdialog.dialog.confirmDialog.ConfirmDialog;

public class LoadingDialog extends LoadingDialogSetting {

    public static final String TAG = "CustomDialog";

    private FragmentManager _context;
    private FragmentTransaction _transaction;

    public LoadingDialog(FragmentManager context) {
        this._context = context;

        _transaction = _context.beginTransaction();
        Fragment previous = _context.findFragmentByTag(LoadingDialog.TAG);
        if (previous != null) {
            _transaction.remove(previous);
        }
    }

    public LoadingDialog setAnimationStyle(int animationStyle) {
        this.animationStyle = animationStyle;
        return this;
    }

    //CANVAS
    public LoadingDialog setDialogCanvas(Drawable resource) {
        this.shapeCanvas = resource;
        return this;
    }

    //CONTENT
    public LoadingDialog setContent(String title) {
        this.tvContentValue = title;
        return this;
    }
    public LoadingDialog setContentSize(int size) {
        this.tvContentSize = size;
        return this;
    }
    public LoadingDialog setContentColor(int color) {
        this.tvContentColor = color;
        return this;
    }
    public LoadingDialog setContentAlignment(int alignment) {
        this.tvContentAlignment = alignment;
        return this;
    }

    public void show() {
        this.show(_transaction, LoadingDialog.TAG);
    }

    public void dismis() {
        this.dismiss();
    }
}