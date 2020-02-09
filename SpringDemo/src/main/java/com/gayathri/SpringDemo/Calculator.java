package com.gayathri.SpringDemo;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Calculator {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
	int a,b,c;
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	b=sc.nextInt();
	MathOperation op=(MathOperation)context.getBean("mathoperation");
	c=op.calculate(a,b);
	System.out.println(c);
	}
}
