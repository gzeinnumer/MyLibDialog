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
        new MultiDatePickerDialog(getSupportFragmentManager())
                .setDialogScreen(DateScreenStyle.FullScreen)
                .setTimeZone("GMT")
                .setTitle("Pilih tanggal")
                .setTimeFormat("dd/MM/yyyy")
                .setStartDate("1/08/2020")
                .setEndDate("31/12/2020")
                .onOkPressedCallBack(new MultiDatePickerDialog.OnOkPressed() {
                    @Override
                    public void onOkPressed(String firstDate, String secondDate) {
                        Toast.makeText(MainActivity.this, firstDate + " - " + secondDate, Toast.LENGTH_SHORT).show();
                    }
                })
                .build()
                .show();
    }
}