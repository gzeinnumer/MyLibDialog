package com.gzeinnumer.mylibstesting;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyLibDialog();
    }

    private void MyLibDialog() {
        new SingleDatePickerDialog(getSupportFragmentManager())
                .setDialogScreen(DateScreenStyle.FullScreen)
                .setTimeZone("GMT")
                .setTitle("Pilih tanggal")
                .setSelectedToday(true)
                .setTimeFormat("dd/MM/yyyy")
                .setStartDate("1/08/2020")
                .setEndDate("31/12/2020")
                .onOkPressedCallBack(new SingleDatePickerDialog.OnOkPressed() {
                    @Override
                    public void onOkPressed(String value) {
                        Toast.makeText(MainActivity.this, value, Toast.LENGTH_SHORT).show();
                    }
                })
                .build()
                .show();
    }
}