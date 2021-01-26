package com.gzeinnumer.mylibdialog;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.gzeinnumer.mylibdialog.constant.ButtonStyle;
import com.gzeinnumer.mylibdialog.dialog.numberPicker.NumberPickerDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new NumberPickerDialog(getSupportFragmentManager())
                .setLastValue(12)
                .setTitle("ini title")
                .setContent("ini content")
                .setContentColor(getResources().getColor(R.color.colorPrimary))
                .setButtonStyle(ButtonStyle.ButtonContained)
                .setButtonColor(getResources().getColor(R.color.red_500))
//                .setButtonColor(Color.parseColor("#03DAC5"))
                .onOkPressedCallBack(new NumberPickerDialog.OnOkPressed() {
                    @Override
                    public void onOkPressed(int value) {
                        Toast.makeText(MainActivity.this, "Nilai nya " + value, Toast.LENGTH_SHORT).show();
                    }
                })
                .onCancelPressedCallBack(new NumberPickerDialog.OnCancelPressed() {
                    @Override
                    public void onCancelPressed() {
                        Toast.makeText(MainActivity.this, "Cancel", Toast.LENGTH_SHORT).show();
                    }
                })
                .show();
    }
}