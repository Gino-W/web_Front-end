<!-- TOC -->

- [HTML与CSS层叠样式表](#html与css层叠样式表)
    - [一. HTML简介](#一-html简介)
        - [1.1. HTML概述](#11-html概述)
        - [1.2 HTML特点](#12-html特点)
        - [1.3 HTML的发展](#13-html的发展)
        - [1.4 HTML基本结构](#14-html基本结构)
    - [二、HTML基本标签](#二html基本标签)
        - [2.1 结构标签](#21-结构标签)
        - [2.2 排版标签](#22-排版标签)
        - [2.3 列表标签](#23-列表标签)
            - [2.3.1 有序列表](#231-有序列表)
            - [2.3.2 无序列表](#232-无序列表)
            - [2.3.3 定义列表](#233-定义列表)
            - [2.3.4 列表嵌套](#234-列表嵌套)
        - [2.4 图片标签](#24-图片标签)
        - [2.5 超链接标签](#25-超链接标签)
        - [2.6 容器标签](#26-容器标签)
        - [2.7 表格标签](#27-表格标签)
        - [2.8 文本格式化标签](#28-文本格式化标签)

<!-- /TOC -->

# HTML与CSS层叠样式表

## 一. HTML简介

----

### 1.1. HTML概述

> HTML全称：Hyper Text Markup Language(超文本标记语言)
>
> ​HTML是一门用户创建网页文档的标记语言，网页本身是一种文本文件，在文本文件中添加标记符。
>
> ​浏览器来解析HTML标记的内容（文字的处理，画面排版安排，图片如何显示、音频、视频等等）
>
> ​HTML是用来创建网页的标记语言

### 1.2 HTML特点

> 1.简易性：超文本标记语言的版本升级采用的超集方式。更加方便灵活
>
> 2.可扩展性：超文本标记语言采取的子类元素的方式，为系统扩展带来保证
>
> 3.平台无关性：Write once, run anywhere
>
> 4.通用性：HTML是网络的通用语言，一种简单、通用的标记语言。

### 1.3 HTML的发展

> 超文本标记语言(第一版)------1993年6月作为互联网工程小组(IETF)工作草案发布(并非标准)
>
> HTML2.0 --1995年11月
>
> HTML3.2 --1997年1月14日，W3C标准
>
> HTML4.0 --1997年12月18日  W3C标准
>
> HTML4.01 --1999年12月24日 W3C的推荐标准
>
> HTML5 ---2014年10月29日，W3C推荐标准

### 1.4 HTML基本结构

```html
<!-- 文档声明：告诉浏览器使用HTML5版本解析 -->
<!DOCTYPE html>
<html>
    <!--网页的头部 -->
    <head>
        <!--页面的字符集编码 -->
        <meta charset="utf-8" />
        <!-- 页面的标题 -->
        <title>我的页面</title>
    </head>
    <!-- 网页的主题，显示的部分-->
    <body>
        展示的内容
    </body>
</html>
```

> 1、HTML页面包含头部head和主体body
>
> 2、HTML标签通常是成对出现的，有开始标签，有结束标签，称为对标签。没有结束标签的为 空标签
>
> 3、HTML标签通常都有属性，格式：属性名 = "属性值" 属性名 = "属性值"。多个属性用空格间隔
>
> 4、HTML标签不区分大小写，建议小写
>
> 5、HTML文件后缀名为html或htm
>
>注意：对于中文网页需要使用 \<meta charset="utf-8"> 声明编码，否则会出现乱码。有些浏览器(如 360 浏览器)会设置 GBK 为默认编码，则你需要设置为 \<meta charset="gbk">。

## 二、HTML基本标签

----

### 2.1 结构标签

```html
<html></html>:根标签
<head> ：头标签
    <title></title>页面的标题
</head>
<body>：主体标签：显示网页内容

</body>
```

> 头标签可包含title,meta,script,style,link
>
> 属性：
>
> - color:文本的颜色  
>
> - bgColor:背景色
>
> - background：背景图片
>
> 颜色的表示方式：
>
> - 第一种：颜色名称———red  
>
> - 第二种方式：RGB模式———#ffffff

### 2.2 排版标签

> 1.标题标签：\<h1>-\<h6>
>
> - 特点：数字越小，标题文字越大！默认加粗、默认字号、默认占据一行
>
> 2.段落标签：\<p>文本文字\</p>
>
> - ​特点：段落与段落之间有行高（行间距）自带换行
>
> - ​属性：文本对齐方式 align （left、center 、right）
>
>
> 3.换行标签：\<br />
>
> 4.水平线标签：\<hr />
>
> - ​属性：
>
>   - ​width：水平线的长度(两种：像素表示。第二种：百分比显示)
>
>   - size：水平线的粗细（避免过粗、太丑、一般给个位数  比如 6px）
>
>   - ​color：水平线的颜色
>
>   - ​align：水平线的对齐方式(left、center、right)
>
> 5.注释标签：< !-- 注释-- >
>
> 6.字体加粗标签：\<b>\</ b>
>
> 7.字体斜体标签：\<i>\</ i>
>
> 8.字体下划线标签：\<u>\</ u>
>
> 9.居中标签：\<center>\</ center>

### 2.3 列表标签

#### 2.3.1 有序列表

```html
<!--ol是有序列表
        type属性：
            1  数字类型
			a  字母字典顺序
            i  罗马数字
        start属性：
            从那个位置开始显示
            start="2"（从第二条开始显示）
		-->
        <ol type="I">
            <li>条目一</li>
            <li>条目二</li>
            <li>条目三</li>
        </ol>
```

#### 2.3.2 无序列表

```html
<!--ul是无序列表
        type属性：
            disc 实心圆 
			circle 空心圆
			square 黑色方块
		-->
        <ul type="square">
            <li>中国</li>
            <li>巴基斯坦</li>
            <li>俄罗斯</li>
        </ul>
```

#### 2.3.3 定义列表

> 定义列表：dl(defination list)
>
> 定义标题：dt(defination title)
>
> 定义描述：dd(defination description)

```html
        <dl>
            <dt>自定义标题</dt>
            <dd>自定义描述</dd>
        </dl>
```

#### 2.3.4 列表嵌套

```html
    <ul>
            <li>一</li>
            <li>
                <dl>
                    <dt>1</dt>
                    <dd>1的内容</dd>
                </dl>
            </li>
            <li>
                二
                <ol>
                    <li>。。。</li>
                    <li>。。。</li>
                    <li>。。。</li>
                </ol>
            </li>
    </ul>
```

### 2.4 图片标签

```html
<img /> 独立标签
属性：
    src 图片地址
    width 图片的宽度
    height 图片的高度
    border 边框
    alt 图片的文字说明 当图片未能正确加载时，才显示
    title 鼠标悬停时，显示的文字
```

```html
<img src="img/图片.jpg" width="500px" height="500px"/>
<img src="img/图片.jpg" width="500px" height="500px" border="5" alt="图片丢失" title="图片说明" />
```

>图片引入路径问题
>
> - 绝对路径：从盘符开始定位
>
> - 相对路径：
>
>   - ./当前目录
>
>   - ../上级目录

### 2.5 超链接标签

> 超链接可以是文本，也可以是图片，可以点击链接标签，进入新的文档，或者是当前文档中的某个部分

```html
<a>文本或图片</a>、
属性：
            href="跳转的地址"跳转外网需要添加协议
            target:_self(当前文档)
                    _blank(新页面,会一直打开新的)
                    _search 之前打开的页面存在，则不打开新的页面，直接复用
            title：链接简介
```

### 2.6 容器标签

>\<div>\</div> ： 块级标签，独占一行，自带换行
>
> - 作用：\<div>主要是结合css做页面分块 布局
>
>\<span>\</span> ： 行级标签，所有内容都在同一行
>
> - 作用：\<span>：进行友好提示信息的显示

### 2.7 表格标签

> 表格由\<table> 标签来定义。每个表格均有若干行（由\<tr> 标签定义），每行被分割为若干单元格（由\<td> 标签定义）。字母 td 指表格数据（table data），即数据单元格的内容。数据单元格可以包含文本、图片、列表、段落、表单、水平线、表格等等。

```html
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>TableLabel</title>
</head>
<body>
    <!--创建表格table   行tr  列td
			table属性：
                默认没有边框体现
                border:边框的宽度
                bordercolor:边框的颜色
                cellspacing:单元格的间距
                cellpadding:单元格与内容的间距
                width:宽度
                height:高度
                align:控制表格的对齐方式 left center right
            
            td的属性：
                align:控制的单元格内容的对齐方式 left center right
                valign:控制单元格内容的垂直对齐方式 top middle bottom
                colspan:一列占几行
                rowspan:一行占几列

            th作为表头，默认居中，加粗
            <thead>：表的首行，里面用<th>
            <tbody>：表体，里面用<td>
		-->
    <table align="center" border="1" bordercolor="green" cellspacing="0" cellpadding="15">
        <thead>
            <th>name</th>
            <th>gender</th>
            <th>age</th>
        </thead>
        <tbody>
            <td>G</td>
            <td>male</td>
            <td>18</td>
        </tbody>
    </table>
    <hr color="black"/>
    <table align="center" border="1" bordercolor="purple" cellspacing="0" cellpadding="15">
        <tr>
            <td>1-1</td><td>1-2</td><td>1-3</td>
        </tr>
        <tr>
            <td>2-1</td><td>2-2</td><td>2-3</td>
        </tr>
        <tr>
            <td>3-1</td><td>3-2</td><td>3-3</td>
        </tr>
    </table>
    <hr color="black"/>

    <!-- colspan与rowspan -->
    <table align="center" border="1" bordercolor="purple" cellspacing="0" cellpadding="15">
        <tr>
            <td rowspan="2">1-1</td><td>1-2</td><td>1-3</td>
        </tr>
        <tr>
            <td>2-2</td><td>2-3</td>
        </tr>
        <tr>
            <td colspan="2">3-1</td><td>3-3</td>
        </tr>
    </table>
</body>
</html>
```

![Table](/image/table.png)

### 2.8 文本格式化标签

```html
<!-- 文本格式化标签 -->
    <!-- 空格 -->
    1&nbsp;&nbsp;2&nbsp;&nbsp;3<br />
    <!-- 大于  小于 -->
    &gt;&lt;<br />
    <!-- 版权 -->
    &copy;<br />
    <!-- 商标 -->
    &reg;<br />
    <!--粗体文本-->
    <b>今天天气好</b><br />
    <!--大号字-->
    <big>今天天气好</big><br />
    <!--着重文字-->
    <em>今天天气好</em><br />
    <!--斜体字 物理上把字体倾斜-->
    <i>今天天气好</i><br />
    <!--小号字-->
    <small>今天天气好</small><br />
    <!--定义加重语气-->
    <strong>今天天气好</strong><br />
    <!--下标字-->
    CO<sub>2</sub><br />
    <!--上标字-->
    孙悟空三打白骨精<sup>①</sup><br />
    <!--插入字-->
    <ins>今天天气好</ins><br />
    <!--删除字-->
    <del>今天天气好</del>
```

![特殊文本](/image/特殊.png)
