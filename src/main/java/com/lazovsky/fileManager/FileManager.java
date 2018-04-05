//package com.lazovsky.fileManager;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.stereotype.Component;
//
//import java.io.File;
//
//@Component
//public class FileManager implements CommandLineRunner {
//    @Override
//    public void run(String... args) throws Exception {
//        main(args);
//    }
//
//
//    @Autowired
//    ApplicationContext context;
//
//    public static void main(String[] args) {
//        System.out.println("Hello!");
//
//
//        FileParser fileParser = (FileParser) context.getBean("fileParser");
//
//
//        File file = new File("g://java_lessons/");
//        fileParser.parseFolder(file);
//    }
//
//}
//
//
