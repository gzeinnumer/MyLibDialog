package com.gzeinnumer.mylibdialog;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.gzeinnumer.mylibdialog.constant.ButtonStyle;
import com.gzeinnumer.mylibdialog.dialog.infoDialog.InfoDialog;
import com.gzeinnumer.mylibdialog.dialog.numberPicker.NumberPickerDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new InfoDialog(getSupportFragmentManager())
                .autoDismisOnSecond(10)
                .setButtonAllCaps(false)
                .setCanceledOnTouchOutside(false)
                .setButtonGravity(Gravity.CENTER)
                .setContentAlignment(View.TEXT_ALIGNMENT_CENTER)
                .setButtonStyle(ButtonStyle.ButtonContained)
                .setButtonColor(R.color.colorPrimary)
                .setBtnOkTitle("Ya")
                .setContent("Yakin ingin keluar Aplikasi")
                .onOkPressedCallBack(new InfoDialog.OnOkPressed() {
                    @Override
                    public void onOkPressed() {

                    }
                })
                .show();
    }
}