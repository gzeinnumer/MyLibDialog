## LoadingDialog -> Customize

<p align="center">
  <img src="https://github.com/gzeinnumer/MyLibDialog/blob/main/preview/MyLibDialog_14.png"/>
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

##

**Look At Orange Arrow.** you can set shape/canvas from `drawable` to `dialog` with `shape.xml`->`<shape></shape>`. in my example i am using `rounded_corner_2.xml`.

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
Other Example:
- Same Radius -> `R.drawable.rounded_corner` [xml](https://github.com/gzeinnumer/MyLibDialog/blob/main/example/Shapes/rounded_corner.xml) [Preview](https://github.com/gzeinnumer/MyLibDialog/blob/main/README_SHAPE.md#same-radius)
- Different Radius -> `R.drawable.rounded_corner_2` [xml](https://github.com/gzeinnumer/MyLibDialog/blob/main/example/Shapes/rounded_corner_2.xml) [Preview](https://github.com/gzeinnumer/MyLibDialog/blob/main/README_SHAPE.md#different-radius)
- Dialog 3D -> `R.drawable.rounded_layer` [xml](https://github.com/gzeinnumer/MyLibDialog/blob/main/example/Shapes/rounded_layer.xml) [Preview](https://github.com/gzeinnumer/MyLibDialog/blob/main/README_SHAPE.md#dialog-3d)
- Shadow Dialog -> `R.drawable.dialog_shadow` [xml](https://github.com/gzeinnumer/MyLibDialog/blob/main/example/Shapes/dialog_shadow.xml) [Preview](https://github.com/gzeinnumer/MyLibDialog/blob/main/README_SHAPE.md#shadow-dialog)

**Code** :
```java
new LoadingDialog(getSupportFragmentManager())
    .setDialogCanvas(getResources().getDrawable(R.drawable.rounded_corner_2))
    ...
    .show();
```

##

**Animation Dialog Show** You can change dialog `animation`.

**Code** :
```java
new LoadingDialog(getSupportFragmentManager())
    .setAnimationStyle(R.style.CustomDialogStyle)
    ...
    .show();
```
Here is the style
```xml
<resources>

    <!-- res->styles.xml -->
    <style name="CustomDialogStyle" parent="Theme.MaterialComponents.Light.Dialog">
        <item name="android:windowMinWidthMajor">80%</item>
        <item name="android:windowMinWidthMinor">80%</item>
        <item name="android:windowEnterAnimation">@anim/anim_in</item>
        <item name="android:windowExitAnimation">@anim/anim_out</item>
    </style>

</resources>
```
Style that i prepare for you
- [anim_in](https://github.com/gzeinnumer/MyLibDialogFragment/blob/master/lib/src/main/res/anim/anim_in.xml) & [anim_out](https://github.com/gzeinnumer/MyLibDialogFragment/blob/master/lib/src/main/res/anim/anim_out.xml).
- [slide_down](https://github.com/gzeinnumer/MyLibDialogFragment/blob/master/lib/src/main/res/anim/slide_down.xml) & [slide_up](https://github.com/gzeinnumer/MyLibDialogFragment/blob/master/lib/src/main/res/anim/slide_up.xml).

##

[FullCode](https://github.com/gzeinnumer/MyLibDialog/blob/main/example/LoadingDialog/MainActivity.java) **Preview** :

<p align="center">
  <img src="https://github.com/gzeinnumer/MyLibDialog/blob/main/preview/MyLibDialog_17.png" width="500"/>
</p>