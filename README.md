<p align="center">
  <img src="https://github.com/gzeinnumer/MyLibDialog/blob/main/preview/MyLibDialog_3.png"/>
</p>

<h1 align="center">
  MyLibDialog - Easy Dialog
</h1>

<div align="center">
    <a><img src="https://img.shields.io/badge/Version-2.2.2-brightgreen.svg?style=flat"></a>
    <a><img src="https://img.shields.io/badge/ID-gzeinnumer-blue.svg?style=flat"></a>
    <a><img src="https://img.shields.io/badge/Java-Suport-green?logo=java&style=flat"></a>
    <a><img src="https://img.shields.io/badge/Kotlin-Suport-green?logo=kotlin&style=flat"></a>
    <a href="https://github.com/gzeinnumer"><img src="https://img.shields.io/github/followers/gzeinnumer?label=follow&style=social"></a>
    <br>
    <p>Simple way to use Dialog Fragment</p>
</div>

---
# Content List
* [Download](#download)
* [Feature List](#feature-list)
* [Tech stack and 3rd library](#tech-stack-and-3rd-library)
* [Usage](#usage)
* [Example Code/App](#example-codeapp)
* [Version](#version)
* [Contribution](#contribution)

---
# Download

Add maven `jitpack.io` and `dependencies` in `build.gradle (Project)` :
```gradle
// build.gradle project
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}

// build.gradle app/module
dependencies {
  ...
  implementation 'com.github.gzeinnumer:MyLibDialog:version'
  implementation 'com.github.gzeinnumer:MyLibStyle:0.1.5'
  implementation 'com.google.android.material:material:1.2.1'
}
```

---
# Feature List
- [x] [ConfirmDialog](#confirmdialog)
- [x] [InfoDialog](#infodialog)
- [x] [NumberPickerDialog](#numberpickerdialog)
- [x] [LoadingDialog](#loadingdialog)
- [x] [SingleDatePickerDialog](#singledatepickerdialog)
- [x] [MultiDatePickerDialog](#multidatepickerdialog)

---
# Tech stack and 3rd library
- Material.io ([docs](https://material.io/develop/android/docs/getting-started))
- agrawalsuneet/DotLoadersPack-Android ([docs](https://github.com/agrawalsuneet/DotLoadersPack-Android))
- DialogFragment ([docs](https://developer.android.com/reference/android/app/DialogFragment))

---
# Usage

**First Step**. Use `MaterialComponents` in your style :

```xml
<style name="AppTheme" parent="Theme.MaterialComponents.Light.NoActionBar">
    <!-- Customize your theme here. -->
</style>
```

If you want to change default font, add `custom_font.ttf` to your `res` directory `res->font`.
Than add this `style` to your `style.xml`/`themes.xml`
```xml
<!-- Base application theme. -->
<!-- Change Base Font -->
<style name="Theme.MyLibsTesting" parent="Theme.MaterialComponents.DayNight.DarkActionBar">
    <item name="android:fontFamily">@font/test_font</item>
</style>

<!-- Change TextView Font -->
<style name="BaseTextView">
    <item name="android:fontFamily">@font/test_font</item>
</style>

<style name="BaseTextView.Bold" parent="BaseTextView">
    <item name="android:fontFamily">@font/test_font</item>
</style>

<style name="BaseTextView.Italic" parent="BaseTextView">
    <item name="android:fontFamily">@font/test_font</item>
</style>

<style name="BaseTextView.Bold.Italic" parent="BaseTextView">
    <item name="android:fontFamily">@font/test_font</item>
</style>

<!-- Change Button Font -->
<style name="MyButtonText" parent="Widget.MaterialComponents.Button.TextButton">
    <item name="android:fontFamily">@font/test_font</item>
</style>

<style name="MyButtonOutlined" parent="Widget.MaterialComponents.Button.OutlinedButton">
    <item name="android:fontFamily">@font/test_font</item>
</style>

<style name="MyButtonContained">
    <item name="android:fontFamily">@font/test_font</item>
</style>

<style name="MyButtonIcon" parent="Widget.MaterialComponents.Button.Icon">
    <item name="android:fontFamily">@font/test_font</item>
</style>
```

If you want to change default color, add value to `res/color.xml`
```xml
<?xml version="1.0" encoding="utf-8"?>
<resources>
    <color name="colorPrimary">#6200EE</color>
    <color name="colorPrimaryDark">#3700B3</color>
    <color name="colorAccent">#03DAC5</color>
</resources>
```

#
### ConfirmDialog
Dialog with **1 Title, 1 Content, 1 Negative Button, 1 Positive Button**.
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

or you can write code like this :

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

To enable `CanceledOnTouchOutside` :

```java
new ConfirmDialog(getSupportFragmentManager())
    .setCanceledOnTouchOutside(true)
```

**Preview** :

<p align="center">
  <img src="https://github.com/gzeinnumer/MyLibDialog/blob/main/preview/MyLibDialog_3.png" width="500"/>
</p>

#
#### ConfirmDialog -> Customize

<p align="center">
  <img src="https://github.com/gzeinnumer/MyLibDialog/blob/main/preview/MyLibDialog_1.png" width="500"/>
</p>

You can Customize your dialog UI. [**ReadMore**](https://github.com/gzeinnumer/MyLibDialog/blob/main/README_1.md).

---

### InfoDialog
Dialog with **1 Title, 1 Content, 1 Positif Button**.

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

To enable `CanceledOnTouchOutside` :

```java
new InfoDialog(getSupportFragmentManager())
    .setCanceledOnTouchOutside(true)
```

To set auto Click Button Ok :

```java
new InfoDialog(getSupportFragmentManager())
    .autoDismisOnSecond(10)
```

**Preview** :

<p align="center">
  <img src="https://github.com/gzeinnumer/MyLibDialog/blob/main/preview/MyLibDialog_6.png" width="500"/>
</p>

#
#### InfoDialog -> Customize

<p align="center">
  <img src="https://github.com/gzeinnumer/MyLibDialog/blob/main/preview/MyLibDialog_8.png" width="500"/>
</p>

You can Customize your dialog UI. [**ReadMore**](https://github.com/gzeinnumer/MyLibDialog/blob/main/README_2.md).

---

### NumberPickerDialog

Dialog with **1 Title, 1 Content, 1 Positif Button, 1 Negatif Button, 1 EditText, 1 Add Button, 1 Substract Button**.

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
    .onCancelPressedCallBack(new NumberPickerDialog.OnCancelPressed() {
        @Override
        public void onCancelPressed() {
            Toast.makeText(MainActivity.this, "Cancel", Toast.LENGTH_SHORT).show();
        }
    })
    .show();
```

To enable `CanceledOnTouchOutside` :

```java
new InfoDialog(getSupportFragmentManager())
    .setCanceledOnTouchOutside(true)
```

**Preview** :

<p align="center">
  <img src="https://github.com/gzeinnumer/MyLibDialog/blob/main/preview/MyLibDialog_10.png" width="500"/>
</p>

#
#### NumberPickerDialog -> Customize

<p align="center">
  <img src="https://github.com/gzeinnumer/MyLibDialog/blob/main/preview/MyLibDialog_13.png" width="500"/>
</p>

You can Customize your dialog UI. [**ReadMore**](https://github.com/gzeinnumer/MyLibDialog/blob/main/README_3.md).

---

### LoadingDialog

Dialog with **1 Title, 1 Animation Loading** that you can use.

**Code** :

```java
LoadingDialog loadingDialog = new LoadingDialog(getSupportFragmentManager())
    .setContent("ini content");

loadingDialog.show();

loadingDialog.dismis();
```

**Preview** :

<p align="center">
  <img src="https://github.com/gzeinnumer/MyLibDialog/blob/main/preview/MyLibDialog_15.png" width="500"/>
</p>

#
#### LoadingDialog -> Customize

<p align="center">
  <img src="https://github.com/gzeinnumer/MyLibDialog/blob/main/preview/MyLibDialog_14.png" width="500"/>
</p>

You can Customize your dialog UI. [**ReadMore**](https://github.com/gzeinnumer/MyLibDialog/blob/main/README_4.md).

---

### SingleDatePickerDialog

Dialog with **Calender like in material.io** that you can use to pick `single` date.

**Code** :

```java
new SingleDatePickerDialog(getSupportFragmentManager())
    .setTimeZone("GMT")
    .setTitle("Pilih tanggal")
    .setSelectedToday(true)
    .setTimeFormat("dd/MM/yyyy") //pastikan polanya sama
    .setStartDate("1/08/2020") //pastikan polanya sama
    .setEndDate("31/12/2020") //pastikan polanya sama
    .onOkPressedCallBack(new SingleDatePickerDialog.OnOkPressed() {
        @Override
        public void onOkPressed(String value) {
            Toast.makeText(MainActivity.this, value, Toast.LENGTH_SHORT).show();
        }
    })
    .build()
    .show();
```

- `setTimeZone()` optional . default value `GMT`.
- `setTimeFormat()` optional. default value `dd-MM-yyyy`.
- `setStartDate()` optional.
- `setEndDate()` optional.

or you can write it like this.

**Preview** :

|<img src="https://github.com/gzeinnumer/MyLibDialog/blob/main/preview/MyLibDialog_18.png"/>|<img src="https://github.com/gzeinnumer/MyLibDialog/blob/main/preview/MyLibDialog_19.png"/>|
|--|--|

|<img src="https://github.com/gzeinnumer/MyLibDialog/blob/main/preview/MyLibDialog_20.png" width="400"/>|
|--|

#
#### SingleDatePickerDialog -> Customize

<p align="center">
  <img src="https://github.com/gzeinnumer/MyLibDialog/blob/main/preview/MyLibDialog_21.png" width="300"/>
</p>

You can Customize your dialog UI. [**ReadMore**](https://github.com/gzeinnumer/MyLibDialog/blob/main/README_5.md).

---

### MultiDatePickerDialog

Dialog with **Calender like in material.io** that you can use to pick date with range.

**Code** :

```java
new MultiDatePickerDialog(getSupportFragmentManager())
    .setTimeZone("GMT")
    .setTitle("Pilih tanggal")
    .setTimeFormat("dd/MM/yyyy") //pastikan 3 pola ini sama
    .setStartDate("1/08/2020") //pastikan 3 pola ini sama
    .setEndDate("31/12/2020") //pastikan 3 pola ini sama
    .onOkPressedCallBack(new MultiDatePickerDialog.OnOkPressed() {
        @Override
        public void onOkPressed(String firstDate, String secondDate) {
            Toast.makeText(MainActivity.this, firstDate + " - " + secondDate, Toast.LENGTH_SHORT).show();
        }
    })
    .build()
    .show();
```

- `setTimeZone()` optional . default value `GMT`.
- `setTimeFormat()` optional. default value `dd-MM-yyyy`.
- `setStartDate()` optional.
- `setEndDate()` optional.

**Preview** :

|<img src="https://github.com/gzeinnumer/MyLibDialog/blob/main/preview/MyLibDialog_22.png"/>|<img src="https://github.com/gzeinnumer/MyLibDialog/blob/main/preview/MyLibDialog_23.png"/>|
|--|--|

|<img src="https://github.com/gzeinnumer/MyLibDialog/blob/main/preview/MyLibDialog_24.png" width="400"/>|
|--|

#
#### MultiDataPickerDialog -> Customize

<p align="center">
  <img src="https://github.com/gzeinnumer/MyLibDialog/blob/main/preview/MyLibDialog_25.png" width="300"/>
</p>

You can Customize your dialog UI. [**ReadMore**](https://github.com/gzeinnumer/MyLibDialog/blob/main/README_6.md).

---
# Example Code/App

[Sample Code And App](https://github.com/gzeinnumer/MyLibDialogExample)

---
# Version
- **1.0.5**
  - First Release
- **1.0.6**
  - Add Custom Animation
- **1.0.7**
  - SetDefault Animation
- **1.0.9**
  - Fix Animation
- **2.0.0**
  - Enable or disable TextAllCaps
- **2.0.1**
  - Bugs Fixing
- **2.0.2**
  - add enable `CanceledOnTouchOutside`
- **2.0.3**
  - Bugs Fixing Style
- **2.0.4**
  - Color
- **2.1.1**
  - Add Auto Click
- **2.1.2**
  - Bug Fixing
- **2.1.5**
  - Bug Fixing
- **2.1.6**
  - Bug Fixing
- **2.1.9**
  - Bug Fixing
- **2.2.1**
  - Bug Fixing
- **2.2.2**
  - Change color method

---
# Contribution

You can sent your constibution to `branch` `open-pull`.

---

```
Copyright 2020 M. Fadli Zein
```