package com.example.examplemod;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Marvin on 02.07.2016.
 */
public class LogFile {

    public static final File logFile = new File("log.txt");

    public LogFile() {
    }

    public static void writeLn(String string){
        FileWriter fw = null;
        try{
            fw = new FileWriter(logFile, true);
            fw.write(string + "\n");
        }
        catch (FileNotFoundException e1)
        {
            // die Datei existiert nicht
            System.err.println("Datei nicht gefunden: " + logFile);
        }
        catch (IOException e2)
        {
            // andere IOExceptions abfangen.
            e2.printStackTrace();
        }
        return;
    }
}
