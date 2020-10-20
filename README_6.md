## SingleDatePickerDialog -> Customize

<p align="center">
  <img src="https://github.com/gzeinnumer/MyLibDialog/blob/main/preview/MyLibDialog_25.png"  width="300"/>
</p>

You can change UI with this configuration.

**Screen Dialog**
- `.setDialogScreen(DateScreenStyle.FullScreen)`
  - Available Value :
    - `DateScreenStyle.FullScreen`
    - `DateScreenStyle.Dialog`

##

You can change from dialog to fullscreen with this code :

**Code** :
```java
new MultiDataPickerDialog(getSupportFragmentManager())
    .setDialogScreen(DateScreenStyle.FullScreen)
    ...
    .show();
```

##

[FullCode](https://github.com/gzeinnumer/MyLibDialog/blob/main/example/MultiDataPickerDialog/MainActivity.java)