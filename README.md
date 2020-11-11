# Java-third-test
implements interface
## 计G201游慧敏2020322070 
## 实验目的
> 掌握Java中抽象类和抽象方法的定义； <br>
> 掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法；<br>
> 了解异常的使用方法，并在程序中根据输入情况做异常处理。<br>
## 实验内容
>某学校为了给学生提供勤工俭学机会，也减轻授课教师的部分压力，准许博士研究生参与课程的助教工作。<br>
>  此时，该博士研究生有双重身份：学生和助教教师。<br>
>> 1. 设计两个管理接口：学生管理接口和教师管理接口。<br>
>  学生接口必须包括缴纳学费、查学费的方法；教师接口包括发放薪水和查询薪水的方法。<br>
>> 2. 设计博士研究生类，实现上述的两个接口，<br>
>  该博士研究生应具有姓名、性别、年龄、每学期学费、每月薪水等属性。（其他属性及方法，可自行发挥）<br>
>> 3. 编写测试类，并实例化至少两名博士研究生，统计他们的年收入和学费。<br>
>  根据两者之差，算出每名博士研究生的年应纳税金额（国家最新工资纳税标准，请自行检索）。<br>
## 实验要求
>1. 在博士研究生类中实现各个接口定义的抽象方法;
>2. 对年学费和年收入进行统计，用收入减去学费，求得纳税额；
>3. 国家最新纳税标准（系数），属于某一时期的特定固定值，与实例化对象没有关系，考虑如何用static  final修饰定义。
>4. 实例化研究生类时，可采用运行时通过main方法的参数args一次性赋值，也可采用Scanner类实现运行时交互式输入。
>5. 根据输入情况，要在程序中做异常处理。
## 实验过程
>1. 创建2个接口 StuManage和TchManage ，
>>  用public abstract void setFee(double fee)定义学生缴纳学费、public  double getFee()定义学生查学费的方法；<br>
>>  用public abstract void setPay(double pay)定义教师发放薪水、public double getPay()定义教师查询薪水的方法。<br>
>2. 创建博士研究生类 DoctoralStu ，用implements实现2个接口 StuManage和TchManage ，
>>  定义姓名、性别、年龄、每学期学费、每月薪水等属性，设置姓名、性别、年龄的set、get方法（自动生成）；<br>
>>  重写前两个接口中所有方法（非抽象类实现某接口，必须重写此接口中所有方法），即setFee()、getFee()、setPay()、getPay()方法。（自动生成）<br>
>3. 创建测试类Test，
>>  用Scanner相关方法实现运行时交互式输入，即实例化博士生；<br>
>>  写出年收入和学费的计算方法以及两者之差；<br>
>>  查询国家最新工资纳税标准，写出该博士生的年应纳税金额，用税率*（年收入-学费）。<br>
>4. 异常处理，根据具体情况而定（方法多样）。
## 核心代码
```
public interface StuManage {
	public abstract void setFee(double fee);	 
	public  double getFee();	 
}
```
```
public class DoctoralStu implements StuManage,TchManage{
        private String name;
	private String sex;
	private int age;
	private double fee;
	private double pay;
```
```
        @Override
	public void setPay(double pay) {
		this.pay=pay;		
	}
	@Override
	public double getPay() {		
		return pay;
	}
```
```
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
```
## 运行结果
![img](https://p.qlogo.cn/qqmail_head/5cXMEH7OTmzhqvibzsJgjic2XWRfoh1ofqHPSUaE6xbDicxsFQJdic7qdKZuFn99tGtI/0)
## 编程感想
> 通过此次试验，我学会了什么是抽象类以及抽象方法的定义;<br>
> 理解了什么是接口以及如何定义接口、接口的实现方法；<br>
> 学习了如何使用异常，如何做异常处理。

