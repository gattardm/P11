package org.exemple.demo;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );

        Properties  vProp = new Properties();
        InputStream vInputStream = null;

        try {
            vInputStream = App.class.getResourceAsStream("/info.properties");
            vProp.load((vInputStream));
        } finally {
            if (vInputStream != null) {vInputStream.close();}
        }

        System.out.println("Application version : " + vProp.getProperty("org.exemple.demo.version", "?"));

    }
}
