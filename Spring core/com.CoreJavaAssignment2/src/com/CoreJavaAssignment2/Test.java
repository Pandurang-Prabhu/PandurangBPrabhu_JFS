package com.CoreJavaAssignment2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

public class Test {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("springQ2.xml");
        System.out.println("------list---------");
       Question question =(Question)context.getBean("Question");
       question.displayAnswerList();



        System.out.println("------Set---------");
        Question question1 =(Question)context.getBean("Question1");
        question1.displayAnswerSet();


        System.out.println("------map---------");
        Question question2 =(Question)context.getBean("Question2");
        question2.displayAnswerMap();

    }
}
