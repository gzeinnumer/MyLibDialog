package com.gzeinnumer.mylibdialog.dialog.timePickerDialog;

import androidx.fragment.app.FragmentManager;

import com.google.android.material.timepicker.MaterialTimePicker;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class TimePickerDialogSetting {

    protected TimePickerDialog.OnOkPressed onOkPressed;
    MaterialTimePicker builder;
    int clockFormat = 0;
    int lastHour = 0;
    int lastMinutes = 0;

    protected MaterialTimePicker buildBuilder() {
        return builder = MaterialTimePicker.newInstance();
    }

    protected void buildDialog() {
        builder.setTimeFormat(clockFormat); // 12 -> 0 // 24 -> 1
        builder.setHour(lastHour);
        builder.setMinute(lastMinutes);
    }

    protected void showDialog(FragmentManager context) {
        builder.show(context, "fragment_tag");
    }

    protected void initOnClick() {
        builder.setListener(dialog -> {
            int newHour = dialog.getHour();
            int newMinute = dialog.getMinute();
            myonTimeSet(newHour, newMinute);
        });
    }

    protected void myonTimeSet(int newHour, int newMinute) {
        String pattern;
        if (clockFormat==0){
            pattern = "hh:mm a";
        }else {
            pattern = "HH:mm";
        }
        final SimpleDateFormat formatter = new SimpleDateFormat(pattern, Locale.getDefault());
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, newHour);
        cal.set(Calendar.MINUTE, newMinute);
        cal.setLenient(false);

        String format = formatter.format(cal.getTime());
        onOkPressed.onOkPressed(new TimeValueResult(newHour, newMinute), format);
    }
}
