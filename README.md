# JBartender
Java调用bartender
官方提供的主要是C#支持。

基于java调用bartender二次开发官方给了一份1998年的J#代码，，，完全用不了，，，百度谷歌搜索万能的网友的答案，发现也没有可参考的。。

最后想到了之前用到了一次利用JNA调用C++dll文件。那是不是可以通过JNA调用C++,C++调用C#。。三种语言一起调试，过程中各种自闭。

暂时封装的API接口如下：

1.初始化打印机引擎

2.打开模板文件

3.获取此模板具名数据源个数

4.获取某个具名数据源的名称

5.获取某个具名数据源的值

6.修改某个具名数据源的值

7.是否支持打印拷贝

8.设置打印拷贝数量

9.是否支持序列化拷贝

10.设置序列化拷贝数量

11.设置指定位置打印（比如一行三列，1代表最左边，以此类推）

12.释放资源

以上基本上能够满足开发需求

 

库文件（dll）使用方法欢迎进群下载交流（927465926）

基础使用:
~~~~JBartender jBartender = new JBartender();
        if (jBartender.initEngine()) {
            if (jBartender.openTemplate("C:\\Users\\1234\\Desktop\\test.btw")) {
                if (jBartender.getKeyCount() > 0) {
                    jBartender.setSupportsIdenticalCopies(1);
                    for (int i = 0; i < jBartender.getKeyCount(); i++) {
                        System.out.println(jBartender.getKeyName(i)+"----"+jBartender.getKeyValue(i));
                    }
                    jBartender.closeSave();
                }
            }
        }