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

Bisa lansung dipanggil seperti diatas, atau kamu bisa pakai cara ini jika ingin memisahkan bagian `show()` nya:

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

**1. Title**
- Mengganti Text Title
  - `.setTitle("ini title")`
- Mengganti ukuran Text Title
  - `.setTitleSize(21)`
- Mengganti warna tulisan Text Title
  - `.setTitleColor(getResources().getColor(R.color.colorAccent))`
  - `.setTitleColor(Color.parseColor("#03DAC5"))`
- Mengganti alignment dari Text Title
  - .setTitleAlignment(View.TEXT_ALIGNMENT_TEXT_END)
    - Value yang bisa dipakai
      - `View.TEXT_ALIGNMENT_TEXT_END`
      - `View.TEXT_ALIGNMENT_CENTER`
      - `View.TEXT_ALIGNMENT_TEXT_START`
      - dll

**2. Content**
- Mengganti Text Content
  - `.setContent("ini content")`
- Mengganti ukuran Text Content
  - `.setContentSize(21)`
- Mengganti warna tulisan Text Content
  - `.setContentColor(getResources().getColor(R.color.colorAccent))`
  - `.setContentColor(Color.parseColor("#03DAC5"))`
- Mengganti alignment dari Text Content
  - .setContentAlignment(View.TEXT_ALIGNMENT_TEXT_END)
    - Value yang bisa dipakai
      - `View.TEXT_ALIGNMENT_TEXT_END`
      - `View.TEXT_ALIGNMENT_CENTER`
      - `View.TEXT_ALIGNMENT_TEXT_START`
      - dll


**3. Button Cancel**
- Mengganti Text Button Cancel
  - `.setBtnCancelTitle("Batal")`
- Mengganti warna tulisan Text Button Cancel
  - `.setBtnCancelTitleColor(getResources().getColor(R.color.colorAccent))`
  - `.setBtnCancelTitleColor(Color.parseColor("#03DAC5"))`
- Mengganti Icon Button Cancel
  - `.setCancelIconLeft(R.drawable.ic_baseline_add_24)`
  - `.setCancelIconTop(R.drawable.ic_baseline_add_24)`
  - `.setCancelIconRight(R.drawable.ic_baseline_add_24)`
  - `.setCancelIconBottom(R.drawable.ic_baseline_add_24)`


**4. Button Ok**
- Mengganti Text Button Ok
  - `.setBtnOkTitle("Yuhuu")`
- Mengganti warna tulisan Text Button Ok
  - `.setBtnOkTitleColor(getResources().getColor(R.color.colorAccent))`
  - `.setBtnOkTitleColor(Color.parseColor("#03DAC5"))`
- Mengganti Icon Button Ok
  - `.setOkIconLeft(R.drawable.ic_baseline_add_24)`
  - `.setOkIconTop(R.drawable.ic_baseline_add_24)`
  - `.setOkIconRight(R.drawable.ic_baseline_add_24)`
  - `.setOkIconBottom(R.drawable.ic_baseline_add_24)`


**5. Parent Button**
- Mengganti ukuran Text Button
  - `.setButtonTextSize(21)`
- Mengganti style Button
  - `.setButtonStyle(ButtonStyle.ButtonContained)`
    - Value yang bisa dipakai
      - `ButtonStyle.ButtonContained`
      - `ButtonStyle.ButtonOutlined`
      - `ButtonStyle.ButtonText`
- Mengganti Gravity Parent Button
  - `.setButtonGravity(Gravity.CENTER)`
    - Value yang bisa dipakai
      - `Gravity.CENTER`
      - `Gravity.END`
      - `Gravity.START`
      - dll

##

**Perhatikan Panah Orange.** kamu juga bisa mengganti bentuk dari dialog dengan file yang kamu buat di `drawable` menggunakan `shape.xml`->`<shape></shape>`. Zein akan mencontohkan dengan 1 file `rounded_corner_2.xml`.

<p align="center">
  <img src="https://github.com/gzeinnumer/MyLibDialog/blob/main/preview/MyLibDialog_4.png" width="500"/>
</p>

**XML** :
```xml
<shape xmlns:android="http://schemas.android.com/apk/res/android"
    android:shape="rectangle" >

    <corners
        android:bottomLeftRadius="0dp"
        android:bottomRightRadius="0dp"
        android:topLeftRadius="10dp"
        android:topRightRadius="10dp" />

    <solid android:color="@android:color/white" />

</shape>
```

**Code** :
```java
new ConfirmDialog(getSupportFragmentManager())
    .setDialogCanvas(getResources().getDrawable(R.drawable.rounded_corner_2))
    ...
    .show();
```

**Preview** :

<p align="center">
  <img src="https://github.com/gzeinnumer/MyLibDialog/blob/main/preview/MyLibDialog_4.png" width="500"/>
</p>

Jika semua kode dipakai, maka akan tampak seperti ini ([example](https://github.com/gzeinnumer/MyLibLogError/blob/master/example/MainActivity.java))



<p align="center">
  <img src="https://github.com/gzeinnumer/MyLibDialog/blob/main/preview/MyLibDialog_5.png" width="500"/>
</p>