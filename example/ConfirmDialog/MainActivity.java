package com.gzeinnumer.mylibstesting;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import com.gzeinnumer.mylibdialog.constant.ButtonStyle;
import com.gzeinnumer.mylibdialog.dialog.confirmDialog.ConfirmDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyLibDialog();
    }

    private void MyLibDialog() {
        new ConfirmDialog(getSupportFragmentManager())
                .setDialogCanvas(getResources().getDrawable(R.drawable.rounded_corner_2))
                .setTitle("ini title")
                .setTitleSize(21)
                .setTitleColor(getResources().getColor(R.color.colorPrimary))
                .setTitleAlignment(View.TEXT_ALIGNMENT_TEXT_END)
                .setContent("ini content")
                .setContentSize(21)
                .setContentColor(Color.parseColor("#03DAC5"))
                .setContentAlignment(View.TEXT_ALIGNMENT_TEXT_END)
                .setBtnCancelTitle("Batal")
                .setBtnCancelTitleColor(getResources().getColor(R.color.purple_500))
                .setBtnOkTitle("Yuhuu")
                .setBtnOkTitleColor(getResources().getColor(R.color.red_500))
                .setButtonTextSize(15)
                .setButtonStyle(ButtonStyle.ButtonContained)
                .setButtonStyle(ButtonStyle.ButtonOutlined)
                .setButtonStyle(ButtonStyle.ButtonText)
                .setOkIconLeft(R.drawable.ic_baseline_add_24)
                .setCancelIconLeft(R.drawable.ic_baseline_add_24)
                .setOkIconTop(R.drawable.ic_baseline_add_24)
                .setCancelIconTop(R.drawable.ic_baseline_add_24)
                .setOkIconRight(R.drawable.ic_baseline_add_24)
                .setCancelIconRight(R.drawable.ic_baseline_add_24)
                .setOkIconBottom(R.drawable.ic_baseline_add_24)
                .setCancelIconBottom(R.drawable.ic_baseline_add_24)
                .setButtonGravity(Gravity.END)
                .onCancelPressedCallBack(new ConfirmDialog.OnCancelPressed() {
                    @Override
                    public void onCancelPressed() {
                        Toast.makeText(MainActivity.this, "Cancel", Toast.LENGTH_SHORT).show();
                    }
                })
                .onOkPressedCallBack(new ConfirmDialog.OnOkPressed() {
                    @Override
                    public void onOkPressed() {
                        Toast.makeText(MainActivity.this, "Ok", Toast.LENGTH_SHORT).show();
                    }
                })
                .show();
    }
}