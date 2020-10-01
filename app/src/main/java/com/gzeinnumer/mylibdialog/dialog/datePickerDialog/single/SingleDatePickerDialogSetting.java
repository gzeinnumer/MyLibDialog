package com.gzeinnumer.mylibdialog.dialog.datePickerDialog.single;

import android.annotation.SuppressLint;

import androidx.fragment.app.FragmentManager;

import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener;
import com.gzeinnumer.mylibdialog.R;
import com.gzeinnumer.mylibdialog.constant.DateScreenStyle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class SingleDatePickerDialogSetting {

    protected SingleDatePickerDialog.OnCancelPressed onCancelPressed;

    protected SingleDatePickerDialog.OnOkPressed onOkPressed;

    protected MaterialDatePicker.Builder builder;
    protected MaterialDatePicker materialDatePicker;

    protected String tvTitleValue;
    protected String timeZone = "GMT";

    protected Calendar calendar;

    protected DateScreenStyle dateScreenStyle = DateScreenStyle.DialogScreen;

    protected boolean isSelectToday = true;

    protected String timeFormat = "dd-MM-yyyy";
    protected String startDate;
    protected String endDate;

    private SimpleDateFormat sdf;

    protected int dialogTheme = 0;

    protected MaterialDatePicker.Builder buildBuilder() {
        return MaterialDatePicker.Builder.datePicker();
    }

    @SuppressLint("SimpleDateFormat")
    protected void buildDialog() {
        long today = MaterialDatePicker.todayInUtcMilliseconds();
        if (!timeZone.equals("GMT")){
            calendar = Calendar.getInstance(TimeZone.getTimeZone(timeZone));
            calendar.clear();
            calendar.setTimeInMillis(today);
        }
        if (tvTitleValue!=null){
            builder.setTitleText(tvTitleValue);
        }
        if (dateScreenStyle ==DateScreenStyle.DialogScreen){
            builder.setTheme(R.style.ThemeOverlay_MaterialComponents_MaterialCalendar);
        }else if(dateScreenStyle ==DateScreenStyle.FullScreen){
            builder.setTheme(R.style.ThemeOverlay_MaterialComponents_MaterialCalendar_Fullscreen);
        }
        if (isSelectToday){
            builder.setSelection(today);
        }
        if (timeFormat==null){
            timeFormat = "dd-MM-yyyy";
        }
        if (dialogTheme!=0){
            builder.setTheme(dialogTheme);
        }

        sdf = new SimpleDateFormat(timeFormat);

        long sDate = 0;
        if (startDate!=null){
            Date date = null;
            try {
                date = sdf.parse(startDate);
            } catch (ParseException e) {
                e.printStackTrace();
            }

            sDate = date.getTime();
        }

        long eDate = 0;
        if (endDate!=null){
            Date date = null;
            try {
                date = sdf.parse(endDate);
            } catch (ParseException e) {
                e.printStackTrace();
            }

            eDate = date.getTime();
        }
        if (sDate!=0 || eDate!=0){
            CalendarConstraints.Builder cBuilder = new CalendarConstraints.Builder();
            if (sDate!=0){
                cBuilder.setStart(sDate);
            }
            if (eDate!=0){
                cBuilder.setEnd(eDate);
            }

            builder.setCalendarConstraints(cBuilder.build());
        }

        materialDatePicker = builder.build();
        initOnClick();
    }

    private void initOnClick() {
        materialDatePicker.addOnPositiveButtonClickListener(new MaterialPickerOnPositiveButtonClickListener<Long>() {
            @Override
            public void onPositiveButtonClick(Long selection) {
                onOkPressed.onOkPressed(sdf.format(new Date(selection)));
            }
        });
    }

    protected void showDialog(FragmentManager context) {
        materialDatePicker.show(context, "DATE_PICKER");
    }
}

