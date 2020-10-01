# MyLibDialog

<h1 align="center">
  MyLibDialog - Easy Dialog
</h1>

<div align="center">
    <a><img src="https://img.shields.io/badge/Version-1.0.0-brightgreen.svg?style=flat"></a>
    <a><img src="https://img.shields.io/badge/ID-gzeinnumer-blue.svg?style=flat"></a>
    <a href="https://github.com/gzeinnumer"><img src="https://img.shields.io/github/followers/gzeinnumer?label=follow&style=social"></a>
    <br>
    <a><img src="https://img.shields.io/badge/Java-Suport-green?logo=java&style=flat"></a>
    <a><img src="https://img.shields.io/badge/Koltin-Suport-green?logo=kotlin&style=flat"></a>
    <p>Kumpulan Dialog siap pakai yang sering dipakai didevelopment android dengan material.io, tujuan library ini hanya untuk mempermudah penggunaan Dialog, dan mengubah Stylenya, dokumen ini dibuat berdasarkan pengalaman saya, kasih masukan kalau ada yang kurang. terimakasih karna sudah berkunjung</p>
</div>

---

### Feature List
- [x] ConfirmDialog
- [x] InfoDialog
- [x] NumberPickerDialog
- [x] LoadingDialog
- [x] SingleDatePickerDialog
- [x] MultiDatePickerDialog
- [x] TimePickerDialog

---

### Tech stack and 3rd library
- Material.io ([docs](https://material.io/develop/android/docs/getting-started))

---

## Download

Minimum Android SDK Version 21

#### Gradle
**Step 1.** tambahkan maven jitpack.io ke build.gradle (Project) :
```gradle
allprojects {
  repositories {
    google()
    jcenter()
    maven { url 'https://jitpack.io' }
  }
}
```

**Step 2.** tambahkan depedensi ke build.gradle (Module) :
```gradle
dependencies {
  implementation 'com.github.gzeinnumer:MyLibDialog:versi'
}
```

---

### ConfirmDialog

Dialog yang berisi **1 Title, 1 Content, 1 Negative Button, 1 Positif Button** yang bisa kamu pakai untuk mengkonfirmasi aksi yang akan dilakukan setelahnya.

**Code** :

```java
new ConfirmDialog(getSupportFragmentManager())
    .setTitle("ini title")
    .setContent("ini content")
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
```

Bisa lansung dipanggil seperti diatas, atau kamu bisa pakai cara ini jika ingin memisahkan bagian `show()` dan action callback nya:

```java
ConfirmDialog dialog = new ConfirmDialog(getSupportFragmentManager())
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
```

**Preview** :

<p align="center">
  <img src="https://github.com/gzeinnumer/MyLibDialog/blob/main/preview/MyLibDialog_3.png" width="500"/>
</p>

## ConfirmDialog -> Customize

<p align="center">
  <img src="https://github.com/gzeinnumer/MyLibDialog/blob/main/preview/MyLibDialog_1.png" width="500"/>
</p>

Pada bagian diatas, kamu bisa mencustom sendiri UI-nya. berikut adalah apa apa saja yang bisa kamu custom disini:
**Liat Documentasinya disini ([DOCT](https://github.com/gzeinnumer/MyLibDialog/blob/main/README_1.md))**

---

### InfoDialog

Dialog yang berisi **1 Title, 1 Content, 1 Positif Button** yang bisa kamu pakai untuk menampilkan informasi.

**Code** :

```java
new InfoDialog(getSupportFragmentManager())
    .setDialogType(DialogType.DialogSuccess)
    .setTitle("ini title")
    .setContent("ini content")
    .onOkPressedCallBack(new InfoDialog.OnOkPressed() {
        @Override
        public void onOkPressed() {
            Toast.makeText(MainActivity.this, "Ok", Toast.LENGTH_SHORT).show();
        }
    })
    .show();
```

Bisa lansung dipanggil seperti diatas, atau kamu bisa memisahkan bagian `show()` dan action callbacknya seperti contoh `ConfirmDialog`

**Preview** :

<p align="center">
  <img src="https://github.com/gzeinnumer/MyLibDialog/blob/main/preview/MyLibDialog_6.png" width="500"/>
</p>

## InfoDialog -> Customize

<p align="center">
  <img src="https://github.com/gzeinnumer/MyLibDialog/blob/main/preview/MyLibDialog_8.png" width="500"/>
</p>

Pada bagian diatas, kamu bisa mencustom sendiri UI-nya. berikut adalah apa apa saja yang bisa kamu custom disini:
**Liat Documentasinya disini ([DOCT](https://github.com/gzeinnumer/MyLibDialog/blob/main/README_2.md))**

---

### NumberPickerDialog

Dialog yang berisi **1 Title, 1 Content, 1 Positif Button, 1 Negatif Button, 1 EditText, 1 Add Button, 1 Substract Button** yang bisa kamu pakai untuk mengambil angka.

**Code** :

```java
new NumberPickerDialog(getSupportFragmentManager())
    .setLastValue(12)
    .setTitle("ini title")
    .setContent("ini content")
    .onOkPressedCallBack(new NumberPickerDialog.OnOkPressed() {
        @Override
        public void onOkPressed(int value) {
            Toast.makeText(MainActivity.this, "Nilai nya " + value, Toast.LENGTH_SHORT).show();
        }
    })
    .show();
```

Bisa lansung dipanggil seperti diatas, atau kamu bisa memisahkan bagian `show()` dan action callbacknya seperti contoh `ConfirmDialog`

**Preview** :

<p align="center">
  <img src="https://github.com/gzeinnumer/MyLibDialog/blob/main/preview/MyLibDialog_10.png" width="500"/>
</p>

## NumberPickerDialog -> Customize

<p align="center">
  <img src="https://github.com/gzeinnumer/MyLibDialog/blob/main/preview/MyLibDialog_13.png" width="500"/>
</p>

Pada bagian diatas, kamu bisa mencustom sendiri UI-nya. berikut adalah apa apa saja yang bisa kamu custom disini:
**Liat Documentasinya disini ([DOCT](https://github.com/gzeinnumer/MyLibDialog/blob/main/README_3.md))**

---

### LoadingDialog

Dialog yang berisi **1 Title, 1 Animasi** yang bisa kamu pakai untuk menampilkan Loading.

**Code** :

```java
final LoadingDialog loadingDialog = new LoadingDialog(getSupportFragmentManager())
        .setDialogCanvas(getResources().getDrawable(R.drawable.rounded_corner_2))
        .setContent("ini content")
        .setContentSize(21)
        .setContentColor(Color.parseColor("#03DAC5"))
        .setContentAlignment(View.TEXT_ALIGNMENT_TEXT_END);

loadingDialog.show();

loadingDialog.dismis();
```

**Preview** :

<p align="center">
  <img src="https://github.com/gzeinnumer/MyLibDialog/blob/main/preview/MyLibDialog_15.png" width="500"/>
</p>

## LoadingDialog -> Customize

<p align="center">
  <img src="https://github.com/gzeinnumer/MyLibDialog/blob/main/preview/MyLibDialog_14.png" width="500"/>
</p>

Pada bagian diatas, kamu bisa mencustom sendiri UI-nya. berikut adalah apa apa saja yang bisa kamu custom disini:
**Liat Documentasinya disini ([DOCT](https://github.com/gzeinnumer/MyLibDialog/blob/main/README_4.md))**

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