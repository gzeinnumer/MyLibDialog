package com.gzeinnumer.mylibstesting;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import com.gzeinnumer.mylibdialog.constant.ButtonStyle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyLibDialog();
    }

    private void MyLibDialog() {
        new NumberPickerDialog(getSupportFragmentManager())
                .setLastValue(12)
                .setDialogCanvas(getResources().getDrawable(com.gzeinnumer.mylibdialog.R.drawable.rounded_corner_2))
                .setTitle("ini title")
                .setTitleSize(21)
                .setTitleColor(getResources().getColor(com.gzeinnumer.mylibdialog.R.color.colorPrimary))
                .setTitleAlignment(View.TEXT_ALIGNMENT_TEXT_END)
                .setContent("ini content")
                .setContentSize(21)
                .setContentColor(Color.parseColor("#03DAC5"))
                .setContentAlignment(View.TEXT_ALIGNMENT_TEXT_END)
                .setBtnOkTitle("Yuhuu")
                .setBtnOkTitleColor(getResources().getColor(com.gzeinnumer.mylibdialog.R.color.purple_500))
                .setButtonTextSize(15)
                .setButtonStyle(ButtonStyle.ButtonContained)
                .setOkIconLeft(com.gzeinnumer.mylibdialog.R.drawable.ic_baseline_add_24)
                .setOkIconTop(com.gzeinnumer.mylibdialog.R.drawable.ic_baseline_add_24)
                .setOkIconRight(com.gzeinnumer.mylibdialog.R.drawable.ic_baseline_add_24)
                .setOkIconBottom(com.gzeinnumer.mylibdialog.R.drawable.ic_baseline_add_24)
                .setButtonGravity(Gravity.CENTER)
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