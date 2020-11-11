package main;

import java.util.InputMismatchException;
import java.util.Scanner;

import bipt.DoctoralStu;

public class Test {


	public static void main(String[] args) {
								
		try{
			Scanner scan = new Scanner(System.in);
			System.out.println("请输入你的姓名 ");
			String name = scan.nextLine();
			System.out.println("请输入你的性别 ");
			String sex = scan.nextLine();
			System.out.println("请输入你的年龄 ");
			String age = scan.nextLine();
			System.out.println("请输入你的学费");
			double fee = scan.nextDouble();
			System.out.println("请输入你的薪资");
			double pay = scan.nextDouble();
			//统计博士研究生的年收入
			double yearPay1=pay*12;		
			//统计博士研究生的年学费
			double yearFee1=fee*2;
			//学生的年收入-年学费
			double result1=yearPay1-yearFee1;
						
		if(result1<=25000){
			System.out.println(result1*0.2);
		}else if(result1>25000 && result1<=35000){
			System.out.println(result1*0.25);
		}
		
		}
		catch (RuntimeException e) {
			System.out.println("发生异常");
				}		
	
	
	}

}
