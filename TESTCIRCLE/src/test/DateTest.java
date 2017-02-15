package test;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class DateTest {
	public static void main(String[] args) {
		SimpleDateFormat id = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		Date2 t = new Date2(System.currentTimeMillis());
		long time = t.time;

		System.out.println(id.format(t));
	}
}

class Date2 extends Date {
	long time;

	public Date2(long t) {
		super(t);
		// TODO Auto-generated constructor stub
//		this.time = t;
	}

}
