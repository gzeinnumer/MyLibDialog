package com.gzeinnumer.mylibdialog;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.gzeinnumer.mylibdialog.constant.ButtonStyle;
import com.gzeinnumer.mylibdialog.dialog.confirmDialog.ConfirmDialog;
import com.gzeinnumer.mylibdialog.dialog.infoDialog.InfoDialog;
import com.gzeinnumer.mylibdialog.dialog.numberPicker.NumberPickerDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConfirmDialog dialog = new ConfirmDialog(getSupportFragmentManager())
                .setTitle("ini title")
                .setContentColor(getResources().getColor(R.color.colorPrimary))
                .setButtonStyle(ButtonStyle.ButtonContained)
//                .setButtonColor(R.color.amber_200)
                .setContent("ini content");

        dialog.onCancelPressedCallBack(new ConfirmDialog.OnCancelPressed() {
            @Override
            public void onCancelPressed() {
                Toast.makeText(MainActivity.this, "Cancel", Toast.LENGTH_SHORT).show();
            }
        });

        dialog.onOkPressedCallBack(new ConfirmDialog.OnOkPressed() {
            @Override
            public void onOkPressed() {
                Toast.makeText(MainActivity.this, "Ok", Toast.LENGTH_SHORT).show();
            }
        });

        dialog.show();
    }
}