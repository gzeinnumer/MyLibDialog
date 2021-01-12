package com.gzeinnumer.mylibdialog;

import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.gzeinnumer.mylibdialog.dialog.infoDialog.InfoDialog;
import com.gzeinnumer.mylibdialog.dialog.loadingDialog.LoadingDialog;

public class MainActivity extends AppCompatActivity {

    LoadingDialog renewLoading;
    InfoDialog renewInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //aktifkan salah satu
        enableLoading();
//        enableConfirm(); // jangan pakai. ada error
    }

    private void enableLoading() {
        renewLoading = renewDialogLoading(1);
        renewLoading.show();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                renewLoading.dismis();
                renewLoading = renewDialogLoading(2);
                renewLoading.show();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        renewLoading.dismis();
                        renewLoading = renewDialogLoading(2);
                        renewLoading.show();
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                renewLoading.dismis();
                            }
                        }, 4000);
                    }
                }, 4000);
            }
        }, 4000);
    }

    private LoadingDialog renewDialogLoading(int i) {
        return new LoadingDialog(getSupportFragmentManager())
                .setContent(String.valueOf(i));
    }

    private void enableConfirm() {
        renewInfo = renewDialogInfo(1);
        renewInfo.show();
        renewInfo.onOkPressedCallBack(new InfoDialog.OnOkPressed() {
            @Override
            public void onOkPressed() {
                renewInfo.dismiss();
                renewInfo = renewDialogInfo(2);
                renewInfo.show();
            }
        });
    }

    private InfoDialog renewDialogInfo(int i) {
        return new InfoDialog(getSupportFragmentManager())
                .setContent(String.valueOf(i))
                .autoDismisOnSecond(3);
    }
}