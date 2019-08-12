package com.jna;

import com.jna.bartender.JBartender;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        JBartender jBartender = new JBartender();
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
    }
}
