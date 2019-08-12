package com.jna.bartender;

import com.sun.jna.Library;


public interface JBartenderInterface extends Library {

    boolean initEngine();

    boolean openTemplate(String filePath);

    void closeNotSave();

    void closeSave();

    boolean print();

    int getCount();

    String getFormatName(int i);

    void setFormatValue(int i, String data);

    String getFormatValue(int i);

    boolean isSupportsIdenticalCopies();

    void setSupportsIdenticalCopies(int i);

    boolean isSupportsSerializedLabels();

    void setSupportsSerializedLabels(int i);

    void setStartingPosition(int i);

    //测试dll文件是否正常使用
    int getWord(int x, int y);
}
