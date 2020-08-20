<!-- TOC -->

- [HTML与CSS层叠样式表](#html与css层叠样式表)
    - [一. HTML简介](#一-html简介)
        - [1.1. HTML概述](#11-html概述)
        - [1.2 HTML特点](#12-html特点)
        - [1.3 HTML的发展](#13-html的发展)
        - [1.4 HTML基本结构](#14-html基本结构)
    - [二.HTML基本标签](#二html基本标签)
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
        - [2.9 表单标签](#29-表单标签)
            - [2.9.1 输入标签](#291-输入标签)
                - [2.9.1.1 文本域](#2911-文本域)
                - [2.9.1.2 密码框](#2912-密码框)
                - [2.9.1.3 单选按钮(radio)](#2913-单选按钮radio)
                - [2.9.1.4 复选框(checkboxes)](#2914-复选框checkboxes)
                - [2.9.1.5 提交按钮（submit）](#2915-提交按钮submit)
                - [2.9.1.6 重置按钮（reset）](#2916-重置按钮reset)
            - [2.9.2 选择列表标签](#292-选择列表标签)
            - [2.9.3 文本域标签(textarea)](#293-文本域标签textarea)
            - [2.9.4 下拉列表标签](#294-下拉列表标签)
            - [2.9.5 按钮标签](#295-按钮标签)
            - [2.9.6 表单提交](#296-表单提交)
            - [2.9.7 表单实例](#297-表单实例)
    - [三.CSS(层叠样式表)](#三css层叠样式表)
        - [3.1 CSS简介](#31-css简介)
        - [3.2 CSS优点](#32-css优点)
        - [3.3 CSS引入(与HTML结合方式)](#33-css引入与html结合方式)
            - [3.3.1 CSS的书写规范](#331-css的书写规范)
            - [3.3.2 CSS和HTML结合之內联结合](#332-css和html结合之內联结合)
            - [3.3.3 CSS和HTML结合之内部结合](#333-css和html结合之内部结合)
            - [3.3.4 CSS和HTML结合之外部结合](#334-css和html结合之外部结合)
            - [3.3.5 CSS与HTML结合方式小结](#335-css与html结合方式小结)
        - [3.4 CSS路径问题](#34-css路径问题)

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

## 二.HTML基本标签

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

![Table](https://raw.githubusercontent.com/Gino-W/web_Front-end/master/runoob/image/table.png)

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

![特殊文本](https://raw.githubusercontent.com/Gino-W/web_Front-end/master/runoob/image/%E7%89%B9%E6%AE%8A.png)

### 2.9 表单标签

> 概念：表单可以将页面上录入的信息携带到服务器端。它是一个包含表单元素的区域。表单元素是允许用户在表单中（比如：文本域、下拉列表、单选框、复选框等等）输入信息的元素。表单使用表单标签（\<form>）定义。

|   \<form>   | 定义供用户输入的表单            |
| :---------: | :------------------------------ |
|  \<input>   | 定义输入域                      |
| \<textarea> | 定义文本域 (一个多行的输入控件) |
|  \<select>  | 定义一个选择列表                |
|  \<option>  | 定义下拉列表中的选项            |
|  \<button>  | 定义一个按钮                    |

```html
    <!-- 表单标签：from
                action属性:提交的路径,默认是提交到当前页面
                method属性:请求的方式，GET(默认)和POST
                    -> GET:数据会显示到地址栏中,GET方式提交是有大小限制的
                    -> POST:数据不会显示到地址栏中,POST方式提交没有大小限制
            文本框:input
                name:表单元素的名称
                value:文本框的默认值
                type:文本框属性
                size:文本框的长度
                maxlength:文本框输入的最大长度
                readonly:只读文本框(boolean)
         -->
```

#### 2.9.1 输入标签

> 多数情况下被用到的表单标签是输入标签（\<input>）。输入类型是由类型属性（type）定义的。
>
> name表示控件属性名称，value是控件名称对应的值

##### 2.9.1.1 文本域

```html
<form>
    First name:<input type="text" name="firstname" />
    <br />
    Last name:<input type="text" name="lastname" />
</form>
```

##### 2.9.1.2 密码框

> 当输入密码时，会用*代替

```html
<form>
    <input type="password" name="password"/>
</form>
```

##### 2.9.1.3 单选按钮(radio)

> 当用户从若干给定的的选择中选取其一时，就会用到单选框。
>
> 注意：只能从中选取其一。

```html
<form>
    <input type="radio" name="sex" value="male" /> Male
    <br />
    <input type="radio" name="sex" value="female" /> Female
</form>
```

##### 2.9.1.4 复选框(checkboxes)

> 当用户需要从若干给定的选择中选取一个或若干选项时，就会用到复选框。

```html
<form>
    <input type="checkbox" name="bike" />I have a bike
    <br />
    <input type="checkbox" name="car" />I have a car
</form>
```

##### 2.9.1.5 提交按钮（submit）

> 当用户需要按钮提交时，就会用到提交按钮

```html
<form>
    <input type="submit" value="提交"/>
</form>
```

##### 2.9.1.6 重置按钮（reset）

> 当用户输入信息想要重置成初始未提交样子，就会用到重置按钮

```html
<form>
    <input type="reset" value="重置"/>
</form>
```

#### 2.9.2 选择列表标签

> select 元素可创建单选或多选菜单。当提交表单时，浏览器会提交选定的项目，或者收集用逗号分隔的多个选项，将其合成一个单独的参数列表，并且在将 \<select>  表单数据提交给服务器时包括 name 属性。

```html
<select>
    <option value ="volvo">Volvo</option>
    <option value ="saab">Saab</option>
    <option value="opel">Opel</option>
    <option value="audi">Audi</option>
</select>
```

#### 2.9.3 文本域标签(textarea)

> \<textarea> 标签定义多行的文本输入控件。文本区中可容纳无限数量的文本，其中的文本的默认字体是等宽字体（通常是 Courier）。

```html
    <textarea rows="3" cols="20">这是一个文本域！</textarea>
```

#### 2.9.4 下拉列表标签

> option 元素定义下拉列表中的一个选项（一个条目）。浏览器将 \<option> 标签中的内容作为 \<select> 标签的菜单或是滚动列表中的一个元素显示。option 元素位于 select 元素内部。

```html
<select name="city">
    <option value="Wuhan" selected="selected">河北</option>
    <option value="Xiaogan" >北京</option>
</select>
```

#### 2.9.5 按钮标签

> \<button> 标签定义一个按钮。

```html
    <button type="button">按钮</button>
```

#### 2.9.6 表单提交

>GET(默认)和POST
>
> -> GET:数据会显示到地址栏中,GET方式提交是有大小限制的
>
> -> POST:数据不会显示到地址栏中,POST方式提交没有大小限制

#### 2.9.7 表单实例

```html
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>FormLabel</title>
</head>
<body>
    <!-- 表单标签：from
                action属性:提交的路径,默认是提交到当前页面
                method属性:请求的方式，GET(默认)和POST
                    -> GET:数据会显示到地址栏中,GET方式提交是有大小限制的
                    -> POST:数据不会显示到地址栏中,POST方式提交没有大小限制
            文本框:input
                name:表单元素的名称
                value:文本框的默认值
                type:文本框属性
                size:文本框的长度
                maxlength:文本框输入的最大长度
                readonly:只读文本框(boolean)
         -->
    <form action="http://www.baidu.com" method="GET">
        用户名：<input name="username" value="G" type="text" size="20px" maxlength="6" />
        <br/>
        密&nbsp&nbsp&nbsp码：<input name="password" value="123456" type="password" />
        <br/>
        性&nbsp&nbsp&nbsp别：<input name="gender" type="radio" value="male" checked="true"/>男
                             <input name="gender" type="radio" value="female"/>女
        <br/>
        爱&nbsp&nbsp&nbsp好：<input name="hobby" type="checkbox" value="sing" checked="true"/>唱歌
                             <input name="hobby" type="checkbox" value="dancing" />跳舞
                             <input name="hobby" type="checkbox" value="skiing" />滑雪
        <br/>
        国&nbsp&nbsp&nbsp家：<select name="country">
                                <option value="CHINA">中国</option>
                                <option value="USA">美国</option>
                                <option value="JAPAN" selected>日本</option>
                            </select>
        <br/>
        简&nbsp&nbsp&nbsp介：<textarea name="info" cols="5" rows="1">66666</textarea>
        <br/>
        <input type="reset" value="重置" />
        <input type="submit" value="注册"/>
        <input type="button" value="没卵用" />
        <input type="hidden" name="hidden" value="111"/>
    </form>
</body>
</html>
```

![表单实例](https://raw.githubusercontent.com/Gino-W/web_Front-end/master/runoob/image/%E8%A1%A8%E5%8D%95%E5%AE%9E%E4%BE%8B.png)

## 三.CSS(层叠样式表)

----

### 3.1 CSS简介

> - CSS 指层叠样式表 (*C*ascading *S*tyle *S*heets)
>
> - 样式定义*如何显示* HTML 元素  
> - 样式通常存储在*样式表*中  
> - 把样式添加到 HTML 4.0 中，是为了*解决内容与表现分离的问题*  
> - *外部样式表*可以极大提高工作效率  
> - 外部样式表通常存储在 *CSS 文件*中  
> - 多个样式定义可*层叠*为一

### 3.2 CSS优点

> - 通过CSS可以定义HTML元素如何显示 ，解决了HTML在标签样式上无法满足的需求（HTML相当于毛坯房,很多效果达不到，CSS相当于是在毛坯基础上做精装修）
>
> - CSS极大的提高了程序员的工作效率
> - 使用CSS样式提高了代码的清晰度（类似Java中的分包），让我们将html代码与样式代码分离 ，便于后期维护

### 3.3 CSS引入(与HTML结合方式)

> 关于CSS层叠样式表的使用，就是以HTML结合的方式去修饰HTML样式
>
> - 与HTML的内联结合
> - 与HTML的内部结合
> - 与HTML的外部结合

#### 3.3.1 CSS的书写规范

> 格式：选择器 {属性:属性值;属性:属性值}
> 选择器：确定当前css修饰的是哪一个元素

#### 3.3.2 CSS和HTML结合之內联结合

```html
<!DOCTYPE html>
<html>
    <head>
       <meta charset="utf-8">
        <title>CSS和html结合之内联结合</title>
    </head>
    <body>
        <h1 style="color: brown;font-size: 30px;">一级标题</h1>
    </body>
</html>
```

> 优缺点
>
> - 优点：简单方便
> - 缺点：复用性差
> - 注意：CSS内联代码中所有的符号必须是在英文半角模式下

#### 3.3.3 CSS和HTML结合之内部结合

```html
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>CSS和HTML结合之内部结合</title>
        <!--
            内部结合
                1，需要在head标签中，使用style标签
                2，使用选择器选中元素(后面讲选择器)
                3，编写css代码
                格式：
                    选择器 {
                        属性名1:属性值1;
                        属性名2:属性值2;
                    }
        -->
        <style>
            h2{
                color: chartreuse;
                font-size: 60px;
            }
        </style>
    </head>
    <body>
        <h2>二级标题</h2>
    </body>
</html>
```

> 优缺点
>
> - 优点：可以对多个标签进行统一样式设置
> - 缺点：只能作用于当前页面

#### 3.3.4 CSS和HTML结合之外部结合

> 实现
>
> 1. 新建一个css样式文件
> 2. 使用link标签引入外部样式文件

```css
/* css文件 */
h2{
    color: chartreuse;
    font-size: 60px;
}
```

```html
<!-- HTML文件 -->
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>CSS和html结合之外部结合</title>
        <link rel="stylesheet" href="css/css01.css" />
        <!--
            外部结合方式：
                1，新建一个css样式文件
                2，编写css代码
                3，在html文件中引入css外部文件 ,使用link标签引入
                优点：复用性高！简单！
        -->
    </head>
    <body>
        <h3>三级标题</h3>
    </body>
</html>
```

> 优缺点
>
> - 优点：HTML页面的大小更小，结构更清晰。加载速度更快。相同的.css文件可以在多个页面上使用。  
> - 缺点：无

#### 3.3.5 CSS与HTML结合方式小结

| CSS与HTML结合方式 |              优点              |               缺点               |
| :---------------: | :----------------------------: | :------------------------------: |
|     内联结合      |            简单方便            |             复用性差             |
|     内部结合      | 可以对多个标签进行统一样式设置 | 只能作用与当前页面，不具有普适性 |
|     外部结合      |   复用性高！简单！具有普适性   |                无                |

```html
<!--
			内联结合：
				缺点：不能复用!
				优点：简单！
				对少数的特定的元素进行单独设置！

			内部结合：
				1，需要在head标签中，使用style标签
				2，使用选择器选中元素(后面详细讲)
				3，编写css代码
				格式：
					选择器 {
						属性名1:属性值1;
						属性名2:属性值2;
					}
				缺点：复用性不高！css代码和html代码分离不彻底！
				优点：简单！

			外部结合方式：
				1，新建一个css样式文件
				2，编写css代码
				3，在html文件中引入css外部文件 ,使用link标签引入
				优点：复用性高！简单！
				
			以上三种结合方式中，推荐用谁？
			三种都有用！
			外部结合方式！！
			html中的相对路径!!!
-->
```

### 3.4 CSS路径问题

> - 访问路径：
>   - 绝对路径：不带协议的绝对路径/带协议的绝对路径（绝对路径是从盘符开始的路径，是一种简化版的路径，以当前文件，活动窗口目录为根目录，进行向上或者向下）
>   - 相对路径：相对于index.html资源去访问css01.css资源（相对路径是从当前路径开始的路径，就是真实的路径，是计算机中完整路径，必须准确，否则不能找到，起点是系统的根目录，也就是各个盘符 ）
> - CSS中访问路径：比如：<http://127.0.0.1:8020/index.html>
>   - / 代表文件所在的根目录
>     ./ 代表文件所在当前目录（./ 可以省略，即：css/css01.css）；意为在index.html的同一个目录下访问css文件夹下的css01.css
>   - ../ 代表上一级目录
>   - ../../ 代表文件所在的父级目录的父级目录
