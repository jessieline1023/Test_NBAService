package test;

import java.sql.Date;

public class TestDataSort {
 public static void main(String args[]){
	 Date[] day =new Date[5];
	 day[0] = new Date(2006, 5,4);
	 day[1] = new Date(2006, 7,4);
	 
	 Date d = new Date(2006, 7, 4);
	 String str = String.valueOf(d);
	 bubbleSort(day);
	 
	 for(int i = 0; i< day.length;i++){
		 System.out.println(day[i]);
	 }
	 
 }



public static Date[] bubbleSort(Date[] a){
	for(int i = 0; i< a.length-1; i++){
		for(int j =0; j< i-1; j++){
			Date temp = a[j];
			a[j] =a[i];
			a[i] = temp;
		}
	}
	return null;
}
}

