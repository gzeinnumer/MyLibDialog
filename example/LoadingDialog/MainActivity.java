package com.gzeinnumer.mylibstesting;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyLibDialog();
    }

    private void MyLibDialog() {
        final LoadingDialog loadingDialog = new LoadingDialog(getSupportFragmentManager())
                .setDialogCanvas(getResources().getDrawable(R.drawable.rounded_corner_2))
                .setContent("ini content")
                .setContentSize(21)
                .setContentColor(Color.parseColor("#03DAC5"))
                .setContentAlignment(View.TEXT_ALIGNMENT_TEXT_END);

        loadingDialog.show();

        Thread timer = new Thread() {
            public void run() {
                try {
                    sleep(5000);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    loadingDialog.dismis();
                }
            }
        };
        timer.start();
    }
}