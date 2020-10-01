## ConfirmDialog -> Customize

<p align="center">
  <img src="https://github.com/gzeinnumer/MyLibDialog/blob/main/preview/MyLibDialog_13.png"/>
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


**3. Button Ok**
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


**4. Parent Button**
- Mengganti ukuran Text Button
  - `.setDialogType(DialogType.DialogError)`
    - Value yang bisa dipakai
      - `DialogType.DialogError` -> RED
      - `DialogType.DialogSuccess` -> GREEN
      - `DialogType.DialogWarning` -> YELLOW
      - dll
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
  <img src="https://github.com/gzeinnumer/MyLibDialog/blob/main/preview/MyLibDialog_11.png" width="500"/>
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
new NumberPickerDialog(getSupportFragmentManager())
    .setDialogCanvas(getResources().getDrawable(R.drawable.rounded_corner_2))
    ...
    .show();
```

##

Jika semua kode dipakai, maka akan tampak seperti ini ([example](https://github.com/gzeinnumer/MyLibDialog/blob/main/example/NumberPickerDialog/MainActivity.java))

**Preview** :

<p align="center">
  <img src="https://github.com/gzeinnumer/MyLibDialog/blob/main/preview/MyLibDialog_12.png" width="500"/>
</p>