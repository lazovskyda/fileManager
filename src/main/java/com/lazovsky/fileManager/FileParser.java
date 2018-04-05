package com.lazovsky.fileManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;

@Component
public class FileParser {

    private File directory;

    public void setDirectory(File directory) {
        this.directory = directory;
    }

    public void parseFolder(File directory) {

        if (directory.isDirectory()) {

            for (File item : directory.listFiles()) {
                if (item.isDirectory()) {
                    System.out.println("" + item.getName().toUpperCase());
                }
                if (item.isFile()) {
                    System.out.println("---- " + item.getName());
                }
            }


        }

    }
}
