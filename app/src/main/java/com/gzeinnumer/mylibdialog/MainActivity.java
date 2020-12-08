package com.gzeinnumer.mylibdialog;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
//import com.gzeinnumer.mylibdialog.constant.ButtonStyle;
//import com.gzeinnumer.mylibdialog.constant.DateScreenStyle;
//import com.gzeinnumer.mylibdialog.constant.DialogType;
import com.gzeinnumer.mylibdialog.dialog.confirmDialog.ConfirmDialog;
//import com.gzeinnumer.mylibdialog.dialog.datePickerDialog.multi.MultiDatePickerDialog;
//import com.gzeinnumer.mylibdialog.dialog.datePickerDialog.single.SingleDatePickerDialog;
//import com.gzeinnumer.mylibdialog.dialog.infoDialog.InfoDialog;
//import com.gzeinnumer.mylibdialog.dialog.loadingDialog.LoadingDialog;
//import com.gzeinnumer.mylibdialog.dialog.numberPicker.NumberPickerDialog;
//import com.gzeinnumer.mylibdialog.dialog.timePickerDialog.TimePickerDialog;
//import com.gzeinnumer.mylibdialog.dialog.timePickerDialog.TimeValueResult;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((Button) findViewById(R.id.btn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                ConfirmDialog dialog = new ConfirmDialog(getSupportFragmentManager())
                        .setAnimationStyle(R.style.DialogStyle_Slide)
                        .setTitle("ini title")
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
        });

//        _DatePickerDialogMultiNew();
//        _TimePickerDialog();
    }
//
//    private void _DatePickerDialogSingleNew() {
//        ((Button) findViewById(R.id.btn)).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                new SingleDatePickerDialog(getSupportFragmentManager())
//                        .setTheme(R.style.AppTheme2)
//                        .setDialogScreen(DateScreenStyle.FullScreen)
//                        .setTimeZone("GMT")
//                        .setTitle("Pilih tanggal")
//                        .setSelectedToday(true)
//                        .setTimeFormat("dd/MM/yyyy")
//                        .setStartDate("1/08/2020")
//                        .setEndDate("31/12/2020")
//                        .onOkPressedCallBack(new SingleDatePickerDialog.OnOkPressed() {
//                            @Override
//                            public void onOkPressed(String value) {
//                                Toast.makeText(MainActivity.this, value, Toast.LENGTH_SHORT).show();
//                            }
//                        })
//                        .build()
//                        .show();
//            }
//        });
//    }

//    private void _DatePickerDialogMultiNew() {
//        ((Button) findViewById(R.id.btn)).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                new MultiDatePickerDialog(getSupportFragmentManager())
//                        .setTheme(R.style.AppTheme2)
//                        .setTimeZone("GMT")
//                        .setTitle("Pilih tanggal")
//                        .setTimeFormat("dd/MM/yyyy")
//                        .setStartDate("1/08/2020")
//                        .setEndDate("31/12/2020")
//                        .onOkPressedCallBack(new MultiDatePickerDialog.OnOkPressed() {
//                            @Override
//                            public void onOkPressed(String firstDate, String secondDate) {
//                                Toast.makeText(MainActivity.this, firstDate + " - " + secondDate, Toast.LENGTH_SHORT).show();
//                            }
//                        })
//                        .build()
//                        .show();
//            }
//        });
//    }
//
//    private void _TimePickerDialog() {
//        ((Button) findViewById(R.id.btn)).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                TimePickerDialog timePickerDialog = new TimePickerDialog(getSupportFragmentManager()).setTimeFormat(TimeFormat.CLOCK_24H).build();
//
//                timePickerDialog.show();
//
//                timePickerDialog.setListener(new TimePickerDialog.OnOkPressed() {
//                    @Override
//                    public void onOkPressed(TimeValueResult timeValueResult, String formated) {
//                        Toast.makeText(getApplicationContext(), timeValueResult.getHour() + ":" + timeValueResult.getMinutes() + " / " + formated, Toast.LENGTH_SHORT).show();
//                    }
//                });
//            }
//        });
//    }
}