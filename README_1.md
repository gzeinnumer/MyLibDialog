## ConfirmDialog -> Customize

<p align="center">
  <img src="https://github.com/gzeinnumer/MyLibDialog/blob/main/preview/MyLibDialog_1.png"/>
</p>

You can change UI with this configuration.

**1. Title**
- Change Text Title
  - `.setTitle("ini title")`
- Change Text Title Size
  - `.setTitleSize(21)`
- Change Text Title Color
  - `.setTitleColor(getResources().getColor(R.color.colorAccent))`
  - `.setTitleColor(Color.parseColor("#03DAC5"))`
- Change Text Title Alignment
  - `.setTitleAlignment(View.TEXT_ALIGNMENT_TEXT_END)`
    - Available Value :
      - `View.TEXT_ALIGNMENT_TEXT_END`
      - `View.TEXT_ALIGNMENT_CENTER`
      - `View.TEXT_ALIGNMENT_TEXT_START`
      - etc.

**2. Content**
- Change Text Content
  - `.setContent("ini content")`
- Change Text Content Size
  - `.setContentSize(21)`
- Change Text Content Color
  - `.setContentColor(getResources().getColor(R.color.colorAccent))`
  - `.setContentColor(Color.parseColor("#03DAC5"))`
- Change Text Content Alignment
  - `.setContentAlignment(View.TEXT_ALIGNMENT_TEXT_END)`
    - Available Value :
      - `View.TEXT_ALIGNMENT_TEXT_END`
      - `View.TEXT_ALIGNMENT_CENTER`
      - `View.TEXT_ALIGNMENT_TEXT_START`
      - etc.

**3. Button Cancel**
- Change Text Button Cancel
  - `.setBtnCancelTitle("Batal")`
- Change Text Button Cancel Color
  - `.setBtnCancelTitleColor(getResources().getColor(R.color.colorAccent))`
  - `.setBtnCancelTitleColor(Color.parseColor("#03DAC5"))`
- Change Icon Button Cancel
  - `.setCancelIconLeft(R.drawable.ic_baseline_add_24)`
  - `.setCancelIconTop(R.drawable.ic_baseline_add_24)`
  - `.setCancelIconRight(R.drawable.ic_baseline_add_24)`
  - `.setCancelIconBottom(R.drawable.ic_baseline_add_24)`

**4. Button Ok**
- Change Text Button Ok
  - `.setBtnOkTitle("Yuhuu")`
- Change Text Button Ok Color
  - `.setBtnOkTitleColor(getResources().getColor(R.color.colorAccent))`
  - `.setBtnOkTitleColor(Color.parseColor("#03DAC5"))`
- Change Icon Button Ok
  - `.setOkIconLeft(R.drawable.ic_baseline_add_24)`
  - `.setOkIconTop(R.drawable.ic_baseline_add_24)`
  - `.setOkIconRight(R.drawable.ic_baseline_add_24)`
  - `.setOkIconBottom(R.drawable.ic_baseline_add_24)`

**5. Parent Button**
- Change Text Button Size
  - `.setButtonTextSize(21)`
- Change Style Button
  - `.setButtonStyle(ButtonStyle.ButtonContained)`
    - Available Value :
      - `ButtonStyle.ButtonContained`
      - `ButtonStyle.ButtonOutlined`
      - `ButtonStyle.ButtonText`
- Change Gravity Parent Button
  - `.setButtonGravity(Gravity.CENTER)`
    - Available Value :
      - `Gravity.CENTER`
      - `Gravity.END`
      - `Gravity.START`
      - etc.

##

**Look At Orange Arrow.** you can set shape/canvas from `drawable` to `dialog` with `shape.xml`->`<shape></shape>`. in my example i am using `rounded_corner_2.xml`.

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
Other Example:
- Same Radius -> `R.drawable.rounded_corner` [xml](https://github.com/gzeinnumer/MyLibDialog/blob/main/example/Shapes/rounded_corner.xml) [Preview](https://github.com/gzeinnumer/MyLibDialog/blob/main/README_SHAPE.md#same-radius)
- Different Radius -> `R.drawable.rounded_corner_2` [xml](https://github.com/gzeinnumer/MyLibDialog/blob/main/example/Shapes/rounded_corner_2.xml) [Preview](https://github.com/gzeinnumer/MyLibDialog/blob/main/README_SHAPE.md#different-radius)
- Dialog 3D -> `R.drawable.rounded_layer` [xml](https://github.com/gzeinnumer/MyLibDialog/blob/main/example/Shapes/rounded_layer.xml) [Preview](https://github.com/gzeinnumer/MyLibDialog/blob/main/README_SHAPE.md#dialog-3d)
- Shadow Dialog -> `R.drawable.dialog_shadow` [xml](https://github.com/gzeinnumer/MyLibDialog/blob/main/example/Shapes/dialog_shadow.xml) [Preview](https://github.com/gzeinnumer/MyLibDialog/blob/main/README_SHAPE.md#shadow-dialog)

**Code** :
```java
new ConfirmDialog(getSupportFragmentManager())
    .setDialogCanvas(getResources().getDrawable(R.drawable.rounded_corner_2))
    ...
    .show();
```

##

[FullCode](https://github.com/gzeinnumer/MyLibDialog/blob/main/example/ConfirmDialog/MainActivity.java) **Preview** :

<p align="center">
  <img src="https://github.com/gzeinnumer/MyLibDialog/blob/main/preview/MyLibDialog_5.png" width="500"/>
</p>