## circle-imageview
圆角ImageView

##### 自定义属性
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
##### 支持方法
``` java
public void setOval(boolean oval);
public void setRadius(float radius);
public void setRadius(float topLeft, float topRight, float bottomLeft, float bottomRight);
```
##### 效果
<img width=400 src="images/S00619-14524215.png" />