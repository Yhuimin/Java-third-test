package bipt;

public class DoctoralStu implements StuManage,TchManage{
	private String name;
	private String sex;
	private int age;
	private double fee;
	private double pay;
	
	public DoctoralStu(String name, String sex, int age, double fee, double pay) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.fee = fee;
		this.pay = pay;
	}
	public DoctoralStu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//自动生成  重写方法（非抽象类实现某接口，必须重写此接口中所有方法）
	@Override
	public void setPay(double pay) {
		this.pay=pay;		
	}
	@Override
	public double getPay() {		
		return pay;
	}
	@Override
	public void setFee(double fee) {
		this.fee=fee;
	}
	@Override
	public double getFee() {
		return fee;
	}
	
	@Override
	public String toString() {
		return "DoctoralStu [name=" + name + ", sex=" + sex + ", age=" + age + ", fee=" + fee + ", pay=" + pay + "]";
	}
	
	
	
	
}
