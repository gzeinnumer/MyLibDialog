package com.gzeinnumer.mylibdialog.dialog.infoDialog;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.gzeinnumer.mylibdialog.R;
import com.gzeinnumer.mylibdialog.constant.ButtonStyle;
import com.gzeinnumer.mylibdialog.constant.DialogType;
import com.gzeinnumer.mylibdialog.dialog.BaseDialog;

public class InfoDialogSetting extends BaseDialog {

    protected InfoDialog.OnCancelPressed onCancelPressed;

    protected InfoDialog.OnOkPressed onOkPressed;
    private CountDownTimer countDownTimer;

    protected int buttonColor = 0;
    protected boolean buttonAllCaps = true;

    private View _view;
    private LinearLayout _dialogCanvas;
    private LinearLayout _dialogCanvasContent;
    private LinearLayout _parentButton;
    private TextView _tvTitle;
    private TextView _tvContent;
    private Button _dBtnOkMBT;
    private Button _dBtnOkMBO;
    private Button _dBtnOkMBC;
    protected ButtonStyle btnStyle;
    protected DialogType dialogType = DialogType.DialogSuccess;

    protected String tvTitleValue;
    protected String tvContentValue;
    protected String dBtnOkValue;

    protected Drawable shapeCanvas = null;
    protected double tvTitleSize = 0;
    protected double tvContentSize = 0;
    protected double dBtnTextSize = 0;

    protected int tvTitleColor = 0;
    protected int tvContentColor = 0;
    protected int btnTextColorOk = 0;

    protected int okIconL = 0;
    protected int okIconT = 0;
    protected int okIconR = 0;
    protected int okIconB = 0;

    protected int buttonGravity = -100;

    protected int tvTitleAlignment = View.TEXT_ALIGNMENT_CENTER; //default from view
    protected int tvContentAlignment = View.TEXT_ALIGNMENT_TEXT_START; //default from view

    protected int dismissIn = -1;

    private void initView() {
        _dialogCanvas = _view.findViewById(R.id.dialog_canvas);
        _dialogCanvasContent = _view.findViewById(R.id.dialog_canvas_content);
        _parentButton = _view.findViewById(R.id.parent_button);
        _tvTitle = _view.findViewById(R.id.tv_title);
        _tvContent = _view.findViewById(R.id.tv_content);
        _dBtnOkMBT = _view.findViewById(R.id.d_btn_ok_MBT);
        _dBtnOkMBO = _view.findViewById(R.id.d_btn_ok_MBO);
        _dBtnOkMBC = _view.findViewById(R.id.d_btn_ok_MBC);
    }

    @Override
    protected int contentView() {
        return R.layout.info_dialog;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this._view = view;
        initView();
        initDesign();
        initOnClick();
    }

    private void initDesign() {
        if (dialogType!=null){
            if (dialogType == DialogType.DialogSuccess){
                _tvTitle.setTextColor(getResources().getColor(R.color.green_500));
                _dBtnOkMBT.setTextColor(getResources().getColor(R.color.green_500));
                _dBtnOkMBO.setTextColor(getResources().getColor(R.color.green_500));
                _dBtnOkMBC.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.green_500)));
            }
            if (dialogType == DialogType.DialogError){
                _tvTitle.setTextColor(getResources().getColor(R.color.red_500));
                _dBtnOkMBT.setTextColor(getResources().getColor(R.color.red_500));
                _dBtnOkMBO.setTextColor(getResources().getColor(R.color.red_500));
                _dBtnOkMBC.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.red_500)));
            }
            if (dialogType == DialogType.DialogWarning){
                _tvTitle.setTextColor(getResources().getColor(R.color.yellow_500));
                _dBtnOkMBT.setTextColor(getResources().getColor(R.color.yellow_500));
                _dBtnOkMBO.setTextColor(getResources().getColor(R.color.yellow_500));
                _dBtnOkMBC.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.yellow_500)));
            }
        }

        if (shapeCanvas!=null)
            _dialogCanvas.setBackground(shapeCanvas);

        if (tvTitleValue != null)
            _tvTitle.setText(tvTitleValue);
        else
            _tvTitle.setVisibility(View.GONE);

        if (tvContentValue != null)
            _tvContent.setText(tvContentValue);
        else
            _tvContent.setVisibility(View.GONE);

        if (dBtnOkValue != null){
            _dBtnOkMBT.setText(dBtnOkValue);
            _dBtnOkMBO.setText(dBtnOkValue);
            _dBtnOkMBC.setText(dBtnOkValue);
        }

        if (btnStyle != null) {
            if (btnStyle == ButtonStyle.ButtonText) {
                btnVisibleOk(_dBtnOkMBT, View.VISIBLE);
            }
            if (btnStyle == ButtonStyle.ButtonOutlined) {
                btnVisibleOk(_dBtnOkMBO, View.VISIBLE);
            }
            if (btnStyle == ButtonStyle.ButtonContained) {
                btnVisibleOk(_dBtnOkMBC, View.VISIBLE);
            }
        } else {
            btnVisibleOk(_dBtnOkMBT, View.VISIBLE);
        }

        if (tvTitleSize!=0)
            _tvTitle.setTextSize((float) tvTitleSize);

        if (tvContentSize!=0)
            _tvContent.setTextSize((float) tvContentSize);

        if (dBtnTextSize!=0){
            _dBtnOkMBT.setTextSize((float) dBtnTextSize);
            _dBtnOkMBO.setTextSize((float) dBtnTextSize);
            _dBtnOkMBC.setTextSize((float) dBtnTextSize);
        }

        if (tvTitleColor!=0)
            _tvTitle.setTextColor(tvTitleColor);

        if (tvContentColor!=0)
            _tvContent.setTextColor(tvContentColor);

        if (btnTextColorOk!=0){
            _dBtnOkMBT.setTextColor(btnTextColorOk);
            _dBtnOkMBO.setTextColor(btnTextColorOk);
            _dBtnOkMBC.setTextColor(btnTextColorOk);
        }

        if(buttonGravity!=-100){
            _parentButton.setGravity(buttonGravity);
        }

        if(tvTitleAlignment != View.TEXT_ALIGNMENT_CENTER){
            _tvTitle.setTextAlignment(tvTitleAlignment);
        }

        if(tvContentAlignment != View.TEXT_ALIGNMENT_TEXT_START){
            _tvContent.setTextAlignment(tvContentAlignment);
        }

        if (buttonColor!=0 && btnStyle == ButtonStyle.ButtonContained){
            _dBtnOkMBC.setBackgroundColor(getResources().getColor(buttonColor));
        }

        if (!buttonAllCaps){
            _dBtnOkMBT.setAllCaps(false);
            _dBtnOkMBO.setAllCaps(false);
            _dBtnOkMBC.setAllCaps(false);
        }

        if (dismissIn!=-1){
            String btnNameT  = _dBtnOkMBT.getText().toString();
            String btnNameO  = _dBtnOkMBO.getText().toString();
            String btnNameC  = _dBtnOkMBC.getText().toString();

            countDownTimer = new CountDownTimer((dismissIn+1)*1000, 1000) {

                public void onTick(long millisUntilFinished) {
                    int progress = (int) millisUntilFinished / 1000;
                    _dBtnOkMBT.setText(btnNameT+"("+progress+")");
                    _dBtnOkMBO.setText(btnNameO+"("+progress+")");
                    _dBtnOkMBC.setText(btnNameC+"("+progress+")");
                }

                public void onFinish() {
                    try {
                        _dBtnOkMBT.performClick();
                        _dBtnOkMBO.performClick();
                        _dBtnOkMBC.performClick();
                    } catch (Exception e){
                        e.printStackTrace();
                    }
                }
            };
            countDownTimer.start();
        }
    }


    private void initOnClick() {
        _dBtnOkMBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onOkPressed != null){
                    countDownTimer.cancel();
                    onOkPressed.onOkPressed();
                }
                getDialog().dismiss();
            }
        });
        _dBtnOkMBO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onOkPressed != null){
                    countDownTimer.cancel();
                    onOkPressed.onOkPressed();
                }
                getDialog().dismiss();
            }
        });
        _dBtnOkMBC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onOkPressed != null){
                    countDownTimer.cancel();
                    onOkPressed.onOkPressed();
                }
                getDialog().dismiss();
            }
        });
    }

    private void btnVisibleOk(Button button, int visible) {
        button.setVisibility(visible);
        button.setVisibility(visible);
        if (okIconL != 0 || okIconT != 0 || okIconR != 0 || okIconB != 0) {
            if (okIconT !=0 || okIconB !=0){
                ViewGroup.LayoutParams lp = button.getLayoutParams();
                lp.height = LinearLayout.LayoutParams.WRAP_CONTENT;
                button.setLayoutParams(lp);
            }
            button.setCompoundDrawablesWithIntrinsicBounds(okIconL, okIconT, okIconR, okIconB);
        }
    }
}
