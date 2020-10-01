## SingleDatePickerDialog -> Customize

<p align="center">
  <img src="https://github.com/gzeinnumer/MyLibDialog/blob/main/preview/MyLibDialog_21.png"  width="300"/>
</p>

Pada bagian diatas, kamu bisa mencustom sendiri UI-nya. berikut adalah apa apa saja yang bisa kamu custom disini:

**Screen Dialog**
- `.setDialogScreen(DateScreenStyle.FullScreen)`
  - Value yang bisa dipakai
    - `DateScreenStyle.FullScreen`
    - `DateScreenStyle.Dialog`

##

Kamu juga bisa mengganti bentuk dari dialog ke fullscreen.

**Code** :
```java
new SingleDatePickerDialog(getSupportFragmentManager())
    .setDialogScreen(DateScreenStyle.FullScreen)
    ...
    .show();
```

##

Jika semua kode dipakai, maka akan tampak seperti ini ([example](https://github.com/gzeinnumer/MyLibDialog/blob/main/example/SingleDataPickerDialog/MainActivity.java))