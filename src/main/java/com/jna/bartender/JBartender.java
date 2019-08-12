package com.jna.bartender;


import com.sun.jna.Native;


public class JBartender {

    private JBartenderInterface jBartenderInterface;

    public JBartender() {
        String fileName = "Bartender";
        try {
            jBartenderInterface = (JBartenderInterface) Native.loadLibrary(fileName, JBartenderInterface.class);
            System.setProperty("jna.encoding","GBK");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    //初始化设备引擎
    public boolean initEngine() {
        return jBartenderInterface.initEngine();
    }

    //模板路径
    public boolean openTemplate(String filePath) {
        return jBartenderInterface.openTemplate(filePath);
    }

    //释放资源
    public void closeNotSave() {
        jBartenderInterface.closeNotSave();
    }

    //释放资源
    public void closeSave() {
        jBartenderInterface.closeSave();
    }

    //打印
    public boolean print() {
        return jBartenderInterface.print();
    }

    //获取内容key个数
    public int getKeyCount() {
        return jBartenderInterface.getCount();
    }

    //获取指定位置key的name
    public String getKeyName(int key) {
        return jBartenderInterface.getFormatName(key);
    }

    //获取指定位置key的内容
    public String getKeyValue(int key) {
        return jBartenderInterface.getFormatValue(key);
    }

    //设置指定位置的key对应的内容
    public void setKeyValue(int key, String data) {
        jBartenderInterface.setFormatValue(key, data);
    }

    //是否支持拷贝副本
    public boolean isSupportsIdenticalCopies() {
        return jBartenderInterface.isSupportsIdenticalCopies();
    }

    //拷贝相同数量
    public void setSupportsIdenticalCopies(int column) {
        jBartenderInterface.setSupportsIdenticalCopies(column);
    }

    //是否支持序列化
    public boolean isSupportsSerializedLabels() {
        return jBartenderInterface.isSupportsSerializedLabels();
    }

    //序列拷贝数量
    public void setSupportsSerializedLabels(int serializedLabels) {
        jBartenderInterface.setSupportsSerializedLabels(serializedLabels);
    }

    //设置打印位置1-左 2-中 3-右
    public void setStartingPosition(int position) {
        jBartenderInterface.setStartingPosition(position);
    }

}
