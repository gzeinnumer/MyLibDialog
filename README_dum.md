

---

### SingleDatePickerDialog

Dialog yang berisi **1 Title, 1 Animasi** yang bisa kamu pakai untuk menampilkan Loading.

**Code** :

```java
new SingleDatePickerDialog(getSupportFragmentManager())
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
```

Bisa lansung dipanggil seperti diatas, atau kamu bisa memisahkan bagian `show()` dan action callbacknya seperti contoh `ConfirmDialog`

**Preview** :

<p align="center">
  <img src="https://github.com/gzeinnumer/MyLibDialog/blob/main/preview/MyLibDialog_18.png" width="500"/>
</p>

<p align="center">
  <img src="https://github.com/gzeinnumer/MyLibDialog/blob/main/preview/MyLibDialog_19.png" width="500"/>
</p>

<p align="center">
  <img src="https://github.com/gzeinnumer/MyLibDialog/blob/main/preview/MyLibDialog_20.png" width="500"/>
</p>

## SingleDatePickerDialog -> Customize

<p align="center">
  <img src="https://github.com/gzeinnumer/MyLibDialog/blob/main/preview/MyLibDialog_21.png" width="500"/>
</p>

Pada bagian diatas, kamu bisa mencustom sendiri UI-nya. berikut adalah apa apa saja yang bisa kamu custom disini:
**Liat Documentasinya disini ([DOCT](https://github.com/gzeinnumer/MyLibDialog/blob/main/README_5.md))**