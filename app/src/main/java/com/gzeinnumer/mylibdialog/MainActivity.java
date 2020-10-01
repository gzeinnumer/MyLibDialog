package com.gzeinnumer.mylibdialog;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
//import com.gzeinnumer.mylibdialog.constant.ButtonStyle;
//import com.gzeinnumer.mylibdialog.constant.DateScreenStyle;
//import com.gzeinnumer.mylibdialog.constant.DialogType;
//import com.gzeinnumer.mylibdialog.dialog.confirmDialog.ConfirmDialog;
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
//        _InfoDialog();
//        _NumberPickerDialog();
//        _LoadingDialog();
//        _DatePickerDialogSingleNew();
//        _DatePickerDialogMultiNew();
//        _TimePickerDialog();
    }

//    private void _ConfirmDialog() {
//        ((Button) findViewById(R.id.btn)).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                new ConfirmDialog(getSupportFragmentManager())
//                        .setDialogCanvas(getResources().getDrawable(R.drawable.rounded_corner_2))
//                        .setTitle("ini title")
//                        .setTitleSize(21)
//                        .setTitleColor(getResources().getColor(R.color.colorAccent))
//                        .setTitleAlignment(View.TEXT_ALIGNMENT_INHERIT)
//                        .setTitleAlignment(View.TEXT_ALIGNMENT_TEXT_END)
//                        .setContent("ini content")
//                        .setContentSize(21)
//                        .setContentColor(Color.parseColor("#03DAC5"))
//                        .setContentAlignment(View.TEXT_ALIGNMENT_TEXT_END)
//                        .setBtnCancelTitle("Batal")
//                        .setBtnCancelTitleColor(getResources().getColor(R.color.colorAccent))
//                        .setBtnOkTitle("Yuhuu")
//                        .setBtnOkTitleColor(getResources().getColor(R.color.colorAccent))
//                        .setButtonTextSize(15)
//                        .setButtonStyle(ButtonStyle.ButtonContained)
//                        .setOkIconLeft(R.drawable.ic_baseline_add_24)
//                        .setCancelIconLeft(R.drawable.ic_baseline_add_24)
//                        .setOkIconTop(R.drawable.ic_baseline_add_24)
//                        .setCancelIconTop(R.drawable.ic_baseline_add_24)
//                        .setOkIconRight(R.drawable.ic_baseline_add_24)
//                        .setCancelIconRight(R.drawable.ic_baseline_add_24)
//                        .setOkIconBottom(R.drawable.ic_baseline_add_24)
//                        .setCancelIconBottom(R.drawable.ic_baseline_add_24)
//                        .setButtonGravity(Gravity.CENTER)
//                        .onCancelPressedCallBack(new ConfirmDialog.OnCancelPressed() {
//                            @Override
//                            public void onCancelPressed() {
//                                Toast.makeText(MainActivity.this, "Cancel", Toast.LENGTH_SHORT).show();
//                            }
//                        })
//                        .onOkPressedCallBack(new ConfirmDialog.OnOkPressed() {
//                            @Override
//                            public void onOkPressed() {
//                                Toast.makeText(MainActivity.this, "Ok", Toast.LENGTH_SHORT).show();
//                            }
//                        })
//                        .show();
//            }
//        });
//    }
//
//    private void _InfoDialog() {
//        ((Button) findViewById(R.id.btn)).setOnClickListener(new View.OnClickListener() {
//            @SuppressLint("UseCompatLoadingForDrawables")
//            @Override
//            public void onClick(View v) {
//                new InfoDialog(getSupportFragmentManager())
//                        .setDialogType(DialogType.DialogSuccess)
//                        .setDialogCanvas(getResources().getDrawable(R.drawable.rounded_corner_2))
//                        .setTitle("ini title")
//                        .setTitleSize(21)
//                        .setTitleColor(getResources().getColor(R.color.colorAccent))
//                        .setTitleAlignment(View.TEXT_ALIGNMENT_INHERIT)
//                        .setTitleAlignment(View.TEXT_ALIGNMENT_TEXT_END)
//                        .setContent("ini content")
//                        .setContentSize(21)
//                        .setContentColor(Color.parseColor("#03DAC5"))
//                        .setContentAlignment(View.TEXT_ALIGNMENT_TEXT_END)
//                        .setBtnOkTitle("Yuhuu")
//                        .setBtnOkTitleColor(getResources().getColor(R.color.colorAccent))
//                        .setButtonTextSize(15)
//                        .setButtonStyle(ButtonStyle.ButtonContained)
//                        .setOkIconLeft(R.drawable.ic_baseline_add_24)
//                        .setOkIconTop(R.drawable.ic_baseline_add_24)
//                        .setOkIconRight(R.drawable.ic_baseline_add_24)
//                        .setOkIconBottom(R.drawable.ic_baseline_add_24)
//                        .setButtonGravity(Gravity.CENTER)
//                        .onOkPressedCallBack(new InfoDialog.OnOkPressed() {
//                            @Override
//                            public void onOkPressed() {
//                                Toast.makeText(MainActivity.this, "Ok", Toast.LENGTH_SHORT).show();
//                            }
//                        })
//                        .show();
//            }
//        });
//    }

//    private void _NumberPickerDialog() {
//        ((Button) findViewById(R.id.btn)).setOnClickListener(new View.OnClickListener() {
//            @SuppressLint("UseCompatLoadingForDrawables")
//            @Override
//            public void onClick(View v) {
//                new NumberPickerDialog(getSupportFragmentManager())
//                        .setLastValue(12)
//                        .setDialogCanvas(getResources().getDrawable(R.drawable.rounded_layer))
//                        .setTitle("ini title")
//                        .setTitleSize(21)
//                        .setTitleColor(getResources().getColor(R.color.colorAccent))
//                        .setTitleAlignment(View.TEXT_ALIGNMENT_INHERIT)
//                        .setTitleAlignment(View.TEXT_ALIGNMENT_TEXT_END)
//                        .setContent("ini content")
//                        .setContentSize(21)
//                        .setContentColor(Color.parseColor("#03DAC5"))
//                        .setContentAlignment(View.TEXT_ALIGNMENT_TEXT_END)
//                        .setBtnOkTitle("Yuhuu")
//                        .setBtnOkTitleColor(getResources().getColor(R.color.colorAccent))
//                        .setButtonTextSize(15)
//                        .setButtonStyle(ButtonStyle.ButtonContained)
//                        .setOkIconLeft(R.drawable.ic_baseline_add_24)
//                        .setOkIconTop(R.drawable.ic_baseline_add_24)
//                        .setOkIconRight(R.drawable.ic_baseline_add_24)
//                        .setOkIconBottom(R.drawable.ic_baseline_add_24)
//                        .setButtonGravity(Gravity.CENTER)
//                        .onOkPressedCallBack(new NumberPickerDialog.OnOkPressed() {
//                            @Override
//                            public void onOkPressed(int value) {
//                                Toast.makeText(MainActivity.this, "Nilai nya " + value, Toast.LENGTH_SHORT).show();
//                            }
//                        })
//                        .show();
//            }
//        });
//    }

//    private void _LoadingDialog() {
//        ((Button) findViewById(R.id.btn)).setOnClickListener(new View.OnClickListener() {
//            @SuppressLint("UseCompatLoadingForDrawables")
//            @Override
//            public void onClick(View v) {
//                final LoadingDialog loadingDialog = new LoadingDialog(getSupportFragmentManager())
//                        .setDialogCanvas(getResources().getDrawable(R.drawable.rounded_layer))
//                        .setContent("ini content");
//                        .setContentSize(21)
//                        .setContentColor(Color.parseColor("#03DAC5"))
//                        .setContentAlignment(View.TEXT_ALIGNMENT_TEXT_END);

//                loadingDialog.show();
//
//                Thread timer = new Thread() {
//                    public void run() {
//                        try {
//                            sleep(5000);
//                        } catch (Exception e) {
//                            e.printStackTrace();
//                        } finally {
//                            loadingDialog.dismis();
//                        }
//                    }
//                };
//                timer.start();
//            }
//        });
//
//    }
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