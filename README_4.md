## ConfirmDialog -> Customize

<p align="center">
  <img src="https://github.com/gzeinnumer/MyLibDialog/blob/main/preview/MyLibDialog_14.png"/>
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

##

**Perhatikan Panah Orange.** kamu juga bisa mengganti bentuk dari dialog dengan file yang kamu buat di `drawable` menggunakan `shape.xml`->`<shape></shape>`. Zein akan mencontohkan dengan 1 file `rounded_corner_2.xml`.

<p align="center">
  <img src="https://github.com/gzeinnumer/MyLibDialog/blob/main/preview/MyLibDialog_16.png" width="500"/>
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
new LoadingDialog(getSupportFragmentManager())
    .setDialogCanvas(getResources().getDrawable(R.drawable.rounded_corner_2))
    ...
    .show();
```

##

Jika semua kode dipakai, maka akan tampak seperti ini ([example](https://github.com/gzeinnumer/MyLibDialog/blob/main/example/LoadingDialog/MainActivity.java))

**Preview** :

<p align="center">
  <img src="https://github.com/gzeinnumer/MyLibDialog/blob/main/preview/MyLibDialog_17.png" width="500"/>
</p>