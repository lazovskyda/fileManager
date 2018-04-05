package com.lazovsky.fileManager;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.io.File;


@Component
public class WorkedFile extends File {


    public WorkedFile(@Value("g://java_lessons/") String pathname) {
        super(pathname);
    }


//    @Bean
//    public WorkedFile defaultWorkedFile(@Value("g://java_lessons/") String pathname){
//        WorkedFile workedFile = new WorkedFile(pathname);
//        return workedFile;
//    }

}
