# circle-imageview
> 圆角ImageView

[![Platform](https://img.shields.io/badge/Platform-Android-00CC00.svg?style=flat)](https://www.android.com)
[![](https://jitpack.io/v/lavalike/circle-imageview.svg)](https://jitpack.io/#lavalike/circle-imageview)

### 依赖导入

项目根目录

``` gradle
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

模块目录

``` gradle
dependencies {
	implementation 'com.github.lavalike:circle-imageview:0.0.1'
}
```

### 属性说明

``` xml
<declare-styleable name="CircleImageView">
    <attr name="oval" format="boolean" />
    <attr name="radius" format="dimension" />
    <attr name="radius_top_left" format="dimension" />
    <attr name="radius_top_right" format="dimension" />
    <attr name="radius_bottom_left" format="dimension" />
    <attr name="radius_bottom_right" format="dimension" />
</declare-styleable>
```
### 支持方法

``` java
public void setOval(boolean oval);
public void setRadius(float radius);
public void setRadius(float topLeft, float topRight, float bottomLeft, float bottomRight);
```
### 效果
![](https://tva1.sinaimg.cn/large/007S8ZIlgy1gjvmqagu7bj30u01o04jh.jpg)