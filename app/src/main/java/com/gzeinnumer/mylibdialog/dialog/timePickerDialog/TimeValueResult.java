package com.gzeinnumer.mylibdialog.dialog.timePickerDialog;

public class TimeValueResult {
    private int hour, minutes;

    public TimeValueResult(int hour, int minutes) {
        this.hour = hour;
        this.minutes = minutes;
    }

    public int getHour() {
        return hour;
    }

    public int getMinutes() {
        return minutes;
    }
}
