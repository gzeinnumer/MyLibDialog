package com.gzeinnumer.mylibstesting;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.gzeinnumer.gzndirectory.helper.FunctionGlobalDir;
import com.gzeinnumer.gzndirectory.helper.FunctionGlobalFile;
import com.gzeinnumer.gzndirectory.helper.FunctionGlobalZip;
import com.gzeinnumer.gzndirectory.helper.imagePicker.FileCompressor;
import com.gzeinnumer.gznlogerror.utils.MyBaseUtilsLogError;
import com.gzeinnumer.gznutils.utils.MyBaseUtilsDate;
import com.gzeinnumer.mylibdialog.constant.ButtonStyle;
import com.gzeinnumer.mylibdialog.dialog.confirmDialog.ConfirmDialog;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class MainActivity extends BaseTesting {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyLibDialog();
    }

    private void MyLibDialog() {
        new ConfirmDialog(getSupportFragmentManager())
//                        .setDialogCanvas(getResources().getDrawable(R.drawable.rounded_corner_2))
                .setTitle("ini title")
                .setTitleSize(21)
                .setTitleColor(getResources().getColor(R.color.colorAccent))
                .setTitleAlignment(View.TEXT_ALIGNMENT_TEXT_END)
                .setContent("ini content")
                .setContentSize(21)
                .setContentColor(Color.parseColor("#03DAC5"))
                .setContentAlignment(View.TEXT_ALIGNMENT_TEXT_END)
                .setBtnCancelTitle("Batal")
                .setBtnCancelTitleColor(getResources().getColor(R.color.colorAccent))
                .setBtnOkTitle("Yuhuu")
                .setBtnOkTitleColor(getResources().getColor(R.color.colorAccent))
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