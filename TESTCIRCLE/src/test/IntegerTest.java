package test;

public class IntegerTest {
public static void main(String[] args){
	Integer i = new Integer(100);
	Double d = new Double("123.456");
	int j = i.intValue() + d.intValue();
	float f = i.floatValue()+d.floatValue();
	System.out.println(j);
	System.out.println(f);
	double pi =Double.parseDouble("3.1415926");
	double r = Double.valueOf("2.0").doubleValue();
	double s = pi*r*r;
	System.out.println(s);
	try{
	int k = Integer.parseInt("1.25");	
	}catch(Exception e){
		System.out.println("000数据格式不对！");
	}
	
	System.out.println(Integer.toBinaryString(123)+"B");
	
}
}
