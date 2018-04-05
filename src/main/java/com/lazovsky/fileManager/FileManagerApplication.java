package com.lazovsky.fileManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

@SpringBootApplication
public class FileManagerApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(FileManagerApplication.class, args);


       FileParser fileParser = (FileParser) context.getBean("fileParser");
      //  File file = new File("g://java_lessons/");


        WorkedFile file = (WorkedFile) context.getBean("workedFile");

        fileParser.parseFolder(file);
    }
}
