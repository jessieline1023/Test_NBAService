package test;

public class TestPerson {
	 public static void main(String args[]){
		Student student = new Student();
		student.setName("John");

	 }}

class Student extends Person{
	private String school;
	private String getSchool(){
		return school;
	}
	public void setSchool(String school){
		this.school =school;
	}
}


 class Person{
		private  String name;
		private int age;
		public void setName(String name){
			this.name =name;
		}
		
		public String getName(){
			return name;
		}
		public void setAge(int age){
			this.age = age;
		}
		public int getAge(){
			return age;
		}


}








